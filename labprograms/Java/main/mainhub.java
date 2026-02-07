package CollegeWorks.labprograms.Java.main;


import java.awt.BorderLayout;
import java.awt.Font;
import java.io.IOException;
import java.util.InputMismatchException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.EmployeeManagerInheritance;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.StudentResultInheritance;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.abstractShapes;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.arithmeticswitch;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.bankInterface;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.customexception;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.extractionString;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.feetfinder;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.fibonnacci;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.fileOperations;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.matrixaddedsubbed;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.matrixrowsums;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.mirrorreverse;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.randomThread;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.salarydetails;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.studentdetail;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.sumofproduct;
import CollegeWorks.labprograms.Java.srcprogram.JPanelblock.temperatureConverter;


public class mainhub {
     public static void main(String[] args) throws Exception {
        JFrame windowscreen = new JFrame();
        windowscreen.setSize(600, 400);
        windowscreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowscreen.setResizable(false);
        windowscreen.setTitle("NOTSLIGs Library"); 
        windowscreen.setLocationRelativeTo(null);
        windowscreen.setLayout(new BorderLayout());


        JLabel label = new JLabel("Running NOTSLIG/labprograms/Java", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        windowscreen.add(label, BorderLayout.CENTER);


        windowscreen.setVisible(true);
        
        JOptionPane.showMessageDialog(windowscreen, """
            Welcome to Program generator (of our year)
            There are programs available based on two parts as per syllabus index

            Part A: Contains various programs related to student details, matrix operations, arithmetic operations, and more.
            Part B: Contains programs related to inheritance and polymorphism.

            """);
        int menuOption = Integer.parseInt(JOptionPane.showInputDialog(windowscreen, "Enter the option:"));
         

         switch (menuOption) {
             case 1 -> partA(windowscreen);
             case 2 -> partB(windowscreen);
             default -> {
                 JOptionPane.showMessageDialog(windowscreen, "End of list");
                 System.exit(0);
             }
         }
   
  }


static void partA(JFrame windowscreen) {
        JOptionPane.showMessageDialog(windowscreen, "Welcome to Part A of the program generator");
        JOptionPane.showMessageDialog(windowscreen, "Here you can run various programs related to student details, matrix operations, arithmetic operations, and more.");
       String input = JOptionPane.showInputDialog(
            windowscreen,
            """
            Enter a number to choose your program:
            1: Student Details
            2: Sum of Products
            3: Matrix Row Sum
            4: Mirror Inverse
            5: Numeric Switch
            6: Fibonacci Number
            7: Matrix addition and subtraction
            8: Salary Check of Employee
            9: String Extraction
            10: Feet and Inches Distance
            """,
            "Select Program",
            JOptionPane.QUESTION_MESSAGE
        );
        
        try {
           JOptionPane.showMessageDialog(windowscreen, "Running the program request");
            if (input == null || input.isEmpty()) {
                JOptionPane.showMessageDialog(windowscreen, "Bye kurwa perdoyle");
                System.exit(0);
            }
           int option = Integer.parseInt(input);
            switch (option) {
                case 1 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to access student details name and marks in 2 subjects and find their total marks, average and grade them accordingly");
                    new studentdetail().studentinfo();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to read two inputs having same digits and multiplying each inputs digit with other and find their SOP");
                    new sumofproduct().sop();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to create a matrix of two dimensions and find sum of each row");
                    new matrixrowsums().matrixrow();
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to check whether the array is a mirror inverse");
                    new mirrorreverse().mirrorrev();
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to input two numbers and peform arthmetic operations using switch case");
                    new arithmeticswitch().mathswitch();
                }
                case 6 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to find Fibonnacci number by inputting the range from start till end using java ");
                    new fibonnacci().fibonnacii();
                }
                case 7 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to add and subtract two matrices");
                    new matrixaddedsubbed().matrixplusminus();
                }
                case 8 -> {
                    JOptionPane.showMessageDialog(windowscreen,"Program to check salary of employee and their pay");
                    new salarydetails().salaryprocessor();
                }
                case 9 -> {
                    JOptionPane.showMessageDialog(windowscreen,"Program to extract String elements");
                    new extractionString().stringExtraction();
                }
                case 10 -> {
                    JOptionPane.showMessageDialog(windowscreen,"Program to find distance using feet and inches");
                    new feetfinder().feetandinch();
                }
                default -> {
                    JOptionPane.showMessageDialog(windowscreen, "Not in my .$directory — please take that L and cope ");
                }
            }
        } catch (InputMismatchException e) {
           JOptionPane.showMessageDialog(windowscreen, "Dude pick from above");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(windowscreen, "it says number not skibidi");
        } catch (NullPointerException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(windowscreen, "man im deeeaaadddd" + e.getMessage());
        } finally {
            JOptionPane.showMessageDialog(windowscreen, "Thank you for using the Notslig$directory!");
        System.exit(0); 
        }
     }

