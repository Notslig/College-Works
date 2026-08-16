package com.jdbcprgms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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

    static void display(){
        try{
            connect();
            System.out.println("Enter the ID of student to display:");
            int id = Integer.parseInt(sc.nextLine());
            ResultSet rs =st.executeQuery("SELECT * FROM STUDENT WHERE ID = "+id);
            if(rs.next()){
                System.out.println("ID: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Batch: "+rs.getString(3));
            }else{
                System.out.println("Student not found");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        System.out.println("""
                MENU:-
                1: Input Student Details
                2: Calculate Result
                3: Display Student Details
                4: Exit
                """);
        while(true){
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1->input();
                case 2->calculate();
                case 3->display();
                case 4->{
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default->System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
