package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"css/hover.css\" rel=\"stylesheet\"/>\n");
      out.write("<script src=\"js/jquery-2.1.0.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   <script>$(document).ready(function(){$(\"#btn\").trigger(\"click\");})</script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: blue\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\" id=\"btn\" style=\"display:none\" >\n");
      out.write("  Launch demo modal\n");
      out.write("</button>\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" style=\"background:blue\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\" style=\"background:darkorange\">\n");
      out.write("     <div>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>       \n");
      out.write("\t   <div class=\"modal-footer\">\n");
      out.write("\t   <h4 class=\"modal-title\" id=\"myModalLabel\" style=\"color:white; margin-right:25%\">WELCOME TO ADMIN ZONE</h4>\n");
      out.write("       \n");
      out.write("\t     <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">OK</button>\n");
      out.write("      </div>\n");
      out.write("\t </div>    \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-1\"><img src=\"sp3.png\" class=\"img-circle\" style=\"height: 150px;width:150px;\"></div>\n");
      out.write("                <div class=\"col-sm-11\">  \n");
      out.write("                   <embed src=\"ba2.swf\" style=\"width:1135px; margin-left: 5%\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <div class=\"row\" style=\"color: white\">\n");
      out.write("            <div class=\"col-sm-3\" style=\"background:blueviolet; height:735px;\">\n");
      out.write("                <h3 style=\"margin-left: 35%; margin-top: 10%\">Admin</h3>\n");
      out.write("                <img src=\"m.jpg\" class=\"img-circle\" style=\"height: 150px;width:150px; margin-top: 17%; margin-left: 25%; \"><h4 style=\"margin-left: 25%;  cursor:pointer; color:\">Shivam Pandey</h4>\n");
      out.write("                <h3 align=\"center\" style=\"margin-top: 20%; color: \"> <u>SCHEME</u></h3>\n");
      out.write("                <br>\n");
      out.write("               <marquee scrollamount=\"10\" style=\"cursor:pointer; color:\"> <h4>||Swachhata Pakhwada Newsletter July-August 2019||</h4></marquee>\n");
      out.write("               <marquee scrollamount=\"10\" style=\"cursor:pointer; color: \"> <h4>||Assessment of the reach and value of IEC activities under SBMG(by BMGF)||</h4></marquee>\n");
      out.write("               <marquee scrollamount=\"10\" style=\"cursor:pointer; color: \"> <h4>||Summer Report-Environmental impact of SBM on Water,Soil and Food(by UNICEF)||</h4></marquee>\n");
      out.write("               <marquee scrollamount=\"10\" style=\"cursor:pointer; color: \"> <h4>||4 Plus 1 ICE Collacterals||</h4></marquee>\n");
      out.write("               <marquee scrollamount=\"10\" style=\"cursor:pointer; color: \"> <h4>||Swachh Bharat abhiyan August 2019||</h4></marquee>\n");
      out.write("               <marquee scrollamount=\"10\" style=\"cursor:pointer; color: \"><h4>||Raw Data of round2 : 2018-2019||</h4></marquee>\n");
      out.write("               <marquee scrollamount=\"10\" style=\"cursor:pointer; color: \"><h4>||Interim result : NARSS 2018-2019||</h4></marquee>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-9\" style=\"background: indigo\">\n");
      out.write("               \n");
      out.write("        <img src=\"s (10).jpeg\" class=\"img-circle\" style=\"height:130px; width:130px;cursor:pointer; \"/> \n");
      out.write("                <img src=\"s (4).png\" class=\"img-circle\" style=\"height:135px; cursor:pointer; width:135px; margin-left: 8%\"/>  \n");
      out.write("                \n");
      out.write("               <img src=\"s (2).png\" class=\"img-circle\" style=\"height:130px; cursor:pointer;width:130px; margin-left: 8%\"/>  \n");
      out.write("               \n");
      out.write("              <img src=\"s (7).png\" class=\"img-circle\" style=\"height:120px; cursor:pointer;width:120px; margin-left: 8%\"/>  \n");
      out.write("                <img src=\"s (5).png\" class=\"img-circle\" style=\"height:120px;  cursor:pointer; width:120px; margin-left: 8%\"/>  \n");
      out.write("                  <img src=\"s (8).png\" style=\"height:600px; width:997px\" class=\"img-circle\" style=\"height:100px; width: 100px; margin-left: 10%\"/>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("            <div class=\"row\" style=\"background: indigo\"><div class=\"col-sm-9\"></div></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("              <div class=\"row\" style=\"background: blue; margin-top: 1%; color: white\">\n");
      out.write("         <div class=\"col-sm-3\">\n");
      out.write("             <h4 style=\"cursor: pointer\">Terms&Conditionds</h4>\n");
      out.write("                <h4 style=\"cursor: pointer\">Archives</h4>\n");
      out.write("                   <h4 style=\"cursor: pointer\">Privacy Policy</h4>\n");
      out.write("                      <h4 style=\"cursor: pointer\">Hyperlink Policy</h4>\n");
      out.write("                      <h4 style=\"cursor: pointer\">Copyright Policy</h4>\n");
      out.write("                                            <h4 style=\"cursor: pointer\">Disclaimer</h4>\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <div class=\"col-sm-3\" style=\"margin-top:1%;margin-bottom: 1%\">\n");
      out.write("             <span class=\"fa fa-envelope\" style=\"font-size: 25px; cursor: pointer\"> Give Feedback </span>\n");
      out.write("             <br><br><span class=\"fa fa-phone\"  style=\"font-size: 25px; cursor: pointer\">  Contact Us - 1969 <br><br> @ UP, Gonda, Balharai-271123 </span>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"col-sm-3\" style=\"margin-top:0%;margin-left: 0%\">\n");
      out.write("          <h3 align=\"center\"  style=\"cursor: pointer\"><u>Related Links</u></h3> \n");
      out.write("          <h4  style=\"cursor: pointer\">||swachhbharatmission.gov.in||</h4>\n");
      out.write("          <h4  style=\"cursor: pointer\">||sbm.gov.in||</h4>\n");
      out.write("          <h4  style=\"cursor: pointer\">||swachhbharat.mygov.in||</h4>\n");
      out.write("          <h4 style=\"cursor: pointer\">||swachhbharaturban.gov.in||</h4>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <div class=\"col-sm-3\">\n");
      out.write("             <span class=\"fa fa-share-square\" style=\"font-size:35px; margin-top: 2%;cursor: pointer\"> Share It On </span>\n");
      out.write("        \n");
      out.write("      <br><br>      <span class=\"fa fa-facebook\" style=\"font-size:35px; margin-left: 23%;cursor: pointer\"> Facebook </span>\n");
      out.write("         \n");
      out.write("         <span class=\"fa fa-google\" style=\"font-size:35px; margin-left: 23%;cursor: pointer\"> Google </span>\n");
      out.write("         \n");
      out.write("         <span class=\"fa fa-twitter\" style=\"font-size:35px; margin-left: 23%;cursor: pointer\"> Twitter </span>\n");
      out.write("         \n");
      out.write("         </div>\n");
      out.write("          \n");
      out.write("     </div>\n");
      out.write("   \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("  </div>\n");
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
