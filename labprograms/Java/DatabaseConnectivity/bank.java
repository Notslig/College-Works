import java.sql.* ;
import java.util.*;

public class bank {
    Connection con ;
    Statement st ;
    st = con.createStatement();
    Scanner sc = new Scanner(System.in);

    public void connect(){
        
        try{

            Class.forName("");
            con = DriverManager.getConnection(null);

        }catch(Exception e){

            System.out.println(e);

        }
    }

    public static void main(String args[]){
        bank b = new bank();
        int ch = Integer.parseInt(System.console().readLine("MENU: \n0. Insert\n1. Deposit\n2. Withdraw\n3. Daily Report\n4. Custom Report\n5. Exit\nEnter the choice: ")) ;
        switch(ch){
            case 0 : b.insert();break;
            case 1 : b.deposit();break;
            case 2 : b.withdraw();break;
            case 3 : b.daily();break;
            case 4 : b.customReport();break;
            case 5 : System.exit(0);break;
            default : System.out.println("Invalid choice");

        }
    }
    public void insert(){
        try {
            connect(); 
                System.out.println("Insertion of records ");
                String ac = System.console().readLine("Enter the Account Number: ");
                String name = System.console().readLine("Enter the Name: ");
                String address = System.console().readLine("Enter the Address: ");
                String actype = System.console().readLine("Enter the Account Type: ");
                Double balance = Double.parseDouble(System.console().readLine("Enter the Balance: "));

                st.executeUpdate( "INSERT INTO BANK VALUES ('"+ac+"','"+name+"','"+address+"','"+actype+"',"+balance+")") ;

        } catch (Exception e) {
            System.out.println(e);
        }

    }



    public void deposit(){
        try {
            connect(); 
                System.out.println("Deposit of records ");
                String ac = System.console().readLine("Enter the Account Number: ");
                Double amount = Double.parseDouble(System.console().readLine("Enter the Amount to Deposit: "));

                st.executeUpdate( "UPDATE BANK SET BALANCE = BALANCE + "+amount+" WHERE ACNO = '"+ac+"'") ;
                st.executeUpdate("INSERT INTO transaction (ACNO, TYPE, PARTICULARS,DATE, AMOUNT) VALUES ('"+ac+"', 'Deposit', 'Cash Deposit', CURRENT_DATE(), "+amount+")");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    public void withdraw(){
        try {
            connect(); 
                System.out.println("Withdrawal of records ");
                String ac = System.console().readLine("Enter the Account Number: ");
                Double amount = Double.parseDouble(System.console().readLine("Enter the Amount to Withdraw: "));

                int rows = st.executeUpdate( "UPDATE BANK SET BALANCE = BALANCE - "+amount+" WHERE ACNO = '"+ac+"'") ;

                if (rows  >  0 ) {
                    st.executeUpdate("INSERT INTO transaction (ACNO, TYPE, PARTICULARS,DATE, AMOUNT) VALUES ('"+ac+"', 'Withdrawal', 'Cash Withdrawal', CURRENT_DATE(), "+amount+")");
                    System.out.println("Withdrawal successful");
                } else {
                    System.out.println("Account not found or insufficient balance");
                }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void daily(){
        try {
            connect(); 
                System.out.println("Daily Report of records ");
                ResultSet rs = st.executeQuery("SELECT * FROM transaction WHERE DATE = CURRENT_DATE()");

                while(rs.next()){
                    System.out.println("Account Number: " + rs.getString("ACNO"));
                    System.out.println("Transaction Type: " + rs.getString("TYPE"));
                    System.out.println("Particulars: " + rs.getString("PARTICULARS"));
                    System.out.println("Date: " + rs.getDate("DATE"));
                    System.out.println("Amount: " + rs.getDouble("AMOUNT"));
                }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void customReport(){
        try {
            connect(); 
                System.out.println("Custom Report of records ");
                String ac = System.console().readLine("Enter the Account Number: ");
                ResultSet rs = st.executeQuery("SELECT * FROM transaction WHERE ACNO = '"+ac+"' AND DATE BETWEEN DATE_SUB(CURRENT_DATE(), INTERVAL 30 DAY) AND CURRENT_DATE()");

                while(rs.next()){
                    System.out.println("Account Number: " + rs.getString("ACNO"));
                    System.out.println("Transaction Type: " + rs.getString("TYPE"));
                    System.out.println("Particulars: " + rs.getString("PARTICULARS"));
                    System.out.println("Date: " + rs.getDate("DATE"));
                    System.out.println("Amount: " + rs.getDouble("AMOUNT"));
                }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
