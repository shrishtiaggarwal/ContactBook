<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: shrishti
  Date: 29/3/18
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="/resources/style1.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <p style="text-decoration-color: red;text-align: center;size: 20px;color: red;font-size:larger;font-family: 'Titillium Web', sans-serif">${logoutmsg}</p>
    <p style="text-decoration-color: red;text-align: center;size: 20px;color: red;font-size:larger;font-family: 'Titillium Web', sans-serif">${msg}</p>
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <div class="panel panel-login">
                <div class="panel-heading">
                    <div class="row">
                        <div class="col-xs-6">
                            <a href="#" class="active" id="login-form-link">Login</a>
                        </div>
                        <div class="col-xs-6">
                            <a href="#" id="register-form-link">Register</a>
                        </div>
                    </div>
                    <hr>
                </div>
                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-12">
                            <form id="login-form" action="/loginDone" method="post" role="form" style="display: block;">
                                <div class="form-group">
                                    <input type="text" name="userName" id="username-login" tabindex="1" class="form-control" placeholder="Username" value="" required>
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" id="password-login" tabindex="2" class="form-control" placeholder="Password" required>
                                </div>
                                <div class="form-group text-center">
                                    <input type="checkbox" tabindex="3" class="" name="remember" id="remember">
                                    <label for="remember"> Remember Me</label>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-sm-6 col-sm-offset-3">
                                            <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-lg-12">
                                            <div class="text-center">
                                                <%--<a href="" tabindex="5" class="forgot-password">Forgot Password?</a>--%>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                            <form id="register-form" method="get" role="form" style="display: none;">
                                <div class="form-group">
                                    <input type="text" name="userName" id="username" tabindex="1" class="form-control" placeholder="Username" value="" required>
                                    <%--<td><form:errors path="User.userName" cssClass="error" /></td>--%>
                                </div>
                                <div class="form-group">
                                    <input type="email" name="userEmail" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="" required>
                                    <%--<td><form:errors path="User.userEmail" cssClass="error" /></td>--%>
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" required>
                                    <%--<td><form:errors path="password" /></td>--%>
                                </div>
                                <div class="form-group">
                                    <input type="password" name="confirmPassword" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password" required>
                                    <%--<td><form:errors path="contact.confirmPassword" /></td>--%>
                                </div>
                                <div class="form-group">
                                    <div class="row">
                                        <div class="col-sm-6 col-sm-offset-3">
                                            <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="application/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="/resources/home.js" type="application/javascript"></script>


<script type="text/javascript">
   jQuery(function () {

       jQuery("#register-submit").click(function () {
           var password = jQuery("#password").val();
           var confirmPassword = jQuery("#confirm-password").val();
           if (password != confirmPassword) {
               alert("password and confirm password do not matches.");
               return false;
           }
           else {
               var userName = jQuery.trim(jQuery("#username").val());
               var userEmail = jQuery.trim(jQuery("#email").val());
               var password = jQuery.trim(jQuery("#password").val());
               var confirmPassword = jQuery.trim(jQuery("#confirm-password").val());
              // alert("check");
               jQuery.ajax({
                   url: "/registrationDone",
                   type: "POST",
                   data: {

                       userId: userId,
                       userName: userName,
                       userEmail: userEmail,
                       password: password,
                       confirmPassword: confirmPassword
                   },
                   success: function () {
                       alert("Data is saved!")

                   }
               });
           }
           return true;
       });
   });
</script>

</body>

</html>