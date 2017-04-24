<%-- 
    Document   : reg_verify
    Created on : Apr 20, 2017, 6:05:48 PM
    Author     : liushuxiao
--%>

<%@page import="news.bean.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="news.DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registration</title>
    </head>
    <body>
        <%
          UserDAO dao = new UserDAO();
          List<User> us = new ArrayList<User>();
          us = dao.getAllUsers();
          String r_username = request.getParameter("r_username");
          String r_password = request.getParameter("r_password");
          String c_password = request.getParameter("c_password");
          
      %>
      <%
          int i = 0; 
          while(i < us.size()){
              User user = new User();
              user = us.get(i); 
                  if(r_username.equals(user.getUsername())){
                     %><script type="text/javascript">
                          alert("username already exits");
                          window.location.href = "registration.jsp";
                      </script>
                      <%
                  } else if(!r_password.equals(c_password)){
                     %><script type="text/javascript">
                          alert("password doesn't match");
                          window.location.href = "registration.jsp";
                      </script>
                      <%
                  }else{
                    dao.addUser(r_username,r_password);
                  
                    %>    <script type="text/javascript">
                          alert("Successfully!");
                          window.location.href = "homepage_user.jsp";
                          </script>
                              <%  
                          break;
                       }
                      
            
              i++;
          }
                
          %>
    </body>
</html>
