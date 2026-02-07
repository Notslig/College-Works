package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import javax.swing.JOptionPane;

public class matrixrowsums {
    public void matrixrow() {
        try {
            int r = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows in the matrix:"));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns in the matrix:"));

            int[][] matrix = new int[r][c];

    
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    String element = JOptionPane.showInputDialog("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]:");
                    matrix[i][j] = Integer.parseInt(element);
                }
            }

           
            StringBuilder matrixDisplay = new StringBuilder("Matrix:\n");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrixDisplay.append(matrix[i][j]).append(" ");
                }
                matrixDisplay.append("\n");
            }

            
            matrixDisplay.append("\nRow Sums:\n");
            for (int i = 0; i < r; i++) {
                int sum = 0;
                for (int j = 0; j < c; j++) {
                    sum += matrix[i][j];
                }
                matrixDisplay.append("Sum of row ").append(i + 1).append(": ").append(sum).append("\n");
            }

            // Display matrix and row sums
            JOptionPane.showMessageDialog(null, matrixDisplay.toString(), "Matrix Row Sum", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter only integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
