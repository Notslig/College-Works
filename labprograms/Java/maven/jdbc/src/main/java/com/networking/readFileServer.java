package com.networking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket ;

public class readFileServer {
    public static void main(String[] args)throws Exception{
        try {
            ServerSocket server = new ServerSocket(9998);
            Socket socket = server.accept();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            String request ;

                request = buffer.readLine();
                File file = new File(request);
                if(file.exists()){
                    BufferedReader read = new BufferedReader(new FileReader(file));
                    String temp;
                    while((temp = read.readLine())!=null){
                        out.println(temp);
                    }
                }
            
        } catch (Exception e) {
        }
    }
}
