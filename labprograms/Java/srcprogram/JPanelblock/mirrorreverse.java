package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import javax.swing.JOptionPane;

public class mirrorreverse {
    public void mirrorrev() {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements (max 10):"));
            if (n > 10 || n < 1) {
                JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 10.", "Input Limit", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int[] array = new int[10];
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter element " + (i + 1) + ":"));
            }

            boolean isMirror = true;
            for (int i = 0; i < n; i++) {
                if (array[i] < 0 || array[i] >= n) {
                    isMirror = false;
                    break;
                }
                if (array[array[i]] != i) {
                    isMirror = false;
                    break;
                }
            }

            if (isMirror) {
                JOptionPane.showMessageDialog(null, "The array *is* a mirror inverse.", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "The array is *not* a mirror inverse.", "Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter only numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Array index out of bounds. Ensure all values are between 0 and n-1.", "Index Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
