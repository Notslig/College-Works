package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class traceIP {
    public static void main(String[] args) throws IOException,InterruptedException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter IP address");
        String IP = buffer.readLine();

        boolean reachable = Runtime.getRuntime().exec("ping -n 1" +IP).waitFor()==0;
        if(reachable){
            try{
                Process process = Runtime.getRuntime().exec("tracert" + IP);
                Scanner scan = new Scanner(process.getInputStream());
                while(scan.hasNextLine())
                    System.out.println(scan.hasNextLine());
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("IP Unreachable");
        }
    }
}
