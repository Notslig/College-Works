package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;
import java.util.Scanner;

public class distancefeet {
   public void  feetfinder(){

    try (Scanner in = new Scanner(System.in)) {

         System.out.println("Enter the distance in feet and inches:");
         int feet1 = in.nextInt();
         int inches1 = in.nextInt();
         feetpix ft1 = new feetpix(feet1,inches1); 

         System.out.println("Enter the distance in feet and inches to add:");
         int feet2 = in.nextInt();
         int inches2 = in.nextInt();
         feetpix ft2 = new feetpix(feet2, inches2);

         feetpix result = new feetpix();
         result.sum(ft1, ft2);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers for feet and inches.");
        }
    }
      class feetpix { 
       int feet;
       int inches;
        feetpix(int feet, int inches) {
            this.feet = feet;
            this.inches = inches;
        }
        feetpix() {
        }
        void sum(feetpix ft1, feetpix ft2) {
            this.feet = ft1.feet + ft2.feet;
            this.inches = ft1.inches + ft2.inches;
            if (this.inches >= 12) {
                this.feet+=this.inches/12;
                this.inches=this.inches%12;
            }
            System.out.println("Total distance: " + this.feet + " feet and " + this.inches + " inches");
        }
    }
    
}
