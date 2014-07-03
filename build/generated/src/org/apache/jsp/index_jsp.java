package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("  <title>Login - CodePen</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style2 {font-size: x-small}\n");
      out.write(".style3 {font-size: small}\n");
      out.write("-->\n");
      out.write("</style></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <html lang=\"en-US\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("\t<title>Register</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,700\">\n");
      out.write("\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"login\">\n");
      out.write("\n");
      out.write("        <form action=\"registration.jsp\" method=\"post\"/>\n");
      out.write("\n");
      out.write("            <fieldset class=\"clearfix\">\n");
      out.write("\n");
      out.write("                <p><span class=\"fontawesome-user\">Name: </span>\n");
      out.write("                  <input type=\"text\" placeholder=\"Your Name\" name=\"uname\" ></p> <!-- JS because of IE support; better: placeholder=\"Username\" -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<p><span class=\"fontawesome-user\">Email: </span>\n");
      out.write("\t\t    <input type=\"email\" placeholder=\"Your Email\" name=\"email\" ></p>\n");
      out.write("\t\t\t\t\n");
      out.write("                <p><span class=\"fontawesome-user\"><span class=\"style2\">Password</span>: </span>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" name=\"password\"></p> <!-- JS because of IE support; better: placeholder=\"Password\" -->\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<p><span class=\"fontawesome-user style3\">Gender: </span>\n");
      out.write("\t\t\t\t  <select class=\"clearfix\" name=\"gender\">\n");
      out.write("\t\t\t\t    <option selected>Male</option>\n");
      out.write("\t\t\t\t    <option>Female</option>\n");
      out.write("                  </select>\n");
      out.write("\t\t    </p>\n");
      out.write("\t\t\t\t<p><span class=\"fontawesome-user style2\">Location: </span>\n");
      out.write("\t\t\t\t  <select name=\"location\">\n");
      out.write("                    <option>Delhi</option>\n");
      out.write("                    <option>Kolkata</option>\n");
      out.write("                    <option>Mumbai</option>\n");
      out.write("                    <option>Chennai</option>\n");
      out.write("                                    </select>\n");
      out.write("\t\t        </p>\n");
      out.write("\t\t\t<p><span class=\"fontawesome-user style3\">Address: </span>\n");
      out.write("\t\t\t<textarea cols=\"20\" rows=\"5\" name=\"address\"></textarea></p>\n");
      out.write("\t\t\t\t\n");
      out.write("                <p><input type=\"submit\" value=\"Register\"></p>\n");
      out.write("\t\t\t\t<p><input type=\"reset\" class=\"right\"></p>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div> <!-- end login -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src='http://codepen.io/assets/libs/fullpage/none.js'></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
