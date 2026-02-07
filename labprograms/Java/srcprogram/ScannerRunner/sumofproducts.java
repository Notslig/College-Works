// Program to read two inputs having same digits and multiplying each inputs digit with other and find their SOP
package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;

public class sumofproducts {
    public void sop() {
         try (Scanner in = new Scanner(System.in)) {
             System.out.println("Enter the numbers:");
             int digit1 = in.nextInt();
             int digit2 = in.nextInt();
             int counter = 0;
             while (digit1 != 0 && digit2 != 0) {
                 //digit1%=10;
                 //digit2%=10;
                 counter = counter + (digit1 % 10) * (digit2 % 10);  //counter+=digit1*digit2;
                 digit1 /= 10;
                 digit2 /= 10;
             }
             System.out.println("Sum of products of digits: " + counter);
         }
    }
    
}
