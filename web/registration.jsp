<%-- 
    Document   : newjsp1
    Created on : Apr 18, 2017, 4:01:18 PM
    Author     : liushuxiao
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="news.bean.User"%>
<%@page import="news.DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="css/signin.css"/>
        <title>Sign up</title>
    </head>
    <body>
        
        <form method="post" class="form-signin" action="reg_verify.jsp">
        <h1 class="form-signin-heading">SWZ News!</h1>
        <h3 class="form-signin-heading">Create a News Account</h3>
        <label for="inputUn" class="sr-only">Username</label>
        <input type="text" name ="r_username" id="inputUn" class="form-control" placeholder="Username" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="text" name ="r_password" id="inputPassword" class="form-control" placeholder="Password" required>
        <label for="conPassword" class="sr-only">Re Password</label>
        <input type="text" name ="c_password" id="inputPassword" class="form-control" placeholder="Re-Password" required>
        <br>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
      </form>
        
      
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
