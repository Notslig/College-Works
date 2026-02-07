package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;





//IMPORT THE CLASSES
// Update these imports to match the actual package and class names.
// For example, if the classes are in 'CollegeWorks.labprograms.Java.srcprogram.ScannerRunner', ensure that package exists and the class names are correct.
// If the classes are in the same package, you can remove the package prefix.

import javax.swing.JOptionPane;

import CollegeWorks.labprograms.Java.srcprogram.ScannerRunner.Fahrenheit;
import CollegeWorks.labprograms.Java.srcprogram.ScannerRunner.celcius;
import CollegeWorks.labprograms.Java.srcprogram.ScannerRunner.simpleInterest;


public class temperatureConverter {
    public void convertTemperatureAndSI() {

        try {
        celcius c = new celcius();
        Fahrenheit f = new Fahrenheit();
        simpleInterest si = new simpleInterest();

        
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature in Celsius: "));

        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature in Fahrenheit: "));
        

        int principal = Integer.parseInt(JOptionPane.showInputDialog("Enter Principal amount: "));
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter Rate of interest: "));
        double time = Double.parseDouble(JOptionPane.showInputDialog("Enter Time (in years: "));

        JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit: " + c.converter(celsius) + "°F");
        JOptionPane.showMessageDialog(null, "Temperature in Celsius: " + f.converter(fahrenheit) + "°C");
        JOptionPane.showMessageDialog(null, "Simple Interest: " + si.calculate(principal,rate,time));

        
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
        }
    }
}

