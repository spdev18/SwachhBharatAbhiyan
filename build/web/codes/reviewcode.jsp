<%@page import="mypack.ConnectionManager"%>
<%
String name=request.getParameter("name");
String star=request.getParameter("hdn1");
String mobile=request.getParameter("mob");
String command="insert into review values('"+name+"','"+star+"','"+mobile+"')";
ConnectionManager cm=new ConnectionManager();
if (cm.ExecuteInsertUpdateOrDelete(command))
{
out.print("<script>alert(' Thanks For Review');window.location.href='../review.jsp'</script>");    
}
else
{
out.print("<script>alert('Your Review is not Submitted ');window.location.href='../review.jsp'</script>"); 
}
%>