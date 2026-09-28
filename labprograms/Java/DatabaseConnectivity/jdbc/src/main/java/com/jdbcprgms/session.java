package com.jdbcprgms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet ("/session")
public class session extends HttpServlet{
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String name = request.getParameter("name");
            String username = request.getParameter("username");
            int qty = Integer.parseInt(request.getParameter("qty"));

            HttpSession session = request.getSession(true);
            session.setAttribute("name", name);
            session.setAttribute("username", username);
            session.setAttribute("qty", qty);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet session</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Session ID</h1>" + session.getId()+"</h1>");
            out.println("<h1>Session Created</h1>" + session.getCreationTime()+"</h1>");
            out.println("<h1>Session Last Accessed Time</h1>" + session.getLastAccessedTime()+"</h1>");
            out.println("<h1>Session Max Inactive Interval</h1>" + session.getMaxInactiveInterval()+"</h1>");
            out.println("<h1>Session Is New</h1>" + session.isNew()+"</h1>");
            out.println("<h1>Session Name</h1>" + session.getAttribute("name")+"</h1>");
            out.println("<h1>Session Username</h1>" + session.getAttribute("username")+"</h1>");
            out.println("<h1>Session Quantity</h1>" + session.getAttribute("qty")+"</h1>");

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
