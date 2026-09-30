<%@page import="java.sql.*"%>
<html%@page import="java.io.*"%>
<body%@page contentType="text/html" pageEncoding="UTF-8"%>

<!Doctype html>
<html>
    <head>
        <title>Student</title>
        <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    </head>

    <body>

    <%
        String name = request.getParameter("name");
        String reg = request.getParameter("reg");
        String course = request.getParameter("course");
        String address = request.getParameter("address");
    %>

    <table>
        <tr>
            <td>Name</td>
            <td><%= name %></td>
        </tr>

        <tr>
            <td>Reg No</td>
            <td><%= reg %></td>
        </tr>

        <tr>
            <td>Course</td>
            <td><%= course %></td>
        </tr>

        <tr>
            <td>Address</td>
            <td><%= address %></td>
        </tr>
    </table>


    </body>
</html>