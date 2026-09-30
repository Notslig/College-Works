package com.networking;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class oneWayClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost",9998);
        String message = "Hello Server";
        try{
            OutputStreamWriter output = new OutputStreamWriter(socket.getOutputStream());
            PrintWriter writer = new PrintWriter(output);
            writer.write(message);
            writer.flush();
            writer.close();
            output.close();
        }catch (Exception e) {
            System.out.println(e);
        }finally {
            socket.close();
        }
    }
}
