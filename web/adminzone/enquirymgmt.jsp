<%-- 
    Document   : enquiry
    Created on : Aug 7, 2019, 1:50:56 PM
    Author     : Shivam Pandey
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.ConnectionManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border=5 style="margin-top: 20%;" align="center">
            <tr><th>Name</th><th>Mob</th><th>Email</th><th>Message</th><th>Uploadfile</th><th>Delete</th></tr>
     <%
     ConnectionManager cm=new ConnectionManager();
     String command="select*from enquiry";
     ResultSet rs=cm.getData(command);
     while(rs.next())
     {
    %>
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                 <td><%=rs.getString(3)%></td>
                  <td><%=rs.getString(4)%></td>
                   <td><%=rs.getString(5)%></td>
                  <td><a href="../codes/deleteEnq.jsp?d=<%=rs.getString(2)%>" style="color: black">Click Here</a></td>
                  
            </tr>
    
    <%}%>
     </table>
    </body>
</html>
