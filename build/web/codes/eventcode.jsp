<%@page import="mypack.ConnectionManager"%>
<%
ConnectionManager cm=new ConnectionManager();
String name=request.getParameter("event");
String command="insert into event values('"+name+"')";
boolean x=cm.ExecuteInsertUpdateOrDelete(command);
if (x)
{
    out.print("<script>alert('Event Send Successfully');window.location.href='../adminzone/Events.html'</script>");
}
else
{
out.print("<script>alert('Event Not Send');window.location.href='../adminzone/Events.html'</script>");
}
%>