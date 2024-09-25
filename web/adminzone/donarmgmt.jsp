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
        <table border=4 style="margin-top: 20%;" align="center">
            <tr><th>Name</th><th>Mob</th><th>Address</th><th>Rupees</th></tr>
     <%
     ConnectionManager cm=new ConnectionManager();
     String command="select*from donar";
     ResultSet rs=cm.getData(command);
     while(rs.next())
     {
    %>
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                 <td><%=rs.getString(3)%></td>
                  <td><%=rs.getString(4)%></td>
               
                  
            </tr>
    
    <%}%>
     </table>
    </body>
</html>
