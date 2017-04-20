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
        <title>Login</title>
    </head>
    <body>
        
        <form method="post" class="form-signin" action="verify.jsp">
        <h1 class="form-signin-heading">SWZ News!</h1>
        <h2 class="form-signin-heading">sign in</h2>
        <label for="inputUn" class="sr-only">Username</label>
        <input type="text" name ="username" id="inputUn" class="form-control" placeholder="Username" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="text" name ="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <br>
     
        <select class="selectpicker" name="authority">
            <option>user</option>
            <option>admin</option>
        </select>

        <br>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
      </form>
        
      
    <script src="js/bootstrap.min.js"></script>
    </body>
</html>
