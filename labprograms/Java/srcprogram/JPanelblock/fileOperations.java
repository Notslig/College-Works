package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class fileOperations {
    public void fileHos() throws IOException {
        File FileName = new File("text.txt");
        //String File = "test.txt";
        
        JOptionPane.showMessageDialog(null, "Choose among a option below\n 1:Write into a file \n2:Read a file\n 3:Append existing file\n");
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter the choice "));
        switch(choice){
            case 1 ->{
                FileWriter writer = new FileWriter(FileName);
                writer.write("New file has been created, ");
                writer.write("few words have been inserted ");
                writer.close();
                JOptionPane.showMessageDialog(null,"Event concluded");
                break;
            }
            case 2->{
                FileReader reader = new FileReader(FileName);
                BufferedReader buffer = new BufferedReader(reader);
                String line;
                JOptionPane.showMessageDialog(null,"Reading from file \n");
                while ((line = buffer.readLine())!=null){
                    JOptionPane.showMessageDialog(null,line);
                }
                buffer.close();
                break;
            }
            case 3->{
                FileWriter append = new FileWriter(FileName,true);
                JOptionPane.showMessageDialog(null,"Enter textfield:");
                String appendedText = new String();
                append.write("\n"+appendedText);
                append.close();
                JOptionPane.showMessageDialog(null,"Appended successfully");
                break;
            }
            default ->{
                JOptionPane.showMessageDialog(null,"Invalid choice");
            }
        }
        
    }
    
}
