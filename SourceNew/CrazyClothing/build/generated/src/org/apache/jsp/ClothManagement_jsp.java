package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ClothDao;
import dao.GroupClothDao;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import model.*;

public final class ClothManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/MenuForAdmin.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>       \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cloth Management</title>\n");
      out.write("        <link href=\"css/AdminCSS/AdminCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("     <body>\n");
      out.write("        ");
            
            GroupClothDao grc = new GroupClothDao();
            ClothDao cld = new ClothDao();         
            String clothID = cld.sinhMa(cld.GetClothID());               
            ArrayList<Cloth> arr = cld.showCloth();
            int start =0, end =10;
            if (arr.size() < 9)
            {
                end = arr.size();
            }
            if (request.getParameter("start")!= null)
            {
                start = Integer.parseInt(request.getParameter("start"));
            }
            if (request.getParameter("end")!= null)
            {
                end = Integer.parseInt(request.getParameter("end"));
            }
            ArrayList<Cloth> list = cld.getListByPage(arr, start, end);                    
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
        
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">       \n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <ul class=\"megamenu skyblue\">\n");
      out.write("            <li class=\"active grid\"><a class=\"color1\" href=\"Admin.jsp\">Quản lý nhóm sản phẩm</a></li>              \n");
      out.write("            <li class=\"grid\"><a class=\"color2\" href=\"\">Quản lý đặt hàng</a></li> \n");
      out.write("            <li class=\"grid\"><a class=\"color2\" href=\"ClothManagement.jsp\">Quản lý sản phẩm</a></li> \n");
      out.write("            <li class=\"grid\"><a class=\"color2\" href=\"#\">Quản lý người dùng</a></li> \n");
      out.write("        </ul> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       \n");
      out.write("            <p style=\"font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center\">QUẢN LÝ SẢN PHẨM</p>          \n");
      out.write("                 <div class=\"registration_form\">\n");
      out.write("                            <!-- Form -->\n");
      out.write("                            <form id=\"registration_form\" action=\"ClothServlet\" method=\"post\">\t\t\t\t\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        <input name=\"clothID\" placeholder=\"");
      out.print(clothID);
      out.write("...\" type=\"text\" tabindex=\"1\">\n");
      out.write("                                    </label>                         \n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                      Nhóm sản phẩm: <select tabindex=\"2\" name=\"groupCloth\">\n");
      out.write("                                                        ");
