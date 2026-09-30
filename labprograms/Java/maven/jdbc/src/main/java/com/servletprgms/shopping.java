package com.servletprgms;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/shopping")
public class shopping extends HttpServlet{
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String product[] = request.getParameterValues("product");
        int q1 = Integer.parseInt(request.getParameter("q1"));
        int q2 = Integer.parseInt(request.getParameter("q2"));
        int q3 = Integer.parseInt(request.getParameter("q3"));
        int q4 = Integer.parseInt(request.getParameter("q4"));
        int q[] = {q1, q2, q3, q4};

        Double amount = 0.0 ;
        Double laptop = 50000.0;
        Double mobile = 20000.0;
        Double keyboard = 2000.0;
        Double mouse = 1000.0;

        for (String item : product){
            if(item.equals("laptop"))
                amount += laptop * q[1];
            else if(item.equals("mobile"))
                amount += mobile * q[2];
            else if(item.equals("keyboard"))
                amount += keyboard * q[3];
            else if(item.equals("mouse"))
                amount += mouse * q[4];
        }


        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet shopping</title>");
            out.println("</head>");
            out.println("<body>");
            for(String item : product){
                for(int i : q ){
                    out.println("<h1>Product : "+item+" Quantity : "+i+"</h1>");
                }
            }
            out.println("<h1>Total Amount : "+amount+"</h1>");
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