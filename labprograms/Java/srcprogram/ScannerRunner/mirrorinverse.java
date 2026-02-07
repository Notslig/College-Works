//Program to check whether the array is a mirror inverse 
package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.InputMismatchException;
import java.util.Scanner;
 

public class mirrorinverse {
     public void mirrorreverse() {
        int array[]= new int[10];
        int n;
    
        System.out.println("enter the limit of numbers:");
        try (Scanner inp = new Scanner(System.in)) {
            try{
                n = inp.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Array index out of bounds. Please enter a valid size.");
                return;
            }
            
            System.out.println("Enter the array elements:");
            for(int i=0;i<n;i++){
                array[i] = inp.nextInt();
            }
            
            for(int i=0;i<n;i++){
                if(array[array[i]]!=i){
                    System.out.println("The array is not mirror inverse");
                    return;
                }
                else {
                    System.out.println("The array is  mirror inverse");
                    System.exit(0);
                }
            }
        }
      }
}

