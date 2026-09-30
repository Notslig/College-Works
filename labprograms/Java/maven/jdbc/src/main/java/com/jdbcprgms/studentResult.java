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
            Class.forName("org.sqlite.JDBC");
            con =  DriverManager.getConnection("jdbc:sqlite:studentResult.db");
            con.createStatement().execute("CREATE TABLE IF NOT EXISTS STUDENT (ID INT PRIMARY KEY, NAME VARCHAR(100), BATCH VARCHAR(100))");
            con.createStatement().execute("CREATE TABLE IF NOT EXISTS RESULT (ID INT PRIMARY KEY, MARKS1 INT, MARKS2 INT, MARKS3 INT, TOTAL INT, AVG DOUBLE, RESULT VARCHAR(10), FOREIGN KEY(ID) REFERENCES STUDENT(ID))");
            st = con.createStatement();
            System.out.println("Connected to database successfully");
            
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
            System.out.println("Enter the ID of student to calculate result:");
            int id = Integer.parseInt(sc.nextLine());
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
            
            st.executeUpdate("INSERT INTO RESULT VALUES ("+id+","+m1+","+m2+","+m3+","+total+","+avg+",'"+result+"')");
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static void display(){
        try{
            connect();
            
            ResultSet rs =st.executeQuery("SELECT S.ID,S.NAME,S.BATCH,R.MARKS1,R.MARKS2,R.MARKS3,R.TOTAL,R.AVG,R.RESULT FROM STUDENT S INNER JOIN RESULT R ON S.ID=R.ID");
            System.out.println("ID \t Name \t Batch \t Marks1 \t Marks2 \t Marks3 \t Total \t Average \t Result");
            if(rs.next()){
                System.out.println("ID: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Batch: "+rs.getString(3));
                System.out.println("Marks1: "+rs.getInt(4));
                System.out.println("Marks2: "+rs.getInt(5));
                System.out.println("Marks3: "+rs.getInt(6));
                System.out.println("Total: "+rs.getInt(7));
                System.out.println("Average: "+rs.getDouble(8));
                System.out.println("Result: "+rs.getString(9));
            }else{
                System.out.println("Student not found");
            }
            con.close();
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
