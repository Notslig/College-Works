package com.jdbcprgms;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class studentResult {
    static Connection con ;
    static Scanner sc = new Scanner(System.in);
    static Statement st;
    static void connect(){
        try{
            Class.forName("");
            con =  DriverManager.getConnection(null);
            st = con.createStatement();
        }catch(Exception e ){
            e.printStackTrace();
        }
    }

    static void input(){
        try{
            connect();
            System.out.println("Enter the ID, Name and Batch:");
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            String batch = sc.nextLine();
            st.executeUpdate("INSERT INTO STUDENT VALUES ("+id+",'"+name+"','"+batch+"')");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static void calculate(){
        try{
            connect();
            System.out.println("Enter marks of three subjects:");
            int m1 = Integer.parseInt(sc.nextLine());
            int m2 = Integer.parseInt(sc.nextLine());
            int m3 = Integer.parseInt(sc.nextLine());
            int total = m1 + m2 + m3 ;
            double avg = total/3.0;

            String result ;
            if (avg <85)
                result = "Pass";
            else
                result = "Fail";
            System.out.println("Total marks: "+total);
            System.out.println("Average marks: "+avg);
            System.out.println("Result: "+result);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