for (GroupCloth gr : grc.showDanhMuc()) {
      out.write("\n");
      out.write("                                                        <option >");
      out.print(gr.getGroupID());
      out.write("</option>                                                 \n");
      out.write("                                                        ");
 }
      out.write("\n");
      out.write("                                                     </select>                                                   \n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        <input name=\"clothName\" placeholder=\"Tên sản phẩm\" type=\"text\" tabindex=\"3\">\n");
      out.write("                                    </label>                         \n");
      out.write("                                </div>\n");
      out.write("                                        <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        Hình ảnh:   <input name=\"image\" type=\"file\" tabindex=\"4\">\n");
      out.write("                                    </label>                                  \n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        <input placeholder=\"Số lượng...\"  value=\"\" name=\"quantity\" type=\"text\" tabindex=\"5\" >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\t\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        <input placeholder=\"Mô tả...\"  value=\"\" name=\"description\" type=\"text\" tabindex=\"6\" >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\t\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        <input placeholder=\"Giá bán...\"  value=\"\" name=\"price\" type=\"text\" tabindex=\"7\" >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        <input placeholder=\"Giảm giá...\"  value=\"\" name=\"sale\" type=\"text\" tabindex=\"8\" >\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        Trạng thái:   <select tabindex=\"9\" name=\"status\">\n");
      out.write("                                                        <option>1</option>\n");
      out.write("                                                        <option>0</option>\n");
      out.write("                                                      </select>\n");
      out.write("                                    </label>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <label>\n");
      out.write("                                        Mới:   <select tabindex=\"10\" name=\"neww\">\n");
      out.write("                                                    <option>1</option>\n");
      out.write("                                                    <option>0</option>\n");
      out.write("                                                </select>\n");
      out.write("                                    </label>                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <input type=\"submit\" value=\"Tạo mới\" id=\"register-submit\">\n");
      out.write("                                </div>\t\t\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                            <!-- /Form -->\n");
      out.write("                    </div>\n");
      out.write("         \n");
      out.write("            <div style=\" margin-left: auto;margin-right: auto;margin-bottom: 40px;margin-top: 40px\">\n");
      out.write("                <table style=\"padding: 10px\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th><p>Mã sản phẩm</p></th>\n");
      out.write("                        <th><p class=\"thclothid\">Nhóm sản phẩm</p></th>\n");
      out.write("                        <th><p class=\"thclothid\">Tên sản phẩm</p></th>\n");
      out.write("                        <th><p class=\"thclothid\">Hình ảnh</p></th>\n");
      out.write("                        <th><p class=\"thclothid\">Số lượng</p></th>\n");
      out.write("                        <th><p class=\"thclothid\">Mô tả</p></th>\n");
      out.write("                        <th><p class=\"thclothid\">Giá bán</p></th>   \n");
      out.write("                        <th><p class=\"thclothid\">Giảm giá</p></th>\n");
      out.write("                        <th><p class=\"thclothid\">Trạng thái</p></th>\n");
      out.write("                        <th><p class=\"thclothid\">Mới</p></th>\n");
      out.write("                        <th></th>\n");
      out.write("                    </tr>  \n");
      out.write("                   ");

                        for (Cloth cl : list) {                                
                   
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><p>");
      out.print(cl.getClothID().substring(0,6));
      out.write("...</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getGroupCloth().groupID.substring(0,6));
      out.write("...</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getClothName().substring(0,6));
      out.write("...</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getImage().substring(0,6));
      out.write("...</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getQuantity());
      out.write("</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getDescription());
      out.write("...</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getPrice());
      out.write("</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getSale());
      out.write("</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getSatus());
      out.write("</p></td>\n");
      out.write("                            <td><p style=\"padding-left: 40px\">");
      out.print(cl.getNeww());
      out.write("</p></td>      \n");
      out.write("                            <td>\n");
      out.write("                                <a style=\"margin-left: 20px;color: #3300ff\" href=\"EditCloth.jsp?clothID=");
      out.print(cl.getClothID());
      out.write("\">Edit</a>\n");
      out.write("                                <a style=\"margin-left: 20px;color: #3300ff\" href=\"DeleteClothServlet?clothID=");
      out.print(cl.getClothID());
      out.write("\">Delete</a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                   ");

                        }
                   
      out.write("             \n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("                   <ul class=\"pagination\">\n");
      out.write("                       ");

                            int a, b;
                            int limit = arr.size() / 9;
                            if (limit * 9 < arr.size()) {
                            limit += 1;
                            }
                        for (int i = 1; i <= limit; i++) 
                        {
                            a = (i - 1) * 9;
                            b = i * 9;                       
                          if (b > arr.size()) 
                          {
                             b = arr.size();
                          }
                        
      out.write("\n");
      out.write("                        <li class=\"active\"><a href=\"ClothManagement.jsp?start=");
      out.print(a);
      out.write("&end=");
      out.print(b);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</a></li>\n");
      out.write("                        ");

                            }
                        
      out.write("                     \n");
      out.write("                   </ul>\n");
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
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"col-md-6 s-c\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"fooll\">\r\n");
      out.write("                            <!--\t\t\t\t\t<h5>Theo dõi chúng tôi</h5>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <div class=\"social-ic\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"facebok\"> </i></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"twiter\"> </i></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"goog\"> </i></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"be\"> </i></a></li>\r\n");
      out.write("                                <li><a href=\"#\"><i class=\"pp\"> </i></a></li>\r\n");
      out.write("                                <div class=\"clearfix\"></div>\t\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6 s-c\">\r\n");
      out.write("                    <div class=\"stay\">\r\n");
      out.write("                        <div class=\"stay-left\">\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Enter your email to join our newsletter\" required=\"\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"btn-1\">\r\n");
      out.write("                            <form>\r\n");
      out.write("                                <input type=\"submit\" value=\"join\">\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"clearfix\"> </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"col-md-3 cust\">\r\n");
      out.write("                    <h4>CUSTOMER CARE</h4>\r\n");
      out.write("                    <li><a href=\"#\">Trung tâm hỗ trợ</a></li>\r\n");
      out.write("                    <li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Cách Mua Hàng</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Delivery</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-2 abt\">\r\n");
      out.write("                    <h4>ABOUT US</h4>\r\n");
      out.write("                    <li><a href=\"#\">Our Stories</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Press</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Career</a></li>\r\n");
      out.write("                    <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-2 myac\">\r\n");
      out.write("                    <h4>MY ACCOUNT</h4>\r\n");
      out.write("                    <li><a href=\"register.html\">Register</a></li>\r\n");
      out.write("                    <li><a href=\"#\">My Cart</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Order History</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Payment</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-5 our-st\">\r\n");
      out.write("                    <div class=\"our-left\">\r\n");
      out.write("                        <h4>OUR STORES</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"our-left1\">\r\n");
      out.write("                        <div class=\"cr_btn\">\r\n");
      out.write("                            <a href=\"#\">SOLO</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"our-left1\">\r\n");
      out.write("                        <div class=\"cr_btn1\">\r\n");
      out.write("                            <a href=\"#\">BOGOR</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                    <li><i class=\"add\"> </i>Jl. Haji Muhidin, Blok G no.69</li>\r\n");
      out.write("                    <li><i class=\"phone\"> </i>025-2839341</li>\r\n");
      out.write("                    <li><a href=\"mailto:info@example.com\"><i class=\"mail\"> </i>info@sitename.com </a></li>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"> </div>\r\n");
      out.write("                <p>Copyrights © 2015 Gretong. All rights reserved | Template by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
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
