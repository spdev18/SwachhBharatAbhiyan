
<%@page import="mypack.ConnectionManager"%>
<%@page import="mypack.SMSSender"%>
<%
    String mobile=request.getParameter("mobile");
     String msg=request.getParameter("message");
     ConnectionManager cm=new ConnectionManager();
     String command="insert into sendsms values('"+mobile+"','"+msg+"')";
     boolean m;
m=cm.ExecuteInsertUpdateOrDelete(command);
     SMSSender ss=new SMSSender();
     boolean x=ss.SendSms(mobile, msg);
     {
     if(x==true)
     {
   out.print("<script>alert('message send successfully');window.location.href='../adminzone/Message.jsp'</script>");
     }
   else
   {
        out.print("<script>alert('message not send');window.location.href='../adminzone/Message.jsp'</script>");   
           }
     }
     
    %>