//Program to create a matrix of two dimensions and find sum of each row
package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;

public class matrixrowsum {
    public void matrixrow() {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the number of rows of the matrix:");
            int r = in.nextInt();
            System.out.println("Enter the number of columns of the matrix:");
            int c = in.nextInt();
            int matrix[][] = new int[r][c];

            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }

            System.out.println("The elements of the matrix are:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }

            System.out.println(" \n ");
            for (int i = 0; i < r; i++) {
                int sum = 0;
                for (int j = 0; j < c; j++) {
                    sum = sum + matrix[i][j];
                }
                System.out.println("Sum of row " + (i + 1) + " is " + sum);
            }
        }
    }
}


