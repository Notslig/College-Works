package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import javax.swing.JOptionPane;

public class arithmeticswitch {
    public void mathswitch() {
        try {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));

            String[] options = {"Addition", "Subtraction", "Multiplication", "Division", "Modulus", "Exit"};
            int choice = JOptionPane.showOptionDialog(
                null,
                "Choose an operation:",
                "Arithmetic Operations",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
            );

            String result = "";
            switch (choice) {
                case 0:
                    result = "Addition: " + (num1 + num2);
                    break;
                case 1:
                    result = "Subtraction: " + (num1 - num2);
                    break;
                case 2:
                    result = "Multiplication: " + (num1 * num2);
                    break;
                case 3:
                    if (num2 != 0) {
                        result = "Division: " + (num1 / num2);
                    } else {
                        result = "Error: Division by zero is not allowed.";
                    }
                    break;
                case 4:
                    result = "Modulus: " + (num1 % num2);
                    break;
                case 5:
                    result = "Exited.";
                    break;
                default:
                    result = "Invalid choice.";
            }

            JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
