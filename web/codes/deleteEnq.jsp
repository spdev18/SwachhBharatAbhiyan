<%@page import="mypack.ConnectionManager"%>
<%
String mob=request.getParameter("d");
out.print(mob);
String command="delete from enquiry where mob='"+mob+"'";
ConnectionManager cm=new ConnectionManager();
if(cm.ExecuteInsertUpdateOrDelete(command))
{
out.print("<script>alert('this enquiry data is deleted from database');window.location.href='../adminzone/enquirymgmt.jsp'</script>");
}
else
{
 out.print("<script>alert('this enquiry data is not deleted from database');window.location.href='../adminzone/enquirymgmt.jsp'</script>");   
}
%>