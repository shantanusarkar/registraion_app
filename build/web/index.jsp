<!DOCTYPE html>
<html>

<head>

  <meta charset="UTF-8"/>

  <title>Login</title>

  <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />

</head>

<body>

    <div id="login">

        <form action="log_in.jsp" method="post">

            <fieldset class="clearfix">

                
                <p><span class="fontawesome-user"></span><input type="email" value="E-mail" onBlur="if(this.value == '') this.value = 'E-mail'" onFocus="if(this.value == 'E-mail') this.value = ''" required name="email"></p> 
                <p><span class="fontawesome-lock"></span><input type="password"  value="Password" onBlur="if(this.value == '') this.value = 'Password'" onFocus="if(this.value == 'Password') this.value = ''" required name="password" ></p> 
                <p><input type="submit" value="Sign In"></p>

            </fieldset>

        </form>

        <p>Not a member? <a href="reg.jsp">Sign up now</a><span class="fontawesome-arrow-right"></span></p>

    </div> <!-- end login -->

</body>
</html>

  <script src='http://codepen.io/assets/libs/fullpage/none.js'></script>

</body>

</html>