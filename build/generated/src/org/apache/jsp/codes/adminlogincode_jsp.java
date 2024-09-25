package org.apache.jsp.codes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mypack.EncryptionManager;
import java.sql.ResultSet;
import mypack.ConnectionManager;

public final class adminlogincode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

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
    out.print("<script>alert('welcome to next zone');window.location.href='../adminzone/dashboard.jsp'</script>");           

}
}
else
{
 out.print("<script>alert('Invalid User id');window.location.href='../adminlogin.html'</script>");
}

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
