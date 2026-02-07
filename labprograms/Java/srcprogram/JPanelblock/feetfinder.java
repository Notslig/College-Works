package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import javax.swing.JOptionPane;

public class feetfinder {
    public void feetandinch() {
         try {
            int feet1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first distance in feet:"));
            int inches1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first distance in inches:"));
            feetInput ft1 = new feetInput(feet1, inches1);

            int feet2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second distance in feet:"));
            int inches2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second distance in inches:"));
            feetInput ft2 = new feetInput(feet2, inches2);

            feetInput result = new feetInput();
            result.calculate(ft1, ft2);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numbers for feet and inches.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
   }
 }
 
class feetInput{
        int feet;
        int inches;
        feetInput(int feet,int inches){
            this.feet=feet;
            this.inches=inches;
        }
        feetInput() {
        }
        void calculate(feetInput ft1,feetInput ft2) {
            this.feet = ft1.feet + ft2.feet;
            this.inches = ft1.inches + ft2.inches;
            if (this.inches >= 12) {
                this.feet += this.inches / 12;
                this.inches = this.inches % 12;
            }
            JOptionPane.showMessageDialog(null,"Total distance: " + this.feet + " feet and " + this.inches + " inches");
        }
}