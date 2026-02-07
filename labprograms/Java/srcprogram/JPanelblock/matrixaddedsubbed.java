package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import javax.swing.JOptionPane;
 

public class matrixaddedsubbed {
 public  void matrixplusminus() { 
  try{
     int r = Integer.parseInt(JOptionPane.showInputDialog("Enter the Row of the matrix"));
     int c = Integer.parseInt(JOptionPane.showInputDialog("Enter the Columns of the matrix"));
     int matrix1[][]= new int[r][c];
     int matrix2[][]= new int[r][c];
     int sum[][]= new int[r][c];
     int diff[][]= new int[r][c];
     
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter the values of the first matrix[" + (i+1) + "][" + (j+1) + "]"));
            }
        } 


        for(int i=0;i<r;i++)    
        {
            for(int j=0;j<c;j++)
            {
                matrix2[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Enter the values of the second matrix[" + (i+1) + "][" + (j+1) + "]"));
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


    StringBuilder result1 = new StringBuilder("Addition of matrices \n");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                result1.append(sum[i][j]).append(" ");
            }
            result1.append("\n");
        }

    StringBuilder result2 = new StringBuilder("Subtraction of matrices \n");
        for(int i=0;i<r;i++)    
        {
            for(int j=0;j<c;j++)
            {
                result2.append(diff[i][j]).append(" ");
            }
            result2.append("\n");
        }

    JOptionPane.showMessageDialog(null, result1.toString() + "\n" + result2.toString(), "Matrix Addition and Subtraction", JOptionPane.INFORMATION_MESSAGE);
   } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter only integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
   }
  }
 }