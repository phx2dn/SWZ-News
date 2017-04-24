<%-- 
    Document   : varify
    Created on : Apr 19, 2017, 4:15:31 PM
    Author     : liushuxiao
--%>

<%@page import="news.bean.User"%>
<%@page import="news.DAO.UserDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verify</title>
    </head>
    <body>
        <%
          UserDAO dao = new UserDAO();
          List<User> users = new ArrayList<User>();
          users = dao.getAllUsers();
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          String authority = request.getParameter("authority");
          
      %>
      <%
          int i = 0; 
          while(i < users.size()){
              User user = new User();
              user = users.get(i); 
              if(username!=null||password!=null){
                  if(username.equals(user.getUsername())&&
                        password.equals(user.getPassword())&&authority.equals(user.getAuthority())){
                      if(authority.equals("user")){
                         %>
                          <jsp:forward page="homepage_user.jsp"/>
                      <%}else{
                              %>
                              <jsp:forward page="homepage_admin.jsp"/>
                              <%  
                             }
                      }
                  else{%>
                      
                      <script type="text/javascript">
                          alert("Invalid username or password");
                          window.location.href = "login.jsp";
                      </script>
                      <%}
                      
              }else{%>
                      
                      <script type="text/javascript">
                          alert("Invalid username or password");
                          window.location.href = "login.jsp";
                      </script>
                      <%}
              i++;
          }
                
          %>
    </body>
</html>
