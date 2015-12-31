package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import model.*;
import model.GroupCloth;
import dao.GroupClothDao;
import model.Cloth;
import dao.ClothDao;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Menu.jsp");
    _jspx_dependants.add("/specialCloth.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Home</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
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
//         List<ClothBuy> cart = (ArrayList<ClothBuy>) session.getAttribute("cart");
         double tt = 0;
         if(session.getAttribute("totalPrice")!=null) tt = (Double) session.getAttribute("totalPrice");
        
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
      out.print((customer!=null)?"ChangeCustomerInfo.jsp":"Login.jsp");
      out.write("\" id=\"loginButton\"><span>");
      out.print((customer!=null)?customer.getCustomerName():"ĐĂNG NHẬP");
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
      out.print((customer!=null)?"Login.jsp":"Register.jsp");
      out.write('"');
      out.write('>');
      out.print((customer!=null)?"ĐĂNG XUẤT":"ĐĂNG KÝ");
      out.write("</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"cart box_1\">\r\n");
      out.write("                                    <a href=\"Bag.jsp\">\r\n");
      out.write("                                        <h3> <span class=\"simpleCart_total\">$");
      out.print(tt);
      out.write(" VNĐ</span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\">0</span>  items)<img src=\"images/bag.png\" alt=\"\"></h3>\r\n");
      out.write("                                    </a>\t\r\n");
      out.write("<!--                                    <p><a href=\"javascript:;\" class=\"simpleCart_empty\">(empty card)</a></p>-->\r\n");
      out.write("                                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"create_btn\">\r\n");
      out.write("                                    <a href=\"Bag.jsp\">GIỎ HÀNG</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"clearfix\"> </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"search\">\r\n");
      out.write("                                <form>\r\n");
      out.write("                                    <input type=\"text\" value=\"\" placeholder=\"search...\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"\">\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"clearfix\"> </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clearfix\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        ");
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
 GroupClothDao grd = new GroupClothDao(); 
      out.write("\r\n");
      out.write("        <ul class=\"megamenu skyblue\">\r\n");
      out.write("\t\t\t<li class=\"active grid\"><a class=\"color1\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        ");
for(GroupCloth gr :grd.showDanhMuc()) { 
      out.write("\r\n");
      out.write("                        <li class=\"grid\"><a class=\"color2\" href=\"ShowGroup.jsp?groupID=");
      out.print(gr.getGroupID());
      out.write('"');
      out.write('>');
      out.print(gr.getGroupName());
      out.write("</a></li>\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("\t\t </ul> \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"special\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<h4>SẢN PHẨM ĐẶC BIỆT</h4>\r\n");
      out.write("\t\t<div class=\"specia-top\">\r\n");
      out.write("\t\t\t<ul class=\"grid_2\">\r\n");
      out.write("                            ");
 ClothDao clothDao = new ClothDao(); 
      out.write("\r\n");
      out.write("                            ");
for(Cloth cloth : clothDao.showSpecialCloth()) {
      out.write("\r\n");
      out.write("\t\t<li>\r\n");
      out.write("                    <a href=\"ShowDetailCloth.jsp?ClothID=");
      out.print(cloth.getClothID());
      out.write("\"><img src=\"");
      out.print(cloth.getImage() );
      out.write("\" class=\"img-responsive\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t<div class=\"special-info grid_1 simpleCart_shelfItem\">\r\n");
      out.write("\t\t\t\t\t<h5>");
      out.print(cloth.getClothName());
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t<div class=\"item_add\"><span class=\"item_price\"><h6>");
      out.print(cloth.getPrice());
      out.write(" VNĐ</h6></span>\r\n");
      out.write("                                        <span class=\"code\">Sales: ");
      out.print(cloth.getSale());
      out.write(" %</span>\t\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t\t<div class=\"item_add\"><span class=\"item_price\"><a href=\"CartServlet?command=buy&clothID=");
      out.print(cloth.getClothID());
      out.write("\">THÊM VÀO GIỎ</a></span></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>        \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>CrazyClothing</title>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <!-- jQuery (necessary JavaScript plugins) -->\r\n");
      out.write("        <script type='text/javascript' src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <!-- Custom Theme files -->\r\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!-- start menu -->\r\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"foot-top\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-md-6 s-c\">\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<div class=\"fooll\">\r\n");
      out.write("<!--\t\t\t\t\t<h5>Theo dõi chúng tôi</h5>-->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>\r\n");
      out.write("\t\t\t\t<div class=\"social-ic\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"facebok\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"twiter\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"goog\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"be\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"pp\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-6 s-c\">\r\n");
      out.write("\t\t\t<div class=\"stay\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"stay-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Enter your email to join our newsletter\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"join\">\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-md-3 cust\">\r\n");
      out.write("\t\t\t<h4>CUSTOMER CARE</h4>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Trung tâm hỗ trợ</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Cách Mua Hàng</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Delivery</a></li>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-2 abt\">\r\n");
      out.write("\t\t\t<h4>ABOUT US</h4>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Our Stories</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Press</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Career</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-2 myac\">\r\n");
      out.write("\t\t\t<h4>MY ACCOUNT</h4>\r\n");
      out.write("\t\t\t\t<li><a href=\"register.html\">Register</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">My Cart</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Order History</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">Payment</a></li>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-5 our-st\">\r\n");
      out.write("\t\t\t<div class=\"our-left\">\r\n");
      out.write("\t\t\t\t<h4>OUR STORES</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"our-left1\">\r\n");
      out.write("\t\t\t\t<div class=\"cr_btn\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">SOLO</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"our-left1\">\r\n");
      out.write("\t\t\t\t<div class=\"cr_btn1\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">BOGOR</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t<li><i class=\"add\"> </i>Jl. Haji Muhidin, Blok G no.69</li>\r\n");
      out.write("\t\t\t\t<li><i class=\"phone\"> </i>025-2839341</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"mailto:info@example.com\"><i class=\"mail\"> </i>info@sitename.com </a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t<p>Copyrights © 2015 Gretong. All rights reserved | Template by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