static void partB(JFrame windowscreen) {
        String input = JOptionPane.showInputDialog(
            windowscreen,
            """
            Enter a number to choose your program:
            1: Employee and Manager Details (inherited)
            2: Student Result Details (inherited)
            3: Banking transactions using interface
            4: Abstarct class shapes and areas
            5: Converting Celsius to Fahrenheit and vice versa (package)
            6: Using multi threading to genrate random numbers 
            7: Custom exception handling using exception class  
            8: Create a file and perform various operationds 
            """,
            "Select Program",
            JOptionPane.QUESTION_MESSAGE
        );

        if (input == null || input.isEmpty()) {
            JOptionPane.showMessageDialog(windowscreen, "Bye kurwa perdoyle");
            System.exit(0);
        }

        try {
             JOptionPane.showMessageDialog(windowscreen, "Running the program request");
            int option = Integer.parseInt(input);
            switch (option) {
                case 1 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to access employee and manager details using inheritance");
                    EmployeeManagerInheritance empManager = new EmployeeManagerInheritance();
                    empManager.EmployeeManagerDetails();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to access student result details using inheritance");
                    StudentResultInheritance studentResult = new StudentResultInheritance();
                    studentResult.StudentResult();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to perform banking transactions using interface");
                    bankInterface bank = new bankInterface();
                    bank.performTransactions();
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to calculate areas of different shapes using abstract classes");
                    abstractShapes shapes = new abstractShapes();
                    shapes.CreateShape();
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(windowscreen, "Program to convert Celsius to Fahrenheit and vice versa using package");
                    temperatureConverter converter = new temperatureConverter();
                    converter.convertTemperatureAndSI();
                }
                case 6 ->{
                    JOptionPane.showMessageDialog(windowscreen,"Program to generate random squares and cube using threads ");
                    randomThread Random = new randomThread();
                    Random.randomThreadGenerator(); 
                }
                case 7 ->{
                    JOptionPane.showMessageDialog(windowscreen,"Program to create custom exception handler using exception class ");
                    customexception exception = new customexception();
                    exception.exception();
                }
                case 8 ->{
                    JOptionPane.showMessageDialog(windowscreen,"Program to do read and write operation on a localhost file ");
                    fileOperations file = new fileOperations();
                    try {
                        file.fileHos();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(windowscreen, "File operation error: " + ex.getMessage());
                    }
                }
                default -> {
                    JOptionPane.showMessageDialog(windowscreen, "Not in my .$directory — please take that L and cope ");
                }
            }
    } catch (InputMismatchException e) {
           JOptionPane.showMessageDialog(windowscreen, "Dude pick from above");
    } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(windowscreen, "it says number not skibidi");
    } catch (NullPointerException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(windowscreen, "man im deeeaaadddd" + e.getMessage());
    } finally {
        JOptionPane.showMessageDialog(windowscreen, "Thank you for using the Notslig$directory!");
        System.exit(0); 
    }
  }


}