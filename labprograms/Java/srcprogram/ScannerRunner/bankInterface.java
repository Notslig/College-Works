package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;



interface Bank {
    int MIN_BALANCE=1000;
    void checkBalance();
}

class Customer {
    int customerID;
    String customerName;
    String customerACType;

    void setCustomer(int id, String name, String acType) {
        customerID = id;
        customerName = name;
        customerACType = acType;
    }

    void putCustomer() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Account Type: " + customerACType);
    }
}

class Transaction extends Customer implements Bank {
    double balance;

    void setbalance(double bal) {
        balance = bal;
    }
    @Override
    public void checkBalance(){
        System.out.println("Account Balance is: " + balance);
    }

    void deposit ( double amt) {
        balance+= amt;
    }

    double withdraw (double with) {
        if(balance<MIN_BALANCE){
            System.out.println("Insufficient Balance");
            balance-=200;
        }
        else{
            balance-=with;
        }
        return balance;
    }
}

public class bankInterface {
    public void interfaceBank() {
        Transaction t = new Transaction();
       t.setCustomer(101,"Jane Doe","SB");
       t.putCustomer();
       t.setbalance(5000);
       t.checkBalance();
       t.deposit(2000);

       double temp = t.withdraw(2000);
         System.out.println("Balance after withdrawal: " + temp);
    }
}