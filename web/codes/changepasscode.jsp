<%@page import="mypack.ConnectionManager"%>
<%
String OldPass=request.getParameter("oldpass");
String NewPass=request.getParameter("newpass");
String ConfirmPass=request.getParameter("cpass");
ConnectionManager cm=new ConnectionManager();

if(NewPass.equals(ConfirmPass))
{
    String email=session.getAttribute("Email").toString();
    String command="update login set password='"+NewPass+"' where Email='"+email+"'";
    boolean x=cm.ExecuteInsertUpdateOrDelete(command);
    if(x)
    {
    out.print("<script>alert(' Your Password is changed successfully ');window.location.href='../userlogin.html'</script>");
    }
    else
    {
    out.print("<script>alert(' Your Password is not changed ');window.location.href='../changepassword.html'</script>");
    }
}
else
{
 out.print("<script>alert(' Plese Confirm Password ');window.location.href='../changepassword.html'</script>");
}
%> 