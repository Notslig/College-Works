package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;


import javax.swing.JOptionPane;

public class extractionString {
     public void stringExtraction() {
         try { 
             String str = JOptionPane.showInputDialog("Enter a string");
              if (str == null || str.isEmpty()){
                   JOptionPane.showMessageDialog(null,"Life tuff vro perdoyle, should have inserted something");
              }
              int start = Integer.parseInt(JOptionPane.showInputDialog("Enter the starting extraction point"));
              int end = Integer.parseInt(JOptionPane.showInputDialog("Enter the ending extraction point"));
              StringBuilder extracted = new StringBuilder();
                    for (int i = start; i < end; i++) {
                         char ch = str.charAt(i);
                         if (Character.isLetter(ch)) {
                         extracted.append(ch);
                         }
                    }
                    JOptionPane.showMessageDialog(null, "Extracted String: " + extracted.toString());

         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage());
         }
      }
     }   