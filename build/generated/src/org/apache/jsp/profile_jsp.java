package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("#ProfilePage\n");
      out.write("{\n");
      out.write("    /* Move it off the top of the page, then centre it horizontally */\n");
      out.write("    margin: 50px auto;\n");
      out.write("    width: 635px;\n");
      out.write("\n");
      out.write("/* For visibility. Delete me */\n");
      out.write("border: 1px solid white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#LeftCol\n");
      out.write("{\n");
      out.write("    /* Move it to the left */\n");
      out.write("    float: left;\n");
      out.write("\n");
      out.write("    width: 200px;\n");
      out.write("    text-align: center;\n");
      out.write("\n");
      out.write("    /* Move it away from the content */\n");
      out.write("    margin-right: 20px;\n");
      out.write("\n");
      out.write("/* For visibility. Delete me */\n");
      out.write("border: 1px solid white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Photo\n");
      out.write("{\n");
      out.write("    /* Width and height of photo container */\n");
      out.write("    width: 200px;\n");
      out.write("    height: 200px;\n");
      out.write("\n");
      out.write("/* For visibility. Delete me */\n");
      out.write("border: 1px solid #3b4148;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#PhotoOptions\n");
      out.write("{\n");
      out.write("    text-align: center;\n");
      out.write("    width: 200px;\n");
      out.write("\n");
      out.write("/* For visibility. Delete me */\n");
      out.write("border: 1px solid white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Info\n");
      out.write("{\n");
      out.write("    width: 400px;\n");
      out.write("    text-align: center;\n");
      out.write("\n");
      out.write("    /* Move it to the right */\n");
      out.write("    float: right;\n");
      out.write("\n");
      out.write("/* For visibility. Delete me */\n");
      out.write("/*border: 1px solid white;*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Info strong\n");
      out.write("{\n");
      out.write("    /* Give it a width */\n");
      out.write("    display: inline-block;\n");
      out.write("    width: 100px;\n");
      out.write("\n");
      out.write("/* For visibility. Delete me */\n");
      out.write("/*border: 1px solid #3b4148;*/\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Info span\n");
      out.write("{\n");
      out.write("    /* Give it a width */\n");
      out.write("    display: inline-block;\n");
      out.write("    width: 250px;\n");
      out.write("    color: whitesmoke;\n");
      out.write("\n");
      out.write("/* For visibility. Delete me */\n");
      out.write("border: 1px solid #3b4148;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("        \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<div id=\"ProfilePage\">\n");
      out.write("    <div id=\"LeftCol\">\n");
      out.write("        <div id=\"Photo\"></div>\n");
      out.write("        <div id=\"ProfileOptions\">\n");
      out.write("        Profile Picture\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"Info\">\n");
      out.write("        <p>\n");
      out.write("            <strong>Name:</strong>\n");
      out.write("            <span> </span>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <strong>Email:</strong>\n");
      out.write("            <span> </span>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <strong>Gender:</strong>\n");
      out.write("            <span> </span>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <strong>Location:</strong>\n");
      out.write("            <span> </span>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("            <strong>Address:</strong>\n");
      out.write("            <span> </span>\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Needed because other elements inside Profile Page have floats -->\n");
      out.write("    <div style=\"clear:both\"></div>\n");
      out.write("</div>\n");
      out.write("        ");

String email=(String)session.getAttribute("email");
Class.forName("oracle.jdbc.driver.OracleDriver"); 
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","aezakmi");
PreparedStatement Ps=con.prepareStatement("select * from registration1 where email=?");
Ps.setString(1,email);
ResultSet rs = Ps.executeQuery();
while(rs.next())
{
String p1=rs.getString(1);
String p2=rs.getString(2);
<%=p1
      out.write('\n');
      out.print(p2);
      out.write("\n");
      out.write("}\n");
      out.write("    %>\n");
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
