package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;

public class exceptionHandler {
    public void exceptionHandling() {
        
        int arr[];

        try (Scanner in = new Scanner(System.in)){
            System.out.println("Enter the array size:");
            int size = in.nextInt();
            arr= new int[size];

            System.out.println("Enter "+size+" Elements");
            for(int i=0;i<size;i++){
                int element = in.nextInt();
                if(element==0){
                        throw new zeroElementException("Array element cannot be zero at index"+i+")");
                } 
            arr[i]=element;
            }


            System.out.println("\n Array elments in their indexes:");
            for(int i=0;i<size;i++){
                System.out.println("Index "+i+":"+arr[i]);
            }

            in.close();
        } catch (zeroElementException e) {
            System.out.println("Custom Exception caught"+e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound "+e.getMessage());
        } catch (Exception e){
            System.out.println("General exception caught"+e.getMessage());
        }

        
    }
}

class zeroElementException extends Exception{
    public zeroElementException(String message){
        super(message);
    }
}