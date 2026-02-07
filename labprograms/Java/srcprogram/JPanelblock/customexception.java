package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import javax.swing.JOptionPane;

public class customexception {
    public void exception() {
        
        int arr[];

        try {
            JOptionPane.showMessageDialog(null,"Enter the array size:");
            int size = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array"));
            arr= new int[size];

            JOptionPane.showMessageDialog(null,"Enter "+size+" Elements");
            for(int i=0;i<size;i++){
                int element = Integer.parseInt(JOptionPane.showInputDialog("Enter the element:"));
                if(element==0){
                        throw new zeroElementException("Array element cannot be zero at index"+i+")");
                } 
            arr[i]=element;
            }


            JOptionPane.showMessageDialog(null,"\n Array elments in their indexes:");
            for(int i=0;i<size;i++){
                JOptionPane.showMessageDialog(null,"Index "+i+":"+arr[i]);
            }
        } catch (zeroElementException e) {
            JOptionPane.showMessageDialog(null,"Custom Exception caught"+e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"Array index out of bound "+e.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"General exception caught"+e.getMessage());
        }

        
    }
}

class zeroElementException extends Exception{
    public zeroElementException(String message){
        super(message);
    }
}