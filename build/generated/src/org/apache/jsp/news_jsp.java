package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import news.bean.News;
import news.DAO.NewsDAO;

public final class news_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>SWZ News</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/blog-home.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">SWZ News</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form action=\"login.jsp\">\n");
      out.write("                <button class=\"btn btn-sm btn-default\" style=\"float:right; margin-top: 10px;\">sign in</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <!-- Blog Entries Column -->\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("\n");
      out.write("                <h1 class=\"page-header\">\n");
      out.write("                    Today's News\n");
      out.write("                    <small>Secondary Text</small>\n");
      out.write("                </h1>\n");
      out.write("                \n");
      out.write("                <form action = \"search.jsp\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                        <span class=\"input-group-btn\">\n");
      out.write("                            <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.input-group -->\n");
      out.write("                </form>\n");
      out.write("                <br>\n");
      out.write("                ");

                    NewsDAO dao = new NewsDAO();
                    News news = new News();
                    news = dao.getNewsById(1);
                
      out.write("\n");
      out.write("                <!-- Blog Post -->\n");
      out.write("                <h2>\n");
      out.write("                    ");
      out.print(news.getTitle());
      out.write("\n");
      out.write("                </h2>\n");
      out.write("                <p class=\"lead\">\n");
      out.write("                    by <a href=\"author1.jsp\">");
      out.print(news.getAuthor());
      out.write("</a>\n");
      out.write("                </p>\n");
      out.write("                <p><span class=\"glyphicon glyphicon-time\"></span> Posted on April 22, 2017 at 10:00 PM</p>\n");
      out.write("                <p><a href=\"news.jsp\">");
      out.print(news.getDescription());
      out.write("</a></p>\n");
      out.write("                <hr>\n");
      out.write("                <img class=\"img-responsive\" src=\"http://placehold.it/600x300\" alt=\"\">\n");
      out.write("                <hr>\n");
      out.write("                \n");
      out.write("                <p>");
      out.print(news.getContent());
      out.write("</p>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <!-- Pager -->\n");
      out.write("                <ul class=\"pager\">\n");
      out.write("                    <li class=\"previous\">\n");
      out.write("                        <a href=\"#\">&larr; Older</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"next\">\n");
      out.write("                        <a href=\"#\">Newer &rarr;</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Blog Sidebar Widgets Column -->\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("                <!-- Blog Categories Well -->\n");
      out.write("                <a href=\"https://www.accuweather.com/en/us/chicago-il/60608/weather-forecast/348308\" class=\"aw-widget-legal\">\n");
      out.write("<!--\n");
      out.write("By accessing and/or using this code snippet, you agree to AccuWeather’s terms and conditions (in English) which can be found at https://www.accuweather.com/en/free-weather-widgets/terms and AccuWeather’s Privacy Statement (in English) which can be found at https://www.accuweather.com/en/privacy.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <!-- Side Widget Well -->\n");
      out.write("                <div class=\"well\">\n");
      out.write("                    <h4>Side Widget Well</h4>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore, perspiciatis adipisci accusamus laudantium odit aliquam repellat tempore quos aspernatur vero.</p>\n");
      out.write("                </div>\n");
      out.write("                <div style=\"width: 300px; margin-left: 30px;\"><iframe style=\"display: block;\" src=\"//cdnres.willyweather.com/widget/loadView.html?id=64454\" width=\"300\" height=\"228\" frameborder=\"0\" scrolling=\"no\"></iframe><a style=\"margin: -20px 0 0 0;display: block;position: relative;height: 20px;z-index: 1;text-indent: -9999em\" href=\"http://www.willyweather.com/il/cook-county/chicago.html\" rel=\"nofollow\">chicago forecasts</a></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <p>SWX News @2017</p>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
