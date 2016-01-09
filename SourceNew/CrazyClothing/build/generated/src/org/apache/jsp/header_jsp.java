package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import model.*;

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
      out.write("    <body>\r\n");
      out.write("        ");
 Customer customer = (Customer) session.getAttribute("customer");
         List<ClothBuy> cart1 = (ArrayList<ClothBuy>) session.getAttribute("cart");
            double tt = 0;
            if (session.getAttribute("totalPrice") != null) {
                tt = (Double) session.getAttribute("totalPrice");
            }
            
            NumberFormat nf1 = NumberFormat.getInstance();
            nf1.setMinimumIntegerDigits(0);
        
      out.write("\r\n");
      out.write("        <div class=\"top_bg\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"header_top\">\r\n");
      out.write("                    <div class=\"top_right\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">TRỢ GIÚP</a></li>|\r\n");
      out.write("                            <li><a href=\"contact.html\">LIÊN HỆ</a></li>|\r\n");
      out.write("                            <li><a href=\"#\">THÔNG TIN</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"top_left\">\r\n");
      out.write("                        <h2><span></span> GỌI NGAY : 01628282682</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <div class=\"header_bg\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"header\">\r\n");
      out.write("                    <div class=\"head-t\">\r\n");
      out.write("                        <div class=\"logo\">\r\n");
      out.write("                            <a href=\"index.jsp\"><img src=\"images/logo_1.png\" class=\"img-responsive\" alt=\"\"/> </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- start header_right -->\r\n");
      out.write("                        <div class=\"header_right\">\r\n");
      out.write("                            <div class=\"rgt-bottom\">\r\n");
      out.write("                                <div class=\"log\">\r\n");
      out.write("                                    <div class=\"login\" >\r\n");
      out.write("                                        <div id=\"loginContainer\"><a href=\"");
      out.print((customer != null) ? "ChangeCustomerInfo.jsp" : "Login.jsp");
      out.write("\" id=\"loginButton\"><span>");
      out.print((customer != null) ? customer.getCustomerName() : "ĐĂNG NHẬP");
      out.write("</span></a>\r\n");
      out.write("                                            <div id=\"loginBox\">                \r\n");
      out.write("                                                <form id=\"loginForm\">\r\n");
      out.write("                                                    <fieldset id=\"body\">\r\n");
      out.write("                                                        <fieldset>\r\n");
      out.write("                                                            <label for=\"email\">Email Address</label>\r\n");
      out.write("                                                            <input type=\"text\" name=\"email\" id=\"email\">\r\n");
      out.write("                                                        </fieldset>\r\n");
      out.write("                                                        <fieldset>\r\n");
      out.write("                                                            <label for=\"password\">Password</label>\r\n");
      out.write("                                                            <input type=\"password\" name=\"password\" id=\"password\">\r\n");
      out.write("                                                        </fieldset>\r\n");
      out.write("                                                        <input type=\"submit\" id=\"login\" value=\"Sign in\">\r\n");
      out.write("                                                        <label for=\"checkbox\"><input type=\"checkbox\" id=\"checkbox\"> <i>Remember me</i></label>\r\n");
      out.write("                                                    </fieldset>\r\n");
      out.write("                                                    <span><a href=\"#\">Forgot your password?</a></span>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"reg\">\r\n");
      out.write("                                    <a href=\"");
      out.print((customer != null) ? "Login.jsp" : "Register.jsp");
      out.write('"');
      out.write('>');
      out.print((customer != null) ? "ĐĂNG XUẤT" : "ĐĂNG KÝ");
      out.write("</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"cart box_1\">\r\n");
      out.write("                                    <a href=\"Bag.jsp\">\r\n");
      out.write("                                        <h3> <span class=\"simpleCart_total\">$ ");
      out.print(nf1.format(tt));
      out.write(" VNĐ</span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\">");
      out.print((cart1!=null)?cart1.size():0);
      out.write("</span>  sp)<img src=\"images/bag.png\" alt=\"\"></h3>\r\n");
      out.write("                                    </a>\t\r\n");
      out.write("                                    <!--                                    <p><a href=\"javascript:;\" class=\"simpleCart_empty\">(empty card)</a></p>-->\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"create_btn\">\r\n");
      out.write("                                    <a href=\"Bag.jsp\">GIỎ HÀNG</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"clearfix\"> </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"search\">\r\n");
      out.write("                                <form>\r\n");
      out.write("                                    <input type=\"text\" name=\"txtname\" placeholder=\"search...\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"clearfix\"> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clearfix\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    </body>\r\n");
      out.write("                    </html>\r\n");
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
