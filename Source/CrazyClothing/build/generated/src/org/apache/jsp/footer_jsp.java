package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>CrazyClothing</title>\n");
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
      out.write("        <div class=\"foot-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-6 s-c\">\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<div class=\"fooll\">\n");
      out.write("\t\t\t\t\t<h5>Theo dõi chúng tôi</h5>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<div class=\"social-ic\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"facebok\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"twiter\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"goog\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"be\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"pp\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-6 s-c\">\n");
      out.write("\t\t\t<div class=\"stay\">\n");
      out.write("\t\t\t\t\t\t<div class=\"stay-left\">\n");
      out.write("\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter your email to join our newsletter\" required=\"\">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-1\">\n");
      out.write("\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"join\">\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-3 cust\">\n");
      out.write("\t\t\t<h4>CUSTOMER CARE</h4>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Trung tâm hỗ trợ</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Cách Mua Hàng</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Delivery</a></li>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-2 abt\">\n");
      out.write("\t\t\t<h4>ABOUT US</h4>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Our Stories</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Press</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Career</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-2 myac\">\n");
      out.write("\t\t\t<h4>MY ACCOUNT</h4>\n");
      out.write("\t\t\t\t<li><a href=\"register.html\">Register</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">My Cart</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Order History</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Payment</a></li>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-5 our-st\">\n");
      out.write("\t\t\t<div class=\"our-left\">\n");
      out.write("\t\t\t\t<h4>OUR STORES</h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"our-left1\">\n");
      out.write("\t\t\t\t<div class=\"cr_btn\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">SOLO</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"our-left1\">\n");
      out.write("\t\t\t\t<div class=\"cr_btn1\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">BOGOR</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t<li><i class=\"add\"> </i>Jl. Haji Muhidin, Blok G no.69</li>\n");
      out.write("\t\t\t\t<li><i class=\"phone\"> </i>025-2839341</li>\n");
      out.write("\t\t\t\t<li><a href=\"mailto:info@example.com\"><i class=\"mail\"> </i>info@sitename.com </a></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t<p>Copyrights © 2015 Gretong. All rights reserved | Template by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
