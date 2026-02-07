//Program to input two numbers and peform arthmetic operations using switch case 
package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;

public class numericswitch {
    public void arithmeticswitch() {
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the numbers:");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println("Enter the operation to be performed:");
            System.out.println("1:Addition\n2:Subtraction\n3:Multiplication\n4:Division\n5:Modulus\n6:Exit ");
            int choice = in.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Addition:" + (num1 + num2));
            case 2 -> System.out.println("Subtraction:" + (num1 - num2));
            case 3 -> System.out.println("Multiplication:" + (num1 * num2));
            case 4 -> {
                try {
                    System.out.println("Division:" + (num1 / num2));
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not defined");
                }
            }
            case 5 -> System.out.println("Modulus:" + (num1 % num2));
            case 6 -> System.out.println("Exiting...");
            default -> {
                System.out.println("Invalid choice");
                System.exit(0);
            }
        }
        }
    }
}
