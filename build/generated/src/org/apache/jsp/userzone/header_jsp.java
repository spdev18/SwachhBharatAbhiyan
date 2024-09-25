package org.apache.jsp.userzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/hover.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/jquery-2.1.0.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("#menu ul li a:hover{background-color:red; border-radius: 10px;}\n");
      out.write("#menu ul li :hover > ul{display:block;}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container-fluid\">\n");
      out.write(" <div class=\"row\">\n");
      out.write("<div class=\"col-m-12\" style=\"min-height:100px;font-size:70px;text-align:center;color:navy;font-weight:bold; text-shadow: 1px 2px 2px red;background:blue;color: skyblue\">SWACHH BHARAT ABHIYAN\n");
      out.write("</div></div>\n");
      out.write("     <div class=\"row\" style=\"margin-top:1%\">\n");
      out.write("        <nav class=\"navbar navbar-default\" style=\"background: blue; border-radius: 20px;\">\n");
      out.write("            <div class=\"container-fluid\"  id=\"menu\">\n");
      out.write("       <ul  class=\"nav navbar-nav\">\n");
      out.write("           <li><a href=\"#\" Style=\"color:white\"><span class=\"fa fa-home\" style=\"font-size: 50px; \"></span></a></li> \n");
      out.write("           <li><a href=\"About us.html\" Style=\"color:white\">ABOUT US</a></li> \n");
      out.write("        <li>\n");
      out.write("          <a href=\"#\"  style=\"color: white\" data-toggle=\"dropdown\">LOGIN</a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"userlogin.html\">USER LOGIN</a></li>\n");
      out.write("            <li><a href=\"adminlogin.html\">ADMIN LOGIN</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("          <li><a href=\"Enquiry.html\" Style=\"color:white\">MEMBERSHIP</a></li>\n");
      out.write("            <li><a href=\"#\" Style=\"color:white\" data-toggle=\"dropdown\">SETTING</a>\n");
      out.write("             <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"changepassword.html\">CHANGE PASSWORD</a></li>\n");
      out.write("            <li><a href=\"logout.html\">LOGOUT</a></li>\n");
      out.write("          </ul>\n");
      out.write("                <li><a href=\"Registration.html\" Style=\"color:white\">REGISTRATION</a></li>\n");
      out.write("            </li> \n");
      out.write("      </ul>\n");
      out.write("            </div>\n");
      out.write("            </nav>\n");
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
