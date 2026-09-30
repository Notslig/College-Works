package com.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class oneWayServer {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(9998);
        Socket socket = server.accept();
        String message ;
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while((message= buffer.readLine())!=null){
                System.out.println("Message from client: "+message);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            socket.close();
            server.close();
        }
    }
    
}
