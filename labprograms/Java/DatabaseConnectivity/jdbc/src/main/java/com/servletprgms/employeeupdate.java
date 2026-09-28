package com.servletprgms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class employeeupdate extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String button = request.getParameter("update");

            if (button.equals("insert")){
                int eno = Integer.parseInt(request.getParameter("empid"));
                String ename = request.getParameter("empname");
                double esal = Double.parseDouble(request.getParameter("empsalary"));
                String edept = request.getParameter("empdept");

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeworks", "root", "root");
                    Statement st = con.createStatement();
                    int rs = st.executeUpdate("insert into employee values(" + eno + ",'" + ename + "'," + esal + ",'" + edept + "')");
                    if (rs > 0) {
                        out.println("<h1>Record inserted successfully</h1>");
                    } else {
                        out.println("<h1>Record insertion failed</h1>");
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
            }else if (button.equals("delete")){
                int eno = Integer.parseInt(request.getParameter("empid"));

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/collegeworks", "root", "root");
                    Statement st = con.createStatement();
                    int rs = st.executeUpdate("delete from employee where empid=" + eno);
                    if (rs > 0) {
                        out.println("<h1>Record deleted successfully</h1>");
                    } else {
                        out.println("<h1>Record deletion failed</h1>");
                    }
                } catch (ClassNotFoundException | SQLException e) {
                    e.printStackTrace();
                }
            }else{
                out.println("<h1>Invalid action</h1>");
                out.println("<a href='index.html'>Back to Menu</a>");
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
