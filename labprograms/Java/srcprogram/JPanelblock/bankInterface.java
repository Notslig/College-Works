package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;
import javax.swing.JOptionPane;

interface Bank {
    int MIN_BALANCE = 1000;
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
        JOptionPane.showMessageDialog(null, "Customer ID: " + customerID + "\nCustomer Name: " + customerName + "\nCustomer Account Type: " + customerACType);
    }
}

class Transaction extends Customer implements Bank {
    double balance;

    void setbalance(double bal) {
        balance = bal;
    }
    @Override
    public void checkBalance(){
        JOptionPane.showMessageDialog(null, "Current Balance: " + balance);
    }

    void deposit ( double amt) {
        balance = balance + amt;
    }

    double withdraw (double with) {
        if(balance < MIN_BALANCE){
           JOptionPane.showMessageDialog(null, "Insufficient Balance");
            balance -= 200;
        }
        else{
            balance = balance - with;
        }
        return balance;
    }
}

public class bankInterface {
    public void performTransactions() {
        Transaction t = new Transaction();
       t.setCustomer(101,"Jane Doe","SB");
       t.putCustomer();
       t.setbalance(5000);
       t.checkBalance();
       t.deposit(3000);

       //double temp = t.withdraw(2000);
         JOptionPane.showMessageDialog(null, "Balance after withdrawal: " + t.withdraw(2000));
    }
}