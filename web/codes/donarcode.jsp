<%@page import="mypack.ConnectionManager"%>
<%
ConnectionManager cm=new ConnectionManager();
String name=request.getParameter("name");
String mobile=request.getParameter("mob");
String address=request.getParameter("address");
String rupees=request.getParameter("rupee");
String command="insert into donar values('"+name+"','"+mobile+"','"+address+"','"+rupees+"')";
boolean x=cm.ExecuteInsertUpdateOrDelete(command);
if (x)
{
    out.print("<script>alert(' Thank for donation');window.location.href='../donar.html'</script>");
}
else
{
out.print("<script>alert(' donation not completed ');window.location.href='../donar.html'</script>");
}
%>