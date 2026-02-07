package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;
import javax.swing.JOptionPane;
 public class salarydetails {
     public void salaryprocessor() {
         try { 
          String name= JOptionPane.showInputDialog("Enter your name:");
          if(name == null || name.isEmpty()) {
              JOptionPane.showMessageDialog(null, "Name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
              return;
          }
          double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your salary:"));
          pay employee=new pay(name,salary);
          employee.calculate();
          employee.display();
       }catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number for salary.", "Error", JOptionPane.ERROR_MESSAGE);
       } catch (NullPointerException e) {
          JOptionPane.showMessageDialog(null, "A required value was missing: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       } catch (IllegalArgumentException e) {
          JOptionPane.showMessageDialog(null, "Illegal argument: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    }
   class pay {
    String name;
    double salary, PF, DA, HRA, gross, net;
    pay(String name, double salary){
    this.name=name;
    this.salary=salary;
   }
   void calculate() {
    PF = salary * 0.12;
    DA = salary * 0.15;
    HRA = salary * 0.10;
    gross = salary + DA + HRA;
    net = gross - PF;
    }
    void display(){
        JOptionPane.showMessageDialog(null,"Name of the Employee: "+this.name+"\nSalary: "+this.salary+
        "\nPF: "+this.PF+"\nDA: "+this.DA+"\nHRA: "+this.HRA+
        "\nGross Salary: "+this.gross+"\nNet Salary: "+this.net,
         "Employee Details",JOptionPane.INFORMATION_MESSAGE);
    }
  }
 }
 
