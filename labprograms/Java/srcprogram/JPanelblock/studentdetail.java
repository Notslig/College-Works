package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;
import javax.swing.JOptionPane;

public class studentdetail {
    public void studentinfo() {
        String name = JOptionPane.showInputDialog("Enter name:");
        int m1 = Integer.parseInt(JOptionPane.showInputDialog("Enter marks 1:"));
        int m2 = Integer.parseInt(JOptionPane.showInputDialog("Enter marks 2:"));

        int total = m1 + m2;
        double avg = total / 2.0;
        String grade;

        if (avg >= 90) grade = "A+";
        else if (avg >= 75) grade = "A";
        else if (avg >= 60) grade = "B";
        else if (avg >= 40) grade = "C";
        else grade = "F";

        JOptionPane.showMessageDialog(null,
            "Name: " + name + "\n" +
            "Total Marks: " + total + "\n" +
            "Average: " + avg + "\n" +
            "Grade: " + grade
        );
    }
}
