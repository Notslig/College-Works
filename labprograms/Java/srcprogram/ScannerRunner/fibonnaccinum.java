// Program to find Fibonnacci number by inputting the range from start till end using java 
package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;

public class fibonnaccinum {
   public void fibonnacii() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the range for Fibonacci series:");
            System.out.println("Starting point:");
            int start = in.nextInt();
            System.out.println("End point:");
            int end = in.nextInt();
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = start; i < end; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonnaci number value till " + end + " is: " + c);
        }
    }
}
    

