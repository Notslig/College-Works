package com.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class suplexClient {
    public static void main(String[] args) throws Exception{
        try{
            Socket socket = new Socket("localhost",9998);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            Scanner scanner = new Scanner(System.in);
            String  client, servermessage;

            while(true){
                client = scanner.nextLine();
                out.println(client);
                servermessage = buffer.readLine();
                if(servermessage.equalsIgnoreCase("exit")){
                    System.out.println("Server has exited the chat");
                    break;
                }
                System.out.println("Message from server:"+servermessage);
            }
            buffer.close();
            out.close();
            socket.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
