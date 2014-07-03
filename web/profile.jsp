<%-- 
    Document   : profile
    Created on : Jun 28, 2014, 12:22:05 PM
    Author     : Shantanu
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
        <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />
        <style type="text/css">
#ProfilePage
{
    /* Move it off the top of the page, then centre it horizontally */
    margin: 50px auto;
    width: 635px;

/* For visibility. Delete me */
border: 1px solid white;
}

#LeftCol
{
    /* Move it to the left */
    float: left;

    width: 200px;
    text-align: center;

    /* Move it away from the content */
    margin-right: 20px;

/* For visibility. Delete me */
border: 1px solid white;
}

#Photo
{
    /* Width and height of photo container */
    width: 200px;
    height: 200px;

/* For visibility. Delete me */
border: 1px solid #3b4148;
}

#PhotoOptions
{
    text-align: center;
    width: 200px;

/* For visibility. Delete me */
border: 1px solid white;
}

#Info
{
    width: 400px;
    text-align: center;

    /* Move it to the right */
    float: right;

/* For visibility. Delete me */
/*border: 1px solid white;*/
}

#Info strong
{
    /* Give it a width */
    display: inline-block;
    width: 100px;

/* For visibility. Delete me */
/*border: 1px solid #3b4148;*/
}

#Info span
{
    /* Give it a width */
    display: inline-block;
    width: 250px;
    color: whitesmoke;

/* For visibility. Delete me */
border: 1px solid #3b4148;
}
    
        
</style>
</head>
    <body>
        <%
String email=(String)request.getSession().getAttribute("emailid");
Class.forName("oracle.jdbc.driver.OracleDriver"); 
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","aezakmi");
PreparedStatement Ps=con.prepareStatement("select * from registration1 where email=?");
Ps.setString(1,email);
ResultSet rs = Ps.executeQuery();
while(rs.next())
{
    String p1=rs.getString(1);
    String p2=rs.getString(2);
    String p3=rs.getString(4);
    String p4=rs.getString(5);
    String p5=rs.getString(6);
    String p6=rs.getString(7);

%>
        

<div id="ProfilePage">
    <div id="LeftCol">
        <div id="Photo"><%=p6%></div>
        <div id="ProfileOptions">
            <form action="upload.jsp" method="post" enctype="multipart/form-data"><input type="file" name="filename"/>
            <input type="submit" value="Upload"></form>
                Profile Picture
        </div>
    </div>

    <div id="Info">
        
        <p>
            <strong>Name:</strong>
            <span><%=p1%></span>
        </p>
        <p>
            <strong>Email:</strong>
            <span><%=p2%></span>
        </p>
        <p>
            <strong>Gender:</strong>
            <span><%=p3%></span>
        </p>
        <p>
            <strong>Location:</strong>
            <span><%=p4%></span>
        </p>
        <p>
            <strong>Address:</strong>
            <span><%=p5%></span>
        </p>
        
    </div>
    <!-- Needed because other elements inside Profile Page have floats -->
    <div style="clear:both"></div>
</div>
<%
               } %>
               <p><center><a href="edit_profile.jsp">Edit Profile</a><span class="fontawesome-arrow-right"></span></center></p>        
    </body>
</html>
