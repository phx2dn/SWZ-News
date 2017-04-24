<%-- 
    Document   : delete_news
    Created on : Apr 22, 2017, 1:37:50 PM
    Author     : liushuxiao
--%>

<%@page import="news.DAO.NewsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload ="goBack()">
       <%
          NewsDAO dao = new NewsDAO();
          int id = Integer.parseInt(request.getParameter("value"));
          dao.deleteNews(id);
      
        %>

      <script>
         function goBack() {
         window.location.replace("homepage_admin.jsp");
         }
      </script>

    </body>
</html>
