package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Nivoslider_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"css/megamenu_1.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"Nivoslider/nivo-slider.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"Nivoslider/jquery.nivo.slider.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"Nivoslider/jquery.nivo.slider.pack.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("          <div class=\"arriv\">      \r\n");
      out.write("             <div id=\"beforeNAVMENU\">            \r\n");
      out.write("                        <div id=\"slider\" class=\"nivoSlider\">\r\n");
      out.write("                            <img src=\"images/BACK VENT PENCIL SKIRT.jpg\" alt=\"\"/>\r\n");
      out.write("                            <img src=\"images/BASIC CARDIGAN.jpg\" alt=\"\"/>\r\n");
      out.write("                            <img src=\"images/BASIC SEAMS TOP.jpg\" alt=\"\"/>\r\n");
      out.write("                            <img src=\"images/BELT LONG CARDIGAN.jpg\" alt=\"\"/>\r\n");
      out.write("                            <img src=\"images/BELT PRINTED DRESS.jpg\" alt=\"\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("         </div>             \r\n");
      out.write("        </div>     \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("        $(window).load(function() {\r\n");
      out.write("            $('#slider').nivoSlider({\r\n");
      out.write("                controlNav: false,\r\n");
      out.write("                nextText: '',\r\n");
      out.write("                prevText:'',\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        </script>\r\n");
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
