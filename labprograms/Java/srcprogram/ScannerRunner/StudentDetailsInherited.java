package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;

public class StudentDetailsInherited {
    public void StudentInherited() {
        System.out.println("Enter the Registered Student Count no:");
    try (Scanner in = new Scanner(System.in)) {
        int n = in.nextInt();
        StudentResult student[] = new StudentResult[n];
        for(int i=0;i<n;i++){
            student[i]=new StudentResult();
            student[i].input();
            student[i].calculations();
        }
        System.out.println("Student Register:");
        for(int i=0;i<n;i++){
            student[i].Display();
        }
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
   }
}

class Student {
     String name;
     int rollno;
}

class StudentVariables extends Student {
    double m1,m2,m3;
    float total,average;
}

class StudentResult extends StudentVariables {
    Scanner in = new Scanner(System.in);
    String grade;

    void input() {
        System.out.println("Enter the Name of the Student:");
        name = in.nextLine();
        System.out.println("Enter the Roll Number of the Student:");
        rollno = in.nextInt();
        System.out.println("Enter the Marks of Subject 1:");
        m1 = in.nextDouble();
        System.out.println("Enter the Marks of Subject 2:");
        m2 = in.nextDouble();
        System.out.println("Enter the Marks of Subject 3:");
        m3 = in.nextDouble();
        System.out.println();
    }

    void calculations() {
        total = (float) (m1 + m2 + m3);
        average = total / 3;
        if (m1<=35||m2<=35||m3<=35) {
            grade = "Fail";
        } else if (average >= 85) {
            grade = "Distinction";
        } else if (average >= 65) {
            grade = "Very Good";
        } else if (average >= 45) {
            grade = "Good";
        } else {
            grade = "Pass";
        }
    }

    void Display() {
        System.out.println();
        System.out.println("FIELDNAME          |   VALUE");
        System.out.println("Name:              | " + name);
        System.out.println("Roll Number:       | " + rollno);
        System.out.println("Marks in Subject 1:| " + m1);
        System.out.println("Marks in Subject 2:| " + m2);
        System.out.println("Marks in Subject 3:| " + m3);
        System.out.println("Total Marks:       | " + total);
        System.out.println("Average Marks:     | " + average);
        System.out.println("Grade:             | " + grade);
    }
}