package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;

import java.util.Random;

import javax.swing.JOptionPane;


 class Cube extends Thread {
    int value;
    Cube(int n){
        value=n;
    }
    @Override
    public void run(){
        int cuberoot=value*value*value;
        JOptionPane.showMessageDialog(null,"Squared :"+cuberoot+"\n");
    }
 }

 
 class  Square extends Thread {
    int value;
    Square(int n){
        value=n;
    }
    @Override
    public void run(){
        int squared=value*value;
        JOptionPane.showMessageDialog(null,"Squared :"+squared+"\n");
    }
 }

 class Number extends Thread{
    @Override
    public void run(){
        Random r = new Random();
        
        for(int i = 0 ; i < 10 ; i++){
            int random = r.nextInt(10);
            JOptionPane.showMessageDialog(null,"Random Order"+random+"\n");

            if(random%2==0){
                Cube cube = new Cube(random);
                cube.start();
            } else {
                Square square = new Square(random);
                square.start();
            }

            try {
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 }

 public class randomThread extends Thread{
    public void randomThreadGenerator(){
        Number generate = new Number();
        generate.start();
    }
 }