package CollegeWorks.Assignments.Java;

import java.util.Scanner;


public class javaStringAssignment {
    public static void main(String[] args) {

    //input class scanner object
    try (Scanner in = new Scanner(System.in)) {

        System.out.println("Enter the string: ");
        String str = in.nextLine();

        System.out.println("Enter the index number for extraction purposes");
        int index = in.nextInt();

        System.out.println("Enter the second string: ");
        String str2 = in.next(); 

        System.out.println("Enter the substring to search: ");
        String search = in.next();

        System.out.println("Modification - Enter the target substring and the replacement substring:");
        System.out.println("Target substring:");
        String target = in.next();
        System.out.println("Replacement substring:");
        String replacement = in.next();

        // String functions and declarations
        StringHandling stringHandling = new StringHandling();
        System.out.println("StringBuffer Operations:");
        stringHandling.stringBufferOperations();
        System.out.println("StringBuilder Operations:");
        stringHandling.stringBuilderOperations();

        StringLength stringLength = new StringLength();
        int length = stringLength.getStringLength(str);
        System.out.println("Length of the string: " + length);

        StringOperation stringOperation = new StringOperation();
        String concatenatedString = stringOperation.concatenateStrings(str, str2);
        System.out.println("Concatenated String: " + concatenatedString);

        CharacterExtraction characterExtraction = new CharacterExtraction();
        char extractedChar = characterExtraction.getCharacterAt(str, index);
        System.out.println("Character at index " + index + ": " + extractedChar);

        StringComparison stringComparison = new StringComparison();
        stringComparison.compareStrings(str, str2);

        StringSearchNModify stringSearchNModify = new StringSearchNModify();
        int searchIndex = stringSearchNModify.searchSubstring(str, search);
        if (searchIndex != -1) {
            System.out.println("Substring found at index: " + searchIndex);
        } else {
            System.out.println("Substring not found");
        }
        String modifiedString = stringSearchNModify.modifyString(str, target, replacement);
        System.out.println("Modified String: " + modifiedString);

        StringConversion stringConversion = new StringConversion();
        stringConversion.CaseConversion(str);

    }catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}

   
}

class StringHandling {
    
     public void stringBufferOperations() {
        StringBuffer sb = new StringBuffer("St.");

        sb.append("Aloysius University");                    
        sb.insert(12, " (Deemed to be University)");           
        sb.replace(38, 49, ""); 
        sb.delete(12, 13);                 
        sb.reverse();                               

        System.out.println(sb);                     
    }

     public void stringBuilderOperations() {
        StringBuilder sb = new StringBuilder("St.");

        sb.append("Aloysius University");                    
        sb.insert(12, " (Deemed to be University)");           
        sb.replace(38, 49, ""); 
        sb.delete(12, 13);                 
        sb.reverse();                               

        System.out.println(sb);                     
    }
    }


    class StringLength extends javaStringAssignment {
        public int getStringLength(String str) {
            return str.length();
        }
    }


    class StringOperation  extends javaStringAssignment {
        public String concatenateStrings(String str, String str2) {
            return str.concat(" " + str2); 
        }
    } 


    class CharacterExtraction extends javaStringAssignment {
        public char getCharacterAt(String str, int index) {
            if (index >= 0 && index < str.length()) {
                return str.charAt(index);
            } else {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }
    }


    class StringComparison extends javaStringAssignment {
        public void compareStrings(String str, String str2) {
            System.out.println("Comparing using equals: " + str.equals(str2));
            System.out.println("Comparing using equalsIgnoreCase: " + str.equalsIgnoreCase(str2));
            System.out.println("Comparing using compareTo: " + (str.compareTo(str2) == 0));
            
        }
    }


    class StringSearchNModify extends javaStringAssignment {
        public int searchSubstring(String str, String search) {
            return str.indexOf(search);
        }

        public String modifyString(String str, String target, String replacement) {
            return str.replace(target, replacement);
        }
    }


    class StringConversion extends javaStringAssignment {
        public int CaseConversion(String str) {
            String upperStr = str.toUpperCase();
            String lowerStr = str.toLowerCase();
            System.out.println("Uppercase: " + upperStr);
            System.out.println("Lowercase: " + lowerStr);
            return 0;
        }
    }