<!DOCTYPE html>
<html>

<head>

  <meta charset="UTF-8">

  <title>Register</title>

    <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />

<style type="text/css">
<!--
.style2 {font-size: x-small}
.style3 {font-size: small}
-->
</style>


	<meta charset="UTF-8">

    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Open+Sans:400,700">

	<!--[if lt IE 9]>
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->

</head>

<body>

    <div id="login">

        <form action="registration.jsp" method="post" enctype="multipart/form-data" >

            <fieldset class="clearfix">

                <p><span class="fontawesome-userf">Name: </span>
                  <input type="text" placeholder="Your Name" name="uname" ></p> <!-- JS because of IE support; better: placeholder="Username" -->
				
				<p><span class="fontawesome-email">Email: </span>
		    <input type="email" placeholder="Your Email" name="email" ></p>
				
            <p><span class="fontawesome-lockv"><span class="style2">Password: </span></span>
            <input type="password" placeholder="Password" name="password"></p>
                <p>&nbsp;</p>
                <!-- JS because of IE support; better: placeholder="Password" -->
				
				<p><span class="fontawesome-usevr style3">Gender: </span>
				  <select class="clearfix" name="gender">
				    <option selected>Male</option>
				    <option>Female</option>
                  </select>
		    </p>
				<p>&nbsp;</p>
								<p><span class="fontawesome-userx style2">Location: </span>
  <select name="location">
                    <option>Delhi</option>
                    <option>Kolkata</option>
                    <option>Mumbai</option>
                    <option>Chennai</option>
                  </select>
		        </p>
				<p>&nbsp;</p>
								<p><span class="fontawesome-usxer style3">Address: </span>
<textarea cols="20" rows="5" name="address"></textarea></p>
                        <p><input type="file" name="filename"/></p>
				<p>&nbsp;</p>
				<p><input type="submit" value="Register"></p>
				<p><input type="reset" class="right"></p>

            </fieldset>

        </form>
        <p>Already a member? <a href="index.jsp">Sign in now</a><span class="fontawesome-arrow-right"></span></p>

    </div> <!-- end login -->




  <script src='http://codepen.io/assets/libs/fullpage/none.js'></script>

</body>

</html>