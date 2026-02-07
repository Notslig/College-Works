package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Scanner;

public class substringfunc {
    public void  ExtractString() {
        try (Scanner in = new Scanner(System.in)) {
        
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        System.out.println("Enter the Extraction point and length of the string");
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println("Extracted String:" + str.substring( start - 1, start + (end -1)));

     }
    }
    
}
