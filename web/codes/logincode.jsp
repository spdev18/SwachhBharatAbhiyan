<%@page import="mypack.EncryptionManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="mypack.ConnectionManager"%>
<%
    ConnectionManager cm=new ConnectionManager();
String uid=request.getParameter("userid");
String Pass=request.getParameter("pass");
//EncryptionManager em=new EncryptionManager();
String command="select * from login where Email ='"+uid+"' and password='"+Pass+"'";
ResultSet rs=cm.getData(command);
//out.print(command+rs.next());
if(rs.next())
{
String Email=rs.getString(1);
String password=rs.getString(2);
String user=rs.getString(3);
if(Email.equals(uid)&&user.equals("user"))
{
    session.setAttribute("Email", uid);
    out.print("<script>alert('welcome to Swachh Bharat Abhiyan');window.location.href='../website.html'</script>");           

}
}
else
{
 out.print("<script>alert('Invalid User id');window.location.href='../userlogin.html'</script>");
}
%>