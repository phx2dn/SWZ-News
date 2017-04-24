<%-- 
    Document   : delete_comms
    Created on : Apr 21, 2017, 3:15:20 PM
    Author     : liushuxiao
--%>

<%@page import="news.DAO.CommentsDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SWZ News</title>
    </head>
    <body>
        <%
          CommentsDAO dao = new CommentsDAO();
          int id = Integer.parseInt(request.getParameter("userid"));
          dao.deleteComments(id);
      
        %>

      <script>
         function goBack() {
         location.href = document.referrer;
         }
      </script>

    </body>
</html>
