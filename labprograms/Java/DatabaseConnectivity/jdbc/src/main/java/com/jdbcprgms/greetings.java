package com.jdbcprgms;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greetings")
public class greetings extends HttpServlet{
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            LocalTime time = LocalTime.now();
            int h = time.getHour();
            String color = request.getParameter("color");

            if(color == null || color.equals(""))
                color = "white";

            String greet ;
            if (h < 12)
                greet = "Good Morning";
            else if (h < 16)
                greet = "Good Afternoon";
            else if (h < 20)
                greet = "Good Evening";
            else
                greet = "Good Night";


            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet greetings</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style='color:"+color+"'>"+greet+"</h1>");
            out.println("</body>");
            out.println("</html>");

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}