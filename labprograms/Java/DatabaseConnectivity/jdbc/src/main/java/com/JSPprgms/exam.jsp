<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!Doctype html>
<html>
    <head>
        <title>Exam</title>
        <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
    </head>

    <body>

        <%
            public static Connection con ;
            public static Statement st ;
            public static ResultSet rs ;
            public static String name, answer, correct ;
            public static int score ;

            void connect(){
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examdb", "root", "root");
                    st = con.createStatement();
                    rs = st.executeQuery("select * from exam");
                }catch(Exception e){
                    out.println(e);
                }
            }

            void close(){
                try{
                    st.close();
                    rs.close();
                    con.close();
                }catch(Exception e){
                    out.println(e);
                }
            }

        %>

        <%
            name = request.getParameter("name");

            if (con==null){
                score = 0;
                connect();

                %> <h2>Welcome to exam </h2> <%
            }else{
                correct = rs.getString(7).trim();
                answer = request.getParameter("answer");
                if (answer.equals(correct)){
                    score++;
                }
            }

            out.println("<table border='1' align='center'>");
        
            try{
                if (rs.next()){

        %>
                    <form method="post" action="">
                        <tr>
                            <td><%= rs.getString(1) %></td>
                            <td><%= rs.getString(2) %></td>
                        </tr>

                        <tr>
                            <td><input type="radio" name="answer" value="1" ></td>
                            <td><%= rs.getString(3) %></td>
                        </tr>
                        <tr>
                            <td><input type="radio" name="answer" value="2" ></td>
                            <td><%= rs.getString(4) %></td>
                        </tr>
                        <tr>
                            <td><input type="radio" name="answer" value="3" ></td>
                            <td><%= rs.getString(5) %></td>
                        </tr>
                        <tr>
                            <td><input type="radio" name="answer" value="4" ></td>
                            <td><%= rs.getString(6) %></td>
                        </tr>

                        <tr>
                            <td colspan="2" align="center"><input type="submit" value="Next"></td>
                        </tr>
                    </form>

        <%
                }else{
            
                    out.println("<h2>Exam completed</h2>");
                    out.println("<h3>Your score is : " + score + "</h3>");
                    close();
                }

                out.println("</table>");

            }catch(Exception e){
                out.println(e);
            }
        %>
    </body>
</html>