<%-- 
    Document   : add_comments
    Created on : Apr 21, 2017, 10:55:31 AM
    Author     : liushuxiao
--%>

<%@page import="news.DAO.UserDAO"%>
<%@page import="news.bean.Comments"%>
<%@page import="news.DAO.CommentsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SWZ News</title>
    </head>
    <body onload ="goBack()">
        <%
          CommentsDAO dao = new CommentsDAO();
          UserDAO dao2 = new UserDAO();
          String un = request.getParameter("un");
          String content = request.getParameter("c_content");
          int uid = dao2.getIdByUsername(un);
          int nid = Integer.parseInt(request.getParameter("nid"));

          dao.addComments(nid,content,uid,un);      
      
        %>

      <script>
         function goBack() {
         location.href = document.referrer;
         }
      </script>

    </body>
</html>
