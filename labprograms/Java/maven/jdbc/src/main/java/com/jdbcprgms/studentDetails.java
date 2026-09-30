package com.jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class studentDetails {
    public void connect(){
        try{
            Class.forName(null);
            Connection con = DriverManager.getConnection(null);
            Statement st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void input(){}
    public void display(){}
    public static void main(String[] args){
        System.out.println("""
                MENU:-
                
                """);
    }
}
