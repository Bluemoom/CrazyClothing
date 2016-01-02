package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- jQuery (necessary JavaScript plugins) -->\n");
      out.write("        <script type='text/javascript' src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <!-- start menu -->\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"top_bg\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"header_top\">\n");
      out.write("\t\t\t<div class=\"top_right\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">help</a></li>|\n");
      out.write("\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>|\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Delivery information</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"top_left\">\n");
      out.write("\t\t\t\t<h2><span></span> Call us : 032 2352 782</h2>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- header -->\n");
      out.write("<div class=\"header_bg\">\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t<div class=\"head-t\">\n");
      out.write("\t\t<div class=\"logo\">\n");
      out.write("\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" class=\"img-responsive\" alt=\"\"/> </a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- start header_right -->\n");
      out.write("\t\t<div class=\"header_right\">\n");
      out.write("\t\t\t<div class=\"rgt-bottom\">\n");
      out.write("\t\t\t\t<div class=\"log\">\n");
      out.write("\t\t\t\t\t<div class=\"login\" >\n");
      out.write("\t\t\t\t\t\t<div id=\"loginContainer\"><a href=\"#\" id=\"loginButton\"><span>Login</span></a>\n");
      out.write("\t\t\t\t\t\t    <div id=\"loginBox\">                \n");
      out.write("\t\t\t\t\t\t        <form id=\"loginForm\">\n");
      out.write("\t\t\t\t\t\t                <fieldset id=\"body\">\n");
      out.write("\t\t\t\t\t\t                \t<fieldset>\n");
      out.write("\t\t\t\t\t\t                          <label for=\"email\">Email Address</label>\n");
      out.write("\t\t\t\t\t\t                          <input type=\"text\" name=\"email\" id=\"email\">\n");
      out.write("\t\t\t\t\t\t                    </fieldset>\n");
      out.write("\t\t\t\t\t\t                    <fieldset>\n");
      out.write("\t\t\t\t\t\t                            <label for=\"password\">Password</label>\n");
      out.write("\t\t\t\t\t\t                            <input type=\"password\" name=\"password\" id=\"password\">\n");
      out.write("\t\t\t\t\t\t                     </fieldset>\n");
      out.write("\t\t\t\t\t\t                    <input type=\"submit\" id=\"login\" value=\"Sign in\">\n");
      out.write("\t\t\t\t\t\t                \t<label for=\"checkbox\"><input type=\"checkbox\" id=\"checkbox\"> <i>Remember me</i></label>\n");
      out.write("\t\t\t\t\t\t            \t</fieldset>\n");
      out.write("\t\t\t\t\t\t            <span><a href=\"#\">Forgot your password?</a></span>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"reg\">\n");
      out.write("\t\t\t\t\t<a href=\"register.html\">REGISTER</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t<a href=\"checkout.html\">\n");
      out.write("\t\t\t\t\t<h3> <span class=\"simpleCart_total\">$0.00</span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\">0</span> items)<img src=\"images/bag.png\" alt=\"\"></h3>\n");
      out.write("\t\t\t\t</a>\t\n");
      out.write("\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">(empty card)</a></p>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"create_btn\">\n");
      out.write("\t\t\t\t<a href=\"checkout.html\">CHECKOUT</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"search\">\n");
      out.write("\t\t    <form>\n");
      out.write("\t\t    \t<input type=\"text\" value=\"\" placeholder=\"search...\">\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
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
