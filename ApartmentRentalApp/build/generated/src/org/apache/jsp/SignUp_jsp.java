package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Apartment Rental Application</title>\n");
      out.write("        <center><h1><b><font size=\"10pt\" face=\"Castellar\">Apartment Rental Application</font></b></h1></center>\t\n");
      out.write("        <style> \n");
      out.write("            body {\n");
      out.write("            background-image: url(\"the-kelvin-apartments-exterior.jpg\");\n");
      out.write("            background-color: #cccccc;\n");
      out.write("            }   \n");
      out.write("            \n");
      out.write("            .topnav {\n");
      out.write("                  overflow: hidden;\n");
      out.write("                  background-color: #333;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a {\n");
      out.write("                  float: left;\n");
      out.write("                  color: #f2f2f2;\n");
      out.write("                  text-align: center;\n");
      out.write("                  padding: 14px 16px;\n");
      out.write("                  text-decoration: none;\n");
      out.write("                  font-size: 17px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a:hover {\n");
      out.write("                  background-color: #ddd;\n");
      out.write("                  color: black;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav a.active {\n");
      out.write("                  background-color: #4CAF50;\n");
      out.write("                  color: white;\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <hr size=\"10\" color=\"black\">\n");
      out.write("         <div class=\"topnav\">\n");
      out.write("             <a href=\"HomePage.jsp\">HOME</a>\n");
      out.write("             <a href=\"Login.jsp\">Sign in</a>\n");
      out.write("             <a class=\"active\" href=\"SignUp.jsp\">Sign Up</a>\n");
      out.write("             <a href=\"about.jsp\">About</a>\n");
      out.write("         </div> \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <form action=\"SignUpValidation\" method=\"post\" style=\"background-color: #f2f2f2;\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Sign Up:</legend>\n");
      out.write("                Firstname:<br>\n");
      out.write("                <input type=\"text\" name=\"Firstname\" placeholder=\"Firstname\">\n");
      out.write("                <br>\n");
      out.write("                Lastname:<br>\n");
      out.write("                <input type=\"text\" name=\"Lastname\" placeholder=\"Lastname\">\n");
      out.write("                <br>\n");
      out.write("                Date of Birth:<br>\n");
      out.write("                <input type=\"text\" name=\"Date\" placeholder=\"mm-dd-yyyy\">\n");
      out.write("                <br>\n");
      out.write("                UserName:<br>\n");
      out.write("                <input type=\"text\" name=\"UserName\" placeholder=\"abc@xyz.com\">\n");
      out.write("                <br>\n");
      out.write("                Password:<br>\n");
      out.write("                <input type=\"password\" name=\"pwd\">\n");
      out.write("                <br>\n");
      out.write("                ReType Password:<br>\n");
      out.write("                <input type=\"password\" name=\"repwd\">\n");
      out.write("                <br>\n");
      out.write("                Mobile no:<br>\n");
      out.write("                <input type=\"number\" name=\"mno\" placeholder=\"XXXXXXXXXX\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"checkbox\">I have accepted the <a href=\"sign.html\">Terms and Conditions</a>\n");
      out.write("                <br>\n");
      out.write("                <button type=\"submit\">Sign Up</button>\n");
      out.write("                <button type=\"reset\">Reset</button><br>\n");
      out.write("                <br>\n");
      out.write("            </fieldset>\n");
      out.write("\t</form>           \n");
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
