package CollegeWorks.labprograms.Java.srcprogram.ScannerRunner;

import java.util.Random;

public class multiThreading {
    public void Threading(){
        number n = new number();
        n.start();
    }
}

class square extends Thread{
    int x;
    square(int n){
        x=n;
    }
    @Override
    public void run(){
        int sqr=x*x;
        System.out.println("Square:"+sqr+"\n");
    }
}

class cube extends Thread{
    int x;
    cube(int n){
        x=n;
    }
    @Override
    public void run(){
        int cub=x*x*x;
        System.out.println("Cube:"+cub+"\n");
    }
}

class number extends Thread{
    @Override
    public void run(){
        Random r = new Random();
        for(int i =0;i<10;i++){
            int set = r.nextInt(10);
            System.out.println("random integer:"+set);
            if(set%2==0){
                square s= new square(set);
                s.start();
            }
            else{
                cube c = new cube(set);
                c.start();
            }


            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        } 
    }
}
