//Program to access student details name and marks in 2 subjects and find their total marks and average

package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;


import java.util.Scanner;

public class studentdetails { 
    public void studentinfo() {
      try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter the student name:");
        String name = in.nextLine();
        System.out.println("Enter the register number of the student:");
        int regno = in.nextInt();

        System.out.println("Enter the marks :");
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        int total = m1 + m2;
        float avg = total / 2.0f;

        System.out.println("Student:" + name);
        System.out.println("Register number:" + regno);
        System.out.println("Marks in subject 1:" + m1);
        System.out.println("Marks in subject 2:" + m2);
        System.out.println("Total marks:" + total);
        System.out.println("Average marks:" + avg);
      }
    }
}