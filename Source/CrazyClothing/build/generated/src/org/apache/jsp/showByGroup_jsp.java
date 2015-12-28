package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.GroupCloth;
import model.Cloth;
import dao.ClothDao;
import dao.GroupClothDao;

public final class showByGroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <div class=\"special\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h4>SẢN PHẨM THEO NHÓM</h4>\n");
      out.write("\t\t<div class=\"specia-top\">\n");
      out.write("\t\t\t<ul class=\"grid_2\">\n");
      out.write("                            ");
 GroupClothDao clothDao = new GroupClothDao(); 
      out.write("\n");
      out.write("                            ");
for(Cloth cloth : clothDao.showClothByGroup(request.getParameter("groupID"))) {
      out.write("\n");
      out.write("\t\t<li>\n");
      out.write("                    <a href=\"Clothdetail.jsp?ClothID=");
      out.print(cloth.getClothID());
      out.write("\"><img src=\"");
      out.print(cloth.getImage() );
      out.write("\" class=\"img-responsive\" alt=\"\"></a>\n");
      out.write("\t\t\t\t<div class=\"special-info grid_1 simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t<h5>");
      out.print(cloth.getClothName());
      out.write("</h5>\n");
      out.write("\t\t\t\t\t<div class=\"item_add\"><span class=\"item_price\"><h6>");
      out.print(cloth.getPrice());
      out.write(" VNĐ</h6></span></div>\n");
      out.write("\t\t\t\t\t<div class=\"item_add\"><span class=\"item_price\"><a href=\"#\">THÊM VÀO GIỎ</a></span></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>        \n");
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
