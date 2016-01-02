package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Cloth;
import dao.ClothDao;

public final class specialCloth_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div class=\"special\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h4>SẢN PHẨM NỔI BẬT</h4>\r\n");
      out.write("                <div class=\"specia-top\">\r\n");
      out.write("                    <ul class=\"grid_2\">\r\n");
      out.write("                        ");
 ClothDao clothDao = new ClothDao(); 
      out.write("\r\n");
      out.write("                        ");
for (Cloth cloth : clothDao.showSpecialCloth()) {
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"ShowDetailCloth.jsp?ClothID=");
      out.print(cloth.getClothID());
      out.write("\"><img src=\"");
      out.print(cloth.getImage());
      out.write("\" class=\"img-responsive\" alt=\"\"></a>\r\n");
      out.write("                            <div class=\"special-info grid_1 simpleCart_shelfItem\">\r\n");
      out.write("                                <h5>");
      out.print(cloth.getClothName());
      out.write("</h5>\r\n");
      out.write("                                <div class=\"item_add\"><span class=\"item_price\"> <h6>");
      out.print(cloth.getPrice());
      out.write(" VNĐ</h6></span>\r\n");
      out.write("                                    <span class=\"code\">Sales: ");
      out.print(cloth.getSale());
      out.write(" %</span>\t\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item_add\"><span class=\"item_price\"><a href=\"CartServlet?command=buy&clothID=");
      out.print(cloth.getClothID());
      out.write("\">THÊM VÀO GIỎ</a></span></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
