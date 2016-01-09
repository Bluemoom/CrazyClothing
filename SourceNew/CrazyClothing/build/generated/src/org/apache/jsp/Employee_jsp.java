package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CustomerDao;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import model.*;
import model.GroupCloth;
import dao.GroupClothDao;

public final class Employee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Menu.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Employee Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 CustomerDao customerDao = new CustomerDao();
            Customer customer1 = (Customer) session.getAttribute("customerEdit");

        
      out.write("\n");
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
      out.write("                                    <input type=\"text\" value=\"\" placeholder=\"search...\">\r\n");
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
      out.write("\n");
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
      out.write("        <title>ShowByGroup</title>\r\n");
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
      out.write("            <li class=\"active grid\"><a class=\"color1\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                ");
for (GroupCloth gr : grd.showDanhMuc()) {
      out.write("\r\n");
      out.write("            <li class=\"grid\"><a class=\"color2\" href=\"ShowByGroup.jsp?groupID=");
      out.print(gr.getGroupID());
      out.write('"');
      out.write('>');
      out.print(gr.getGroupName());
      out.write("</a></li>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("        </ul> \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        <p style=\"font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center\">QUẢN LÝ TÀI KHOẢN</p>            \n");
      out.write("        <div class=\"registration_form\">\n");
      out.write("            <!-- Form -->\n");
      out.write("            <form id=\"registration_form\" action=\"CustomerController\" method=\"post\">\t\t\t\t\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        <input placeholder=\"Họ tên...\" name=\"name\"  value=\"");
      out.print((customer1 != null) ? customer1.getCustomerName() : "");
      out.write("\" type=\"text\" tabindex=\"2\" required>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        <input placeholder=\"Email...\" name=\"email\"  value=\"");
      out.print((customer1 != null) ? customer1.getEmail() : "");
      out.write("\" type=\"text\" tabindex=\"3\" >\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        <input placeholder=\"Địa chỉ\"  value=\"");
      out.print((customer1 != null) ? customer1.getAddress() : "");
      out.write("\" name=\"address\" type=\"text\" tabindex=\"4\" >\n");
      out.write("                    </label>\n");
      out.write("                </div>\t\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        <input placeholder=\"Số điện thoại...\"  value=\"");
      out.print((customer1 != null) ? customer1.getPhoneNumber() : "");
      out.write("\" name=\"phonenumber\" type=\"text\" tabindex=\"5\" >\n");
      out.write("                    </label>\n");
      out.write("                </div>\t\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        <input placeholder=\"Tên đăng nhập...\"  value=\"");
      out.print((customer1 != null) ? customer1.getUsername() : "");
      out.write("\" name=\"username\" type=\"text\" tabindex=\"6\" >\n");
      out.write("                    </label>\n");
      out.write("                </div>\t\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        <input placeholder=\"Mật khẩu...\"  value=\"");
      out.print((customer1 != null) ? customer1.getPassword() : "");
      out.write("\" name=\"password\" type=\"password\" tabindex=\"7\" >\n");
      out.write("                    </label>\n");
      out.write("                </div>\t\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        <input placeholder=\"Nhập lại mật khẩu...\"  value=\"");
      out.print((customer1 != null) ? customer1.getPassword() : "");
      out.write("\" name=\"repassword\" type=\"password\" tabindex=\"8\" >\n");
      out.write("                    </label>\n");
      out.write("                </div>\t\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        Quyền:   <select tabindex=\"9\" name=\"rule\">\n");
      out.write("                            <option value=\"1\">Nhân viên</option>\n");
      out.write("                            <option value=\"0\">Khách hàng</option>\n");
      out.write("                        </select>\n");
      out.write("                    </label>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label>\n");
      out.write("                        Trạng thái:   <select tabindex=\"10\" name=\"status\">\n");
      out.write("                            <option value=\"1\">Hoạt động</option>\n");
      out.write("                            <option value=\"0\">Khóa</option>\n");
      out.write("                        </select>\n");
      out.write("                    </label>                                    \n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"submit\" value=\"LƯU\" name=\"action\"  id=\"register-submit\"> <input type=\"submit\" name=\"action\" value=\"TÌM KIẾM\" id=\"register-submit\">\n");
      out.write("                </div>\t\t\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            <!-- /Form -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <table class =\"Listt\">\n");
      out.write("            <tr>\n");
      out.write("                <th style=\"width: 5%;\"><p class=\"thgroupid\" style=\"margin-left: 20px\">ID</p></th>\n");
      out.write("        <th style=\"width: 20%; padding-left: 5px;\"><p class=\"thgroupid\">HỌ TÊN</p></th>\n");
      out.write("    <th style=\"width: 20%; padding-left: 5px;\"><p class=\"thgroupid\">EMAIL</p></th>\n");
      out.write("<th style=\"width: 20%; padding-left: 5px;\"><p class=\"thgroupid\">ĐỊA CHỈ</p></th>\n");
      out.write("<th style=\"width: 10%; padding-left: 5px;\"><p class=\"thgroupid\">SỐ ĐIỆN THOẠI</p></th>\n");
      out.write("<th><p class=\"thgroupid\">TÊN ĐĂNG NHẬP</p></th>\n");
      out.write("<th><p class=\"thgroupid\">MẬT KHẨU</p></th>\n");
      out.write("<th><p class=\"thgroupid\">QUYỀN</p></th>\n");
      out.write("<th><p class=\"thgroupid\">TRẠNG THÁI</p></th>\n");
      out.write("<th></th>\n");
      out.write("</tr>\n");

    for (Customer cus : customerDao.list()) {

      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td><p>");
      out.print(cus.getCustomerID());
      out.write("</p></td>\n");
      out.write("    <td><p>");
      out.print(cus.getCustomerName());
      out.write("</p></td>\n");
      out.write("    <td><p>");
      out.print(cus.getEmail());
      out.write("</p></td>\n");
      out.write("    <td><p>");
      out.print(cus.getAddress());
      out.write("</p></td>\n");
      out.write("    <td><p>");
      out.print(cus.getPhoneNumber());
      out.write("</p></td>\n");
      out.write("    <td><p>");
      out.print(cus.getUsername());
      out.write("</p></td>\n");
      out.write("    <td><p>");
      out.print(cus.getPassword());
      out.write("</p></td>\n");
      out.write("    <td><p>");
      out.print((cus.getRule() == 1) ? "Nhân viên" : "Khách hàng");
      out.write("</p></td>\n");
      out.write("    <td><p>");
      out.print((cus.getStatus() == 1) ? "Hoạt động" : "Khóa");
      out.write("</p></td>\n");
      out.write("\n");
      out.write("    <td>\n");
      out.write("        <a style=\"margin-left: 20px;color: #3333ff\" href=\"CustomerController?action=Sua&customerID=");
      out.print(cus.getCustomerID());
      out.write("\">SỬA</a> | <a style=\"color: #3333ff\" href=\"CustomerController?action=Khoa&customerID=");
      out.print(cus.getCustomerID());
      out.write("\">KHÓA</a>\n");
      out.write("    </td>\n");
      out.write("</tr>\n");
}
      out.write("\n");
      out.write("</table>\n");
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
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-md-6 s-c\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"fooll\">\n");
      out.write("                            <!--\t\t\t\t\t<h5>Theo dõi chúng tôi</h5>-->\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"social-ic\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\"><i class=\"facebok\"> </i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"twiter\"> </i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"goog\"> </i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"be\"> </i></a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"pp\"> </i></a></li>\n");
      out.write("                                <div class=\"clearfix\"></div>\t\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 s-c\">\n");
      out.write("                    <div class=\"stay\">\n");
      out.write("                        <div class=\"stay-left\">\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter your email to join our newsletter\" required=\"\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"btn-1\">\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"submit\" value=\"join\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-md-3 cust\">\n");
      out.write("                    <h4>CUSTOMER CARE</h4>\n");
      out.write("                    <li><a href=\"#\">Trung tâm hỗ trợ</a></li>\n");
      out.write("                    <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                    <li><a href=\"#\">Cách Mua Hàng</a></li>\n");
      out.write("                    <li><a href=\"#\">Delivery</a></li>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 abt\">\n");
      out.write("                    <h4>ABOUT US</h4>\n");
      out.write("                    <li><a href=\"#\">Our Stories</a></li>\n");
      out.write("                    <li><a href=\"#\">Press</a></li>\n");
      out.write("                    <li><a href=\"#\">Career</a></li>\n");
      out.write("                    <li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-2 myac\">\n");
      out.write("                    <h4>MY ACCOUNT</h4>\n");
      out.write("                    <li><a href=\"register.html\">Register</a></li>\n");
      out.write("                    <li><a href=\"#\">My Cart</a></li>\n");
      out.write("                    <li><a href=\"#\">Order History</a></li>\n");
      out.write("                    <li><a href=\"#\">Payment</a></li>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 our-st\">\n");
      out.write("                    <div class=\"our-left\">\n");
      out.write("                        <h4>OUR STORES</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"our-left1\">\n");
      out.write("                        <div class=\"cr_btn\">\n");
      out.write("                            <a href=\"#\">SOLO</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"our-left1\">\n");
      out.write("                        <div class=\"cr_btn1\">\n");
      out.write("                            <a href=\"#\">BOGOR</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                    <li><i class=\"add\"> </i>Jl. Haji Muhidin, Blok G no.69</li>\n");
      out.write("                    <li><i class=\"phone\"> </i>025-2839341</li>\n");
      out.write("                    <li><a href=\"mailto:info@example.com\"><i class=\"mail\"> </i>info@sitename.com </a></li>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("                <p>Copyrights © 2015 Gretong. All rights reserved | Template by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
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