<%-- 
    Document   : adding_news
    Created on : Apr 22, 2017, 1:49:37 PM
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
  
          String title = request.getParameter("title");
          String author = request.getParameter("author");
          String description = request.getParameter("description");
          String content = request.getParameter("n_content");
          String news_select = request.getParameter("news_type");
          int news_type;
          if (news_select.equals("sports")){
              news_type=1;
          } else if(news_select.equals("Health")){
              news_type=2;
          }else if(news_select.equals("Entertainment")){
              news_type=3;
          }else if(news_select.equals("Technology")){
              news_type=4;
          }else{
              news_type=5;}

          dao.addNews(title,author,description,content,news_type);      
      
        %>

      <script>
         function goBack() {
         location.href = document.referrer;
         }
      </script>

    </body>
</html>
