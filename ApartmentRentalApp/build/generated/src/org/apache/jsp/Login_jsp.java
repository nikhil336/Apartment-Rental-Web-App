package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    if(request.getSession().getAttribute("um") != null)
    {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            location = \"UserPage.jsp\";\n");
      out.write("        </script>\n");
      out.write("        ");

    }
    else
    {

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Apartment Rental Application</title>\n");
      out.write("        <center><h1><b><font size=\"10pt\" face=\"Castellar\">Apartment Rental Application</font></b></h1></center>\t\n");
      out.write("        <style>\n");
      out.write("            body {      background-image: url(\"the-kelvin-apartments-exterior.jpg\");     background-color: #cccccc;     background-size: cover;     background-repeat: no-repeat;  }   \n");
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
      out.write("                .form_data {max-width: 500px;margin: 0 auto;}\n");
      out.write("                .form_data .main {      width: 100%;     padding: 20px;     float: left;     background: #f2f2f2;     opacity: 0.7;  }\n");
      out.write("                .form_data  .title {      position: absolute;     top: 0px;     right: 0;     left: 44%;     font-size: 22px;     font-weight: bold;  }\n");
      out.write("                .form_data fieldset {      position: relative;  }\n");
      out.write("                .form_data p input {      outline: 0;     background: #d3d3d3;     width: 100%;     border: 0;     margin: 0 0 15px;     padding: 15px;     box-sizing: border-box;     font-size: 14px;  }\n");
      out.write("                .form_data p { font-size: 19px;}\n");
      out.write("                .form_data  button {      padding: 20px;     width: 100%;     background: #000;     color: #fff;     font-size: 18px;     text-transform: uppercase;  }\n");
      out.write("                .outer {width: 50%; float: left;}\n");
      out.write("                .inner_content {padding: 40px;}\n");
      out.write("                .inner_content h2 {font-size: 45px;\tcolor: #eee;text-align: center;}\n");
      out.write("\n");
      out.write("                .inner_content p a {padding: 22px;color: #fff; \tfont-size: 20px; \ttext-transform: uppercase; \tborder: 0; \tbackground: #000; \tmax-width: 200px; \twidth: 100%;text-align: center; \ttext-decoration: none; \tmargin: 0 auto; \tdisplay: block; }\n");
      out.write("           </style>\n");
      out.write("    </head>\n");
      out.write("        <body>\n");
      out.write("    \n");
      out.write("        <hr size=\"10\" color=\"black\">\n");
      out.write("         <div class=\"topnav\">\n");
      out.write("             <!--<a href=\"HomePage.jsp\">HOME</a>-->\n");
      out.write("             <a class=\"active\" href=\"Login.jsp\">Home</a>\n");
      out.write("             <a href=\"SignUp.jsp\">Sign Up</a>\n");
      out.write("             <a href=\"about.jsp\">About</a>\n");
      out.write("         </div> \n");
      out.write("         <br>\n");
      out.write("         <br>\n");
      out.write("\t\t<div class=\"left outer\">\n");
      out.write("\t\t<div class=\"inner_content\">\n");
      out.write("\t\t\t<h2>Welcome To Apartment Rental App</h2>\n");
      out.write("\t\t\t<p><a href=''>Register Now</a></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<div class=\"right outer\">\t \n");
      out.write("        <form class='form_data' action=\"LoginValidation\" method=\"post\" >\n");
      out.write("        <div class=\"main\">\n");
      out.write("         <fieldset>\n");
      out.write("            <span class=\"title\">Login</span>\n");
      out.write("            <p>UserName:</p>\n");
      out.write("            <p><input type=\"text\" required name=\"UserName\" placeholder=\"abc@xyz.com\"></p>\n");
      out.write("            <p>Password:</p>\n");
      out.write("            <p><input type=\"password\" required name=\"Password\" placeholder=\"Password\"></p>\n");
      out.write("            <p><button type=\"submit\">Login</button></p>\n");
      out.write("\t\t</fieldset>\n");
      out.write("\t\t</div>   \n");
      out.write("        </form>\n");
      out.write("\t</div> \t\n");
      out.write("\t\t\n");
      out.write("    </body>\n");
      out.write("</html>\n");

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
