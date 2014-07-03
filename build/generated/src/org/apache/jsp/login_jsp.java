package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"UTF-8\"/>\r\n");
      out.write("\r\n");
      out.write("  <title>Login</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\" media=\"screen\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<meta charset=\"UTF-8\"/>\r\n");
      out.write("\r\n");
      out.write("\t<title>Login</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:400,700\">\r\n");
      out.write("\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"login\">\r\n");
      out.write("\r\n");
      out.write("        <form class=\"form-signin\" action=\"log_in.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("            <fieldset class=\"clearfix\">\r\n");
      out.write("\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p>&nbsp;</p>\r\n");
      out.write("                <p><span class=\"fontawesome-user\"></span><input type=\"email\" value=\"Username\" onBlur=\"if(this.value == '') this.value = 'Username'\" onFocus=\"if(this.value == 'Username') this.value = ''\" required name=\"email\"></p> \r\n");
      out.write("                <p><span class=\"fontawesome-lock\"></span><input type=\"password\"  value=\"Password\" onBlur=\"if(this.value == '') this.value = 'Password'\" onFocus=\"if(this.value == 'Password') this.value = ''\" required name=\"password\" ></p> \r\n");
      out.write("                <p><input type=\"submit\" value=\"Sign In\"></p>\r\n");
      out.write("\r\n");
      out.write("            </fieldset>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <p>Not a member? <a href=\"index.jsp\">Sign up now</a><span class=\"fontawesome-arrow-right\"></span></p>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- end login -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("  <script src='http://codepen.io/assets/libs/fullpage/none.js'></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
