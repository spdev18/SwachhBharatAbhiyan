package org.apache.jsp.codes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.ConnectionManager;

public final class changepasscode_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

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

      out.write(' ');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
