
package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

public class EmployeeManagerSalary {
     public void EmployeeManagerPay()  {
        
        EmployeeDetails emp = new EmployeeDetails();
        System.out.println("\n Employee Details:");
        emp.Name = "John Doe";
        emp.Salary = 75000.0;
        emp.Age = 30;
        emp.Place = "New York";
        emp.PNO = "123-456-7890";
        emp.Specializations = "Software Development, Project Management";
        emp.display();
      
        ManagerDetails mgr = new ManagerDetails();
        System.out.println("\n Manager Details:");
        mgr.Name = "Jane Smith";
        mgr.Salary = 90000.0;
        mgr.Age = 40;
        mgr.Place = "Los Angeles";
        mgr.PNO = "098-765-4321";
        mgr.Department = "Human Resources";
        mgr.display();
    }
}
class employee {
     public String Name;
     public Double Salary;
     public int Age;
     public String Place;
     public String PNO;
}
class EmployeeDetails extends employee {
     String Specializations;
      void display() { 
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Age: " + Age);
        System.out.println("Place: " + Place);
        System.out.println("Phone Number: " + PNO);
        System.out.println("Specializations: " + Specializations);
    }
 }
 class ManagerDetails extends employee {
     String Department;
      void display() { 
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Age: " + Age);
        System.out.println("Place: " + Place);
        System.out.println("Phone Number: " + PNO);
        System.out.println("Department: " + Department);
    }
 }