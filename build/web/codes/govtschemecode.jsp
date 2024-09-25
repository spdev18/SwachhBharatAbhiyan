<%@page import="mypack.ConnectionManager"%>
<%
ConnectionManager cm=new ConnectionManager();
String name=request.getParameter("scheme");
String command="insert into govtscheme values('"+name+"')";
boolean x=cm.ExecuteInsertUpdateOrDelete(command);
if (x)
{
    out.print("<script>alert('Scheme Send Successfully');window.location.href='../adminzone/govtscheme.html'</script>");
}
else
{
out.print("<script>alert('Scheme Not Send');window.location.href='../adminzone/govtscheme.html'</script>");
}
%>