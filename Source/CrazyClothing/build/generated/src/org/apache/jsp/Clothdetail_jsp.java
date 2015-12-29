package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import model.GroupCloth;
import dao.GroupClothDao;
import model.Cloth;
import dao.ClothDao;

public final class Clothdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>      \r\n");
      out.write("        ");
 
            ClothDao cl = new ClothDao();                      
            Cloth cloth = cl.ShowDetailCloth(request.getParameter("ClothID"));  
            GroupClothDao grc = new GroupClothDao();
            GroupCloth gr = grc.GetGroupCloth(cloth.getGroupCloth().getGroupID());
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(0);
        
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        <div class=\"women_main\">\r\n");
      out.write("\t<!-- start content -->\r\n");
      out.write("\t\t\t<div class=\"row single\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9 det\">\r\n");
      out.write("\t\t\t\t  <div class=\"single_left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"grid images_3_of_2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"flexslider\">\r\n");
      out.write("\t\t\t\t\t\t\t        <!-- FlexSlider -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script src=\"js/imagezoom.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  <script defer src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t// Can also be used with $(document).ready()\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(window).load(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  $('.flexslider').flexslider({\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tanimation: \"slide\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tcontrolNav: \"thumbnails\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- //FlexSlider-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t  <ul class=\"slides\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li data-thumb=\"images/d1.jpg\">\r\n");
      out.write("                                                                    <div class=\"thumb-image\"> <img src=\"");
      out.print(cloth.getImage());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li data-thumb=\"images/d2.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <div class=\"thumb-image\"> <img src=\"");
      out.print(cloth.getImage());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li data-thumb=\"images/d3.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"thumb-image\"> <img src=\"");
      out.print(cloth.getImage());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li data-thumb=\"images/d4.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t\t   <div class=\"thumb-image\"> <img src=\"");
      out.print(cloth.getImage());
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t  <div class=\"desc1 span_3_of_2\">\r\n");
      out.write("\t\t\t\t\t<h3>");
      out.print(cloth.getClothName());
      out.write("</h3>\r\n");
      out.write("                                        <span class=\"brand\">Nhãn hiệu: <a href=\"ShowGroup.jsp?groupCloth.groupID=\">");
      out.print(gr.getGroupName());
      out.write("</a></span>\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<span class=\"code\">Mã sản phẩm: ");
      out.print(cloth.getClothID());
      out.write("</span>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"price\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"text\">Giá:</span>\r\n");
      out.write("                                                        <span class=\"price-new\">");
      out.print(nf.format(cloth.getPrice()));
      out.write(" VNĐ</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"det_nav1\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Select a size :</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\" sky-form col col-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>L</label></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>S</label></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>M</label></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>XL</label></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"btn_form\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"checkout.html\">MUA</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><span>đăng nhập để được giảm giá </span></a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t   \t </div>\r\n");
      out.write("          \t    <div class=\"clearfix\"></div>\r\n");
      out.write("          \t   </div>\r\n");
      out.write("          \t    <div class=\"single-bottom1\">\r\n");
      out.write("\t\t\t\t\t<h6>Chi tiết sản phẩm</h6>\r\n");
      out.write("\t\t\t\t\t<p class=\"prod-desc\">");
      out.print(cloth.getDescription());
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t       </div>\t\r\n");
      out.write("\t\t   <div class=\"clearfix\"></div>\t\t\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t<!-- end content -->\r\n");
      out.write("</div>\r\n");
      out.write("</div>      \r\n");
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
