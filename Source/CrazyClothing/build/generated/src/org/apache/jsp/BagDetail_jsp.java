package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BagDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"container\">\n");
      out.write("\t<div class=\"check\">\t \n");
      out.write("\t\t\t <div class=\"col-md-3 cart-total\">\n");
      out.write("\t\t\t <a class=\"continue\" href=\"#\">Continue to basket</a>\n");
      out.write("\t\t\t <div class=\"price-details\">\n");
      out.write("\t\t\t\t <h3>Price Details</h3>\n");
      out.write("\t\t\t\t <span>Total</span>\n");
      out.write("\t\t\t\t <span class=\"total1\">6200.00</span>\n");
      out.write("\t\t\t\t <span>Discount</span>\n");
      out.write("\t\t\t\t <span class=\"total1\">---</span>\n");
      out.write("\t\t\t\t <span>Delivery Charges</span>\n");
      out.write("\t\t\t\t <span class=\"total1\">150.00</span>\n");
      out.write("\t\t\t\t <div class=\"clearfix\"></div>\t\t\t\t \n");
      out.write("\t\t\t </div>\t\n");
      out.write("\t\t\t <ul class=\"total_price\">\n");
      out.write("\t\t\t   <li class=\"last_price\"> <h4>TOTAL</h4></li>\t\n");
      out.write("\t\t\t   <li class=\"last_price\"><span>6350.00</span></li>\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t </ul>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t <a class=\"order\" href=\"#\">Place Order</a>\n");
      out.write("\t\t\t <div class=\"total-item\">\n");
      out.write("\t\t\t\t <h3>OPTIONS</h3>\n");
      out.write("\t\t\t\t <h4>COUPONS</h4>\n");
      out.write("\t\t\t\t <a class=\"cpns\" href=\"#\">Apply Coupons</a>\n");
      out.write("\t\t\t\t <p><a href=\"#\">Log In</a> to use accounts - linked coupons</p>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t <div class=\"col-md-9 cart-items\">\n");
      out.write("\t\t\t <h1>My Shopping Bag (2)</h1>\n");
      out.write("\t\t\t\t<script>$(document).ready(function(c) {\n");
      out.write("\t\t\t\t\t$('.close1').on('click', function(c){\n");
      out.write("\t\t\t\t\t\t$('.cart-header').fadeOut('slow', function(c){\n");
      out.write("\t\t\t\t\t\t\t$('.cart-header').remove();\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t});\t  \n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t   </script>\n");
      out.write("\t\t\t <div class=\"cart-header\">\n");
      out.write("\t\t\t\t <div class=\"close1\"> </div>\n");
      out.write("\t\t\t\t <div class=\"cart-sec simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t<div class=\"cart-item cyc\">\n");
      out.write("\t\t\t\t\t\t\t <img src=\"images/8.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t   <div class=\"cart-item-info\">\n");
      out.write("\t\t\t\t\t\t<h3><a href=\"#\">Mountain Hopper(XS R034)</a><span>Model No: 3578</span></h3>\n");
      out.write("\t\t\t\t\t\t<ul class=\"qty\">\n");
      out.write("\t\t\t\t\t\t\t<li><p>Size : 5</p></li>\n");
      out.write("\t\t\t\t\t\t\t<li><p>Qty : 1</p></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t <div class=\"delivery\">\n");
      out.write("\t\t\t\t\t\t\t <p>Service Charges : Rs.100.00</p>\n");
      out.write("\t\t\t\t\t\t\t <span>Delivered in 2-3 bussiness days</span>\n");
      out.write("\t\t\t\t\t\t\t <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t        </div>\t\n");
      out.write("\t\t\t\t\t   </div>\n");
      out.write("\t\t\t\t\t   <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t </div>\n");
      out.write("\t\t\t <script>$(document).ready(function(c) {\n");
      out.write("\t\t\t\t\t$('.close2').on('click', function(c){\n");
      out.write("\t\t\t\t\t\t\t$('.cart-header2').fadeOut('slow', function(c){\n");
      out.write("\t\t\t\t\t\t$('.cart-header2').remove();\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\t  \n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t </script>\n");
      out.write("\t\t\t <div class=\"cart-header2\">\n");
      out.write("\t\t\t\t <div class=\"close2\"> </div>\n");
      out.write("\t\t\t\t  <div class=\"cart-sec simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t\t<div class=\"cart-item cyc\">\n");
      out.write("\t\t\t\t\t\t\t <img src=\"images/11.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t   <div class=\"cart-item-info\">\n");
      out.write("\t\t\t\t\t\t<h3><a href=\"#\">Mountain Hopper(XS R034)</a><span>Model No: 3578</span></h3>\n");
      out.write("\t\t\t\t\t\t<ul class=\"qty\">\n");
      out.write("\t\t\t\t\t\t\t<li><p>Size : 5</p></li>\n");
      out.write("\t\t\t\t\t\t\t<li><p>Qty : 1</p></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t <div class=\"delivery\">\n");
      out.write("\t\t\t\t\t\t\t <p>Service Charges : Rs.100.00</p>\n");
      out.write("\t\t\t\t\t\t\t <span>Delivered in 2-3 bussiness days</span>\n");
      out.write("\t\t\t\t\t\t\t <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t        </div>\t\n");
      out.write("\t\t\t\t\t   </div>\n");
      out.write("\t\t\t\t\t   <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t  </div>\t\t\n");
      out.write("\t\t </div>\n");
      out.write("\t\t \n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t </div>\n");
      out.write("\t </div>\n");
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
