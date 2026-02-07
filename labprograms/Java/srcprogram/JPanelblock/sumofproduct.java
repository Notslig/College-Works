package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import javax.swing.JOptionPane;

public class sumofproduct {
    public void sop() {
        try {
            int digit1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
            int digit2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
            int counter = 0;

            while (digit1 != 0 && digit2 != 0) {
                counter += (digit1 % 10) * (digit2 % 10);
                digit1 /= 10;
                digit2 /= 10;
            }

            JOptionPane.showMessageDialog(null, "Sum of products of digits: " + counter,
                                          "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.",
                                          "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
