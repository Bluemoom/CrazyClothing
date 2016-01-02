package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <title>Register</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Playfair+Display:400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"main\">\n");
      out.write("        <div class=\"registration\">\n");
      out.write("\t\t<div class=\"registration_left\">\n");
      out.write("\t\t<h2>new user? <span> create an account </span></h2>\n");
      out.write("\t\t<!-- [if IE] \n");
      out.write("\t\t    < link rel='stylesheet' type='text/css' href='ie.css'/>  \n");
      out.write("\t\t [endif] -->  \n");
      out.write("\t\t  \n");
      out.write("\t\t<!-- [if lt IE 7]>  \n");
      out.write("\t\t    < link rel='stylesheet' type='text/css' href='ie6.css'/>  \n");
      out.write("\t\t<! [endif] -->  \n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t(function() {\n");
      out.write("\t\t\n");
      out.write("\t\t\t// Create input element for testing\n");
      out.write("\t\t\tvar inputs = document.createElement('input');\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// Create the supports object\n");
      out.write("\t\t\tvar supports = {};\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tsupports.autofocus   = 'autofocus' in inputs;\n");
      out.write("\t\t\tsupports.required    = 'required' in inputs;\n");
      out.write("\t\t\tsupports.placeholder = 'placeholder' in inputs;\n");
      out.write("\t\t\n");
      out.write("\t\t\t// Fallback for autofocus attribute\n");
      out.write("\t\t\tif(!supports.autofocus) {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// Fallback for required attribute\n");
      out.write("\t\t\tif(!supports.required) {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t\t// Fallback for placeholder attribute\n");
      out.write("\t\t\tif(!supports.placeholder) {\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t// Change text inside send button on submit\n");
      out.write("\t\t\tvar send = document.getElementById('register-submit');\n");
      out.write("\t\t\tif(send) {\n");
      out.write("\t\t\t\tsend.onclick = function () {\n");
      out.write("\t\t\t\t\tthis.innerHTML = '...Sending';\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\t})();\n");
      out.write("\t\t</script>\n");
      out.write("\t\t <div class=\"registration_form\">\n");
      out.write("\t\t <!-- Form -->\n");
      out.write("\t\t\t<form id=\"registration_form\" action=\"contact.php\" method=\"post\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"first name:\" type=\"text\" tabindex=\"1\" required autofocus>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"last name:\" type=\"text\" tabindex=\"2\" required autofocus>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"email address:\" type=\"email\" tabindex=\"3\" required>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"sky-form\">\n");
      out.write("\t\t\t\t\t<div class=\"sky_form1\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><label class=\"radio left\"><input type=\"radio\" name=\"radio\" checked=\"\"><i></i>Male</label></li>\n");
      out.write("\t\t\t\t\t\t\t<li><label class=\"radio\"><input type=\"radio\" name=\"radio\"><i></i>Female</label></li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"password\" type=\"password\" tabindex=\"4\" required>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"retype password\" type=\"password\" tabindex=\"4\" required>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"create an account\" id=\"register-submit\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"sky-form\">\n");
      out.write("\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" ><i></i>i agree to shoppe.com &nbsp;<a class=\"terms\" href=\"#\"> terms of service</a> </label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<!-- /Form -->\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"registration_left\">\n");
      out.write("\t\t<h2>existing user</h2>\n");
      out.write("\t\t <div class=\"registration_form\">\n");
      out.write("\t\t <!-- Form -->\n");
      out.write("\t\t\t<form id=\"registration_form\" action=\"contact.php\" method=\"post\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"email:\" type=\"email\" tabindex=\"3\" required>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<label>\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"password\" type=\"password\" tabindex=\"4\" required>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"sign in\" id=\"register-submit\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"forget\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">forgot your password</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<!-- /Form -->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
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
