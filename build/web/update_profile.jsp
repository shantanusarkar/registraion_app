<%-- 
    Document   : registration
    Created on : Jun 24, 2014, 3:35:06 PM
    Author     : Shantanu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>update</title>
    </head>
    <body>
        <%
String email=(String)request.getSession().getAttribute("emailid");
Class.forName("oracle.jdbc.driver.OracleDriver"); 
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","aezakmi");
PreparedStatement Ps=con.prepareStatement("update registration1 set username=?,gender=?,location=?,address=? where email="+email+"");
Ps.setString(1,email);
     
String uname =request.getParameter("uname");
String gender =request.getParameter("gender");
String location =request.getParameter("location");
String address =request.getParameter("address");

Ps.setString(1, uname);
Ps.setString(2, gender);
Ps.setString(3, location);
Ps.setString(4, address);
int i = Ps.executeUpdate();
if(i>0)
{
    response.sendRedirect("profile.jsp");
}
%>
    </body>
</html>
