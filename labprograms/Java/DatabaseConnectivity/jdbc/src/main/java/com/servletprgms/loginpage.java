package com.servletprgms;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class loginpage extends HttpServlet {
    protected void  processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginpage</title>");
            out.println("</head>");
            out.println("<body>");

            String name = request.getParameter("username");
            String password = request.getParameter("password");

            if(name==null || password==null || name.trim().isEmpty() || password.trim().isEmpty()){
                out.println("<h1>Username or Password cannot be empty</h1>");
            } else {
                
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");
                    PreparedStatement ps = con.prepareStatement("SELECT password FROM users WHERE username = ?");
                    ps.setString(1, name);
                    ResultSet rs = ps.executeQuery();

                    if(rs.next()){
                        String pass = rs.getString("password");
                        if(pass.equals(password)){
                            out.println("<h1>Login Successful</h1>");
                        } else {
                            out.println("<h1>Invalid Password</h1>");
                        }
                    } else {
                        out.println("<h1>Invalid Username</h1>");
                    }

                    rs.close();
                    ps.close();
                    con.close();
                }catch(Exception e){
                    out.println("<h1>Error: " + e.getMessage() + "</h1>");
                }
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}