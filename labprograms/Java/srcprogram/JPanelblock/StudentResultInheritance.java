package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import javax.swing.JOptionPane;

public class StudentResultInheritance {
    public void StudentResult() {
 
    try {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of students:"));
        StudentResult student[] = new StudentResult[n];
        for(int i=0;i<n;i++){
            student[i]=new StudentResult();
            student[i].input();
            student[i].calculations();
        }
        JOptionPane.showMessageDialog(null,"Student Register:");
        for(int i=0;i<n;i++){
            student[i].Display();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"An error occurred: " + e.getMessage());
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
    String grade;

    void input() {
        name = JOptionPane.showInputDialog(null,"Enter the Name of the Student:");
        rollno = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Roll Number of the Student:"));
        m1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Marks of Subject 1:"));
        m2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Marks of Subject 2:"));
        m3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Marks of Subject 3:"));
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
        String message = 
        "FIELDNAME          |   VALUE"+"\n|"+
        "Name:              | " + name+"\n|"+
        "Roll Number:       | " + rollno+"\n|"+
        "Marks in Subject 1:| " + m1+"\n|"+
        "Marks in Subject 2:| " + m2+"\n|"+
        "Marks in Subject 3:| " + m3+"\n|"+
        "Total Marks:       | " + total+"\n|"+
        "Average Marks:     | " + average+"\n|"+
        "Grade:             | " + grade+"\n|";

        JOptionPane.showMessageDialog(null, message, "Student Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
  
