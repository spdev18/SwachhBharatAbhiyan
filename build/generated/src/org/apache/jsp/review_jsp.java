package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class review_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/hover.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/jquery-2.1.0.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script> \n");
      out.write("       <script> \n");
      out.write("        $(document).ready(function(){\n");
      out.write("    \n");
      out.write("        $(\".im\").click(function (){\n");
      out.write("          var d=$(this).attr(\"data\");\n");
      out.write("          $(\"#hdn1\").val(d);\n");
      out.write("          for(var i=1;i<=5;i++)\n");
      out.write("          {\n");
      out.write("            if(i<=d)\n");
      out.write("            {\n");
      out.write("              $(\"#img\"+i).attr(\"src\",\"star3.png\");   \n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("                $(\"#img\"+i).attr(\"src\",\"star.png\"); \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("          }\n");
      out.write("        })\n");
      out.write("             })\n");
      out.write("             </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-12\" style=\"min-height:100px;font-size:70px;text-align:center;color:blue;font-weight:bold; text-shadow: 1px 2px 2px red;background:\">\n");
      out.write("                    <marquee direction=\"right\" behavior=\"alternate\" scrollamount=\"15\">SWACHH BHARAT ABHIYAN</marquee>\n");
      out.write("                </div></div>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("             <div class=\"col-sm-3\" style=\"margin-top: 2%;margin-left: 40%; border-radius: 20px; color:blue\"> \n");
      out.write("                        <h1><u>GIVE REVIEW</u></h1></div></div>\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("             <form action=\"codes/reviewcode.jsp\"  method=\"post\">\n");
      out.write("            <div class=\"col-sm-4\" style=\"min-height: 400px;  background: blue; border: 5px solid black; margin-top: 3%; margin-left: 35%\">\n");
      out.write("                  \n");
      out.write("            name\n");
      out.write("            <input type=\"text\"name=\"name\" placeholder=\"enter name\" class=\"form-control\"><br>\n");
      out.write("             mobile\n");
      out.write("            <input type=\"number\" placeholder=\"enter mobile\" value=\"Send Review\" name=\"mob\" class=\"form-control\"/><br>\n");
      out.write("            <img src=\"star.png\" class=\"im\" id=\"img1\" data=\"1\" width=\"10%\">\n");
      out.write("            <img src=\"star.png\" class=\"im\" id=\"img2\" data=\"2\" width=\"10%\">\n");
      out.write("            <img src=\"star.png\" class=\"im\" id=\"img3\" data=\"3\" width=\"10%\">\n");
      out.write("            <img src=\"star.png\" class=\"im\" id=\"img4\" data=\"4\" width=\"10%\">\n");
      out.write("            <img src=\"star.png\" class=\"im\" id=\"img5\" data=\"5\" width=\"10%\"><br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"hidden\" name=\"hdn1\" id=\"hdn1\"/><br>\n");
      out.write("            <button class=\"btn btn-success\" type=\"submit\">Submit</button>\n");
      out.write("       </div>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
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
