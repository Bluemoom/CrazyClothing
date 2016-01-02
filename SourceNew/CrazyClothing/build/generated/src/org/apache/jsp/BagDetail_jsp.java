package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.ClothBuy;
import java.util.List;
import java.util.Map;
import model.Cloth;
import java.util.TreeMap;
import model.*;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>CrazyClothing</title>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>            \r\n");
      out.write("       ");

                       List<ClothBuy> cart = (ArrayList<ClothBuy>) session.getAttribute("cart");   
        
      out.write(" \r\n");
      out.write("          \r\n");
      out.write("        <div class=\"container\">               \r\n");
      out.write("\t<div class=\"check\">    \r\n");
      out.write("            <div class=\"col-md-3 cart-total\">                            \r\n");
      out.write("\t\t\t <a class=\"continue\" href=\"#\">Continue to basket</a>\r\n");
      out.write("\t\t\t <div class=\"price-details\">\r\n");
      out.write("\t\t\t\t <h3>Price Details</h3>\r\n");
      out.write("\t\t\t\t <span>Total</span>\r\n");
      out.write("\t\t\t\t <span class=\"total1\"></span>\r\n");
      out.write("\t\t\t\t <span>Discount</span>\r\n");
      out.write("\t\t\t\t <span class=\"total1\">---</span>\r\n");
      out.write("\t\t\t\t <span>Delivery Charges</span>\r\n");
      out.write("\t\t\t\t <span class=\"total1\">150.00</span>\r\n");
      out.write("\t\t\t\t <div class=\"clearfix\"></div>\t\t\t\t \r\n");
      out.write("\t\t\t </div>\t\r\n");
      out.write("\t\t\t <ul class=\"total_price\">\r\n");
      out.write("\t\t\t   <li class=\"last_price\"> <h4>TOTAL</h4></li>\t\r\n");
      out.write("\t\t\t   <li class=\"last_price\"><span>6350.00</span></li>\r\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t </ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t <a class=\"order\" href=\"#\">Place Order</a>\r\n");
      out.write("\t\t\t <div class=\"total-item\">\r\n");
      out.write("\t\t\t\t <h3>OPTIONS</h3>\r\n");
      out.write("\t\t\t\t <h4>COUPONS</h4>\r\n");
      out.write("\t\t\t\t <a class=\"cpns\" href=\"#\">Apply Coupons</a>\r\n");
      out.write("\t\t\t\t <p><a href=\"#\">Log In</a> to use accounts - linked coupons</p>\r\n");
      out.write("\t\t\t </div>                      \r\n");
      out.write("\t\t\t</div>             \r\n");
      out.write("\t\t <div class=\"col-md-9 cart-items\">\r\n");
      out.write("                     \r\n");
      out.write("\t\t\t <h1>My Shopping Bag </h1>\r\n");
      out.write("\t\t\t\t<script>$(document).ready(function(c) {\r\n");
      out.write("\t\t\t\t\t$('.close1').on('click', function(c){\r\n");
      out.write("\t\t\t\t\t\t$('.cart-header').fadeOut('slow', function(c){\r\n");
      out.write("\t\t\t\t\t\t\t$('.cart-header').remove();\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t});\t  \r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t   </script>\r\n");
      out.write("\t\t\t <div class=\"cart-header\">\r\n");
      out.write("\t\t\t\t <div class=\"close1\"> </div>\r\n");
      out.write("\t\t\t\t <div class=\"cart-sec simpleCart_shelfItem\">   \r\n");
      out.write("                                        ");
for (ClothBuy cb : cart) {
      out.write("  \r\n");
      out.write("\t\t\t\t\t\t<div class=\"cart-item cyc\">\r\n");
      out.write("                                                    <img src=\"");
      out.print(cb.getCloth().getImage());
      out.write("\" class=\"img-responsive\" alt=\"\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                                <div class=\"cart-item-info\">\r\n");
      out.write("\t\t\t\t\t\t<h3><a href=\"#\"></a><span>Mã sản phẩm: ");
      out.print(cb.getCloth().getClothID());
      out.write("</span></h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"qty\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><p>Sale : ");
      out.print(cb.getCloth().getSale());
      out.write("</p></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><p>Quantity : ");
      out.print(cb.getQuantityBuy());
      out.write("</p></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"delivery\">\r\n");
      out.write("\t\t\t\t\t\t\t <p>Phí dịch vụ : 0 VNĐ</p>\t\t \r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"clearfix\"></div>\r\n");
      out.write("                                                        </div>\t\r\n");
      out.write("                                                </div>\r\n");
      out.write("\t\t\t\t\t   <div class=\"clearfix\"></div>   \r\n");
      out.write("                                           ");
 } 
      out.write("       \r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t </div>\t\r\n");
      out.write("                                                \r\n");
      out.write("\t\t </div>\t\t\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>   \r\n");
      out.write("                       \r\n");
      out.write("\t </div>\r\n");
      out.write("                                          \r\n");
      out.write("\t </div>\r\n");
      out.write("                                               \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
