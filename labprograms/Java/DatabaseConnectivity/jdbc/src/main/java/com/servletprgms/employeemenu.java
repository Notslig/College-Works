package com.servletprgms;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class employeemenu extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String button = request.getParameter("button");

            if(button.equals("Add"))
                response.sendRedirect("addemployee.html");
            else if(button.equals("Delete"))
                response.sendRedirect("deleteemployee.html");
            else if(button.equals("view")){
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeworks", "root", "root");
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM employee");

                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Employee Menu</title>");
                    out.println("</head>");
                    out.println("<body>");
                    
                    out.println(
                        """
                        <table border='1' align='center'>
                            <tr>
                                <th>Employee ID</th>
                                <th>Employee Name</th>
                                <th>Employee Salary</th>
                                <th>Employee Department</th>
                            </tr>
                        """
                    );

                    while(rs.next()){
                        out.println("<tr>");
                        out.println("<td>" + rs.getInt("empid") + "</td>");
                        out.println("<td>" + rs.getString("empname") + "</td>");
                        out.println("<td>" + rs.getDouble("empsalary") + "</td>");
                        out.println("<td>" + rs.getString("empdept") + "</td>");
                        out.println("</tr>");
                    }

                    out.println("</table>");
                    out.println("<a href='index.html'>Back to Home</a>");
                    out.println("</body>");
                    out.println("</html>");
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
            }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
            }
}
