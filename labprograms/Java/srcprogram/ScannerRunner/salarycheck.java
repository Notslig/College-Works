package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;


         class pay {
            String name;
            double salary,PF,DA,HRA,gross,net;
            pay(String n,double s){
                name = n;
                salary = s;
            }
            void calculate(){
                PF = salary * 0.12;
                DA = salary * 0.15;
                HRA = salary * 0.10;
                gross = salary + DA + HRA;
                net = gross - PF;
            }
            void display(){
                System.out.println("Name: " + name);
                System.out.println("Salary: " + salary);
                System.out.println("PF: " + PF);
                System.out.println("DA: " + DA);
                System.out.println("HRA: " + HRA);
                System.out.println("Gross Salary: " + gross);
                System.out.println("Net Salary: " + net);
            }
        }

        public class salarycheck { 
     public void employeeSalaryCheck() {
            try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = in.nextLine();
            System.out.print("Enter your salary: ");
            double salary = in.nextDouble();
            
            pay employee = new pay(name, salary);
            employee.calculate();
            employee.display();

            in.close();
        }
     }
}
  
