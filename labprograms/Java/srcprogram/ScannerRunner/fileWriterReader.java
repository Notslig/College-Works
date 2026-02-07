package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileWriterReader {
    public void fileHos() throws IOException {
        File FileName = new File("text.txt");
        //String File = "test.txt";
        Scanner in = new Scanner(System.in);
        System.out.println("Choose among a option below\n 1:Write into a file \n2:Read a file\n 3:Append existing file\n");
        int choice = in.nextInt();
        in.nextLine();
        switch(choice){
            case 1 ->{
                FileWriter writer = new FileWriter(FileName);
                writer.write("New file has been created, ");
                writer.write("few words have been inserted ");
                writer.close();
                System.out.println("Event concluded");
                break;
            }
            case 2->{
                FileReader reader = new FileReader(FileName);
                BufferedReader buffer = new BufferedReader(reader);
                String line;
                System.out.println("Reading from file \n");
                while ((line = buffer.readLine())!=null){
                    System.out.println(line);
                }
                buffer.close();
                break;
            }
            case 3->{
                FileWriter append = new FileWriter(FileName,true);
                System.out.println("Enter textfield:");
                String appendedText = in.nextLine();
                append.write("\n"+appendedText);
                append.close();
                System.out.println("Appended successfully");
                break;
            }
            default ->{
                System.out.println("Invalid choice");
            }
        }
        in.close();
    }
    
}
