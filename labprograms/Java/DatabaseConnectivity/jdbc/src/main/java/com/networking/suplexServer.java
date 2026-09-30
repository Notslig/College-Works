package com.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class suplexServer {
    public static void main(String[] args)throws Exception {
        ServerSocket server = new ServerSocket(9998);
        Socket socket = server.accept();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Scanner scanner = new Scanner(System.in);
        String client, servermessage ;

        while(true){
            client = buffer.readLine();
            System.out.println("Message from client:"+client);
            if(client.equalsIgnoreCase("exit")){
                System.out.println("Client has exited the chat");
                break;
            }
            servermessage = scanner.nextLine();
            out.println(servermessage);
        }
    }
}
