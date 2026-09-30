package com.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class stop_WaitSender {
    public static void main(String[] args)throws IOException {
        stop_WaitSender sws = new stop_WaitSender() ;
        sws.run();
    }

    public void run()throws IOException{
        Socket socket = new Socket("localhost",9998);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner sc = new Scanner(System.in);
        PrintStream ps = new PrintStream(socket.getOutputStream());
        System.out.println("Enter number of packets:");
        int n = sc.nextInt();

        for (int i =0; i<=n;){
            if(i==n){
                ps.println("exit");
                break;
            }
            System.out.println("packet "+i+" has been sent");
            ps.println(i);
            String ack = buffer.readLine();
            if(ack!=null){
                System.out.println("acknowledgement recieved");
                i++;
            }else{
                ps.println(i);
            }
        }
    }
}
