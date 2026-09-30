<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<body%@page contentType="text/html" pageEncoding="UTF-8"%>

<!Doctype html>
<html>
    <head>
        <title>Student</title>
        <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    </head>

    <body>

    <%
        Connection con ;
        Statement st ;
        ResultSet rs ;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examdb", "root", "root");
            st = con.createStatement();
            rs = st.executeQuery("select * from student");

            while(rs.next()){
                String name = rs.getString("name");
                String reg = rs.getString("reg");
                String course = rs.getString("course");
                String address = rs.getString("address");
            }

    %>
            <a href="studentDetails.jsp?name= <%= name %> &reg= <%= reg %> &address= <%= address %> &course= <%= course %>">  <%= name %> </a> <br>

        }catch(Exception e){
            out.println(e);
        }

    </body>
</html>