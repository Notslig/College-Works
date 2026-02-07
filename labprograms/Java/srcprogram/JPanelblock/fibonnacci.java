package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;


import javax.swing.JOptionPane;

public class fibonnacci{
    public void fibonnacii() {
        try {
            int start = Integer.parseInt(JOptionPane.showInputDialog("Enter the starting point for Fibonacci series:"));
            int end = Integer.parseInt(JOptionPane.showInputDialog("Enter the end point for Fibonacci series:"));

            int a = 0, b = 1, c = 0;

            for (int i = start; i < end; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            JOptionPane.showMessageDialog(null,
                "Fibonacci number value at end = " + end + " is: " + c,
                "Fibonacci Result",
                JOptionPane.INFORMATION_MESSAGE
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "Invalid input. Please enter valid numbers.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
