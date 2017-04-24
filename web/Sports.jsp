<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="news.DAO.NewsDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SWZ News</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/blog-home.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script async="async" src="https://www.google.com/adsense/search/ads.js"></script>

<!-- other head elements from your page -->

<script type="text/javascript" charset="utf-8">
(function(g,o){g[o]=g[o]||function(){(g[o]['q']=g[o]['q']||[]).push(
  arguments)},g[o]['t']=1*new Date})(window,'_googCsa');
</script>


</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">SWZ News</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="Sports.jsp">Sports</a>
                    </li>
                    <li>
                        <a href="Health.jsp">Health</a>
                    </li>
                    <li>
                        <a href="Entertainment.jsp">Entertainment</a>
                    </li>
                    <li>
                        <a href="Technology.jsp">Technology</a>
                    </li>
                    <li>
                        <a href="Business.jsp">Business</a>
                    </li>
                </ul>
                <form action="login.jsp">
                <button class="btn btn-sm btn-default" style="float:right; margin-top: 10px;">sign in</button>
                </form>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <div class="row">

            <!-- Blog Entries Column -->
            <div class="col-md-8">

                <h1 class="page-header">
                    Today's News
                </h1>
                
                <form action = "search.jsp">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search" name="search">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="submit">
                                <span class="glyphicon glyphicon-search"></span>
                        </button>
                        </span>
                    </div>
                    <!-- /.input-group -->
                </form>
                <br>
                <%
                    NewsDAO dao = new NewsDAO();
                    request.setAttribute("ns", dao.getNewsByType(1));
                %>
                <!-- Blog Post -->
                <c:forEach items="${ns}" var="news">
                <div style="display: left;width:202px; height:75px">
                    <a href="news.jsp?value=<c:out value="${news.id}" />"><img class="img-responsive" src="image.jsp?imgid=<c:out value="${news.id}" />" alt=""></a>
                </div>
                <div style="
                     margin-top: -90px;
                     margin-left: 230px;">
                    <h3>
                    <a href="news.jsp?value=<c:out value="${news.id}" />"><c:out value="${news.title}" /></a>
                    </h3>
                <p class="lead">
                    by <a href="news.jsp?value=<c:out value="${news.id}" />"><c:out value="${news.author}" /></a>
                </p>
                <p><span class="glyphicon glyphicon-time"></span> Posted on August 28, 2013 at 10:00 PM</p>
                <p><a href="news.jsp?value=<c:out value="${news.id}" />"><c:out value="${news.description}" /></a></p>
                </div>
                <hr>
                </c:forEach>

                <hr>

            
            </div>

            <!-- Blog Sidebar Widgets Column -->
            <div class="col-md-4">

          

                <!-- Blog Categories Well -->
                <a href="https://www.accuweather.com/en/us/chicago-il/60608/weather-forecast/348308" class="aw-widget-legal">
<!--
By accessing and/or using this code snippet, you agree to AccuWeather’s terms and conditions (in English) which can be found at https://www.accuweather.com/en/free-weather-widgets/terms and AccuWeather’s Privacy Statement (in English) which can be found at https://www.accuweather.com/en/privacy.
-->

                
                <!-- Weather widget -->
                
                <div style="width: 300px; margin-left: 30px; margin-top: 100px;"><iframe style="display: block;" src="//cdnres.willyweather.com/widget/loadView.html?id=64454" width="300" height="228" frameborder="0" scrolling="no"></iframe><a style="margin: -20px 0 0 0;display: block;position: relative;height: 20px;z-index: 1;text-indent: -9999em" href="http://www.willyweather.com/il/cook-county/chicago.html" rel="nofollow">chicago forecasts</a></div>
                  
                <!-- Google ads -->
                <div id='afscontainer1' style="width: 300px; margin-left: 30px;"></div>

                <script type="text/javascript" charset="utf-8">

                    var pageOptions = {
                      "pubId": "pub-9616389000213823", // Make sure this the correct client ID!
                      "query": "sports",
                      "adPage": 1
                    };

                    var adblock1 = {
                      "container": "afscontainer1",
                      "width": "300",
                      "number": 2
                    };

                     _googCsa('ads', pageOptions, adblock1);

                </script>
            </div>

        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>SWX News @2017</p>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>