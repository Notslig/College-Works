package com.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class readFileClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 9998);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in)) {

            
                System.out.print("Enter file name (or exit): ");
                String file = sc.nextLine();

                out.println(file);

                String response;
                while ((response = buffer.readLine()) != null) {
                    System.out.println(response);
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
