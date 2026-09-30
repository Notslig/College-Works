package com.networking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class stop_WaitReciever {
    public static void main(String[] args) throws Exception{
        stop_WaitReciever swr = new stop_WaitReciever();
        swr.run();
    }

    public void run() throws IOException,InterruptedException{
        ServerSocket server = new ServerSocket(9998);
        Socket socket = server.accept();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintStream ps = new PrintStream(socket.getOutputStream());
        String message ="any";
        String ex = "exit";

        while(message.compareTo(ex)!=0){
            Thread.sleep(1000);
            message = buffer.readLine();
            if(message.compareTo(ex)==0)
                break;
            System.out.println("recieved "+message);
            Thread.sleep(500);
            ps.println("recieved");
        }
        System.out.println("all packets recieved");

    }
}
