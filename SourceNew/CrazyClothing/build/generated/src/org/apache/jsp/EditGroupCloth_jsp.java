package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.GroupClothDao;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import model.*;

public final class EditGroupCloth_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/MenuForAdmin.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Edit GroupCloth</title>\n");
      out.write("        <link href=\"css/AdminCSS/AdminCss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
            
            GroupClothDao grc = new GroupClothDao();           
            String groupID = request.getParameter("groupID");
            request.setAttribute("getGroupClothID", grc.GetGroupCloth(groupID));
        
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
      out.write("            <li class=\"active grid\"><a class=\"color1\" href=\"#\">Quản lý đặt hàng</a></li>              \n");
      out.write("            <li class=\"grid\"><a class=\"color2\" href=\"Admin.jsp\">Quản lý nhóm sản phẩm</a></li> \n");
      out.write("            <li class=\"grid\"><a class=\"color2\" href=\"#\">Quản lý sản phẩm</a></li> \n");
      out.write("            <li class=\"grid\"><a class=\"color2\" href=\"#\">Quản lý người dùng</a></li> \n");
      out.write("        </ul> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("       \n");
      out.write("            <p style=\"font-size: 20px; margin-top: 40px;margin-bottom: 40px;text-align: center\">CẬP NHẬT NHÓM SẢN PHẨM</p>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("          \n");
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
      out.write("  \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${getGroupClothID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                 <div class=\"registration_form\">                     \n");
          out.write("                          <form id=\"registration_form\" action=\"\" method=\"post\">\t\t\t\t\n");
          out.write("                                <div>\n");
          out.write("                                    <label>\n");
          out.write("                                        <input name=\"groupID\" placeholder=\"\" type=\"text\" tabindex=\"1\">\n");
          out.write("                                    </label>                         \n");
          out.write("                                </div>\n");
          out.write("                                <div>\n");
          out.write("                                    <label>\n");
          out.write("                                        <input placeholder=\"Tên nhóm...\" name=\"groupName\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.groupName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"text\" tabindex=\"2\" required>\n");
          out.write("                                    </label>\n");
          out.write("                                </div>\n");
          out.write("                                <div>\n");
          out.write("                                    <label>\n");
          out.write("                                        <input placeholder=\"Hình ảnh...\" name=\"image\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" type=\"text\" tabindex=\"3\" >\n");
          out.write("                                    </label>\n");
          out.write("                                </div>\n");
          out.write("                                <div>\n");
          out.write("                                    <label>\n");
          out.write("                                        <input placeholder=\"...\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.groupTop}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"groupTop\" type=\"text\" tabindex=\"4\" >\n");
          out.write("                                    </label>\n");
          out.write("                                </div>\t\t\t\t                                                            \t\t\t\t                          \n");
          out.write("                                <div>\n");
          out.write("                                    <input type=\"submit\" value=\"Chấp nhận\" id=\"register-submit\">\n");
          out.write("                                </div>\t\t\n");
          out.write("                            </form>                                    \n");
          out.write("                 </div>  \n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
