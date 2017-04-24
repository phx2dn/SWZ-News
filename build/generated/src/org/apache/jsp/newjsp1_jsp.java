package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"signin.css\"/>\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" class=\"form-signin\">\n");
      out.write("        <h2 class=\"form-signin-heading\">Please sign in</h2>\n");
      out.write("        <label for=\"inputUn\" class=\"sr-only\">Username</label>\n");
      out.write("        <input type=\"text\" name =\"username\" id=\"inputUn\" class=\"form-control\" placeholder=\"Username\" required autofocus>\n");
      out.write("        <label for=\"inputPassword\" class=\"sr-only\">Password</label>\n");
      out.write("        <input type=\"text\" name =\"password\" id=\"inputPassword\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("     \n");
      out.write("        <h5>Your birthday</h5>\n");
      out.write("        <label for=\"inputYear\" class=\"sr-only\">Year</label>\n");
      out.write("        <input name =\"year\" id=\"inputYear\"  class=\"form-control\" placeholder=\"Year\" required autofocus>\n");
      out.write("        <label for=\"inputMonth\" class=\"sr-only\">Month</label>\n");
      out.write("        <input name =\"month\" id=\"inputMonth\" class=\"form-control\" placeholder=\"Month\" required autofocus>\n");
      out.write("        <label for=\"inputDay\" class=\"sr-only\">Day</label>\n");
      out.write("        <input name =\"day\" id=\"inputDay\" class=\"form-control\" placeholder=\"Day\" required autofocus>\n");
      out.write("        <br>\n");
      out.write("        <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
