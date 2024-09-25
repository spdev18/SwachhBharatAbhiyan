<%@page import="mypack.SMSSender"%>
<%
    String mobile=request.getParameter("mobile");
     String msg=request.getParameter("message");
     SMSSender ss=new SMSSender();
     boolean x=ss.SendSms(mobile, msg);
     {
     if(x==true)
     {
   out.print("<script>alert('message send successfully')</script>");
     }
   else
   {
        out.print("<script>alert('message not send')</script>");   
           }
     }
     
    %>