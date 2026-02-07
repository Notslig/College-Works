package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

//IMPORT THE CLASSES
//import CollegeWorks.labprograms.Java.srcprogram.temperature.celcius;
//import CollegeWorks.labprograms.Java.srcprogram.temperature.Fahrenheit;
//import CollegeWorks.labprograms.Java.srcprogram.simpleInterest.simpleInterest;

import java.util.Scanner;


public class temperatureAndSimpleInterest {
    public void packageTempAndSI() {

        try (Scanner in = new Scanner(System.in)) {
        celcius c = new celcius();
        Fahrenheit f = new Fahrenheit();
        simpleInterest si = new simpleInterest();

        System.out.print("Enter temperature in Celcius: ");
        double celsius = in.nextDouble();

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = in.nextDouble();

        System.out.print("Enter Principal amount: ");
        double principal = in.nextDouble();
        System.out.print("Enter Rate of interest: ");
        double rate = in.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = in.nextDouble();

        c.converter(celsius);
        f.converter(fahrenheit);
        si.calculate(principal, rate, time);

        System.out.println(celsius + " degree Celcius is equal to " + c.converter(celsius) + " degree Fahrenheit.");
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + f.converter(fahrenheit) + " degree Celcius.");
        System.out.println("Simple Interest for Principal amount " + principal + " at rate " + rate + "% for " + time + " years is: " + si.calculate(principal, rate, time));

        in.close();
        } catch (Exception e) {
        System.out.println("Invalid input. Please enter numeric values only.");
        }
    }
}
