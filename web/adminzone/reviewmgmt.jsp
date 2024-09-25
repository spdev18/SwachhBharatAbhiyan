<%-- 
    Document   : reviewmgmt
    Created on : Aug 8, 2019, 4:02:55 PM
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
        <table border="1" width="50%" align="center" style="margin-top: 10%">
            <tr>
                <th>Name</th>
                 <th>Star</th>
                  <th>Mobile Number</th>
            </tr>
            <%
            ConnectionManager cm=new ConnectionManager();
            String command="select*from review";
            ResultSet rs=cm.getData(command);
            while(rs.next())
            {
             
            %>
            <tr>
                <td><%=rs.getString(1)%></td>
                  <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
