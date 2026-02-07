package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;

public class matrixaddsub {
 public  void matrixaddingsubing() { 
    try (Scanner in=new Scanner(System.in)){
     
     System.out.println("Enter the number of rows for first matrix:");
     int r = in.nextInt();
     System.out.println("Enter the number of columns for first matrix:");
     int c = in.nextInt();
     int matrix1[][]= new int[r][c];
     int matrix2[][]= new int[r][c];
     int sum[][]= new int[r][c];
     int diff[][]= new int[r][c];
     
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix1[i][j]=in.nextInt();
            }
        } 

        System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<r;i++)    
        {
            for(int j=0;j<c;j++)
            {
                matrix2[i][j]=in.nextInt();
            }
        }
       
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
                diff[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }


        System.out.println("The addition of the matrices is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The subtraction of the matrices is:");
        for(int i=0;i<r;i++)    
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(diff[i][j]+" ");
            }
            System.out.println();
        }
        in.close();

    }


 }
   
}
