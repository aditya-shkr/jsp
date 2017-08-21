package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/footer.html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/index.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" style=\"height:auto; background-color:#2874f0;\">\n");
      out.write("  \n");
      out.write(" <div class=\"container-fluid\" style=\"height:30px; float:right;\">\n");
      out.write("\t<ul class=\"nav navbar-nav\">\n");
      out.write("      <li><a class=\"lnk\" href=\"#\">F-Assured</a></li>\n");
      out.write("      <li><a class=\"lnk\" href=\"#\">Advertise</a></li>\n");
      out.write("\t  <li><a href=\"#\">Gift Card</a></li>\n");
      out.write("\t  <li><a href=\"#\">Download App</a></li>\n");
      out.write("\t  <li><a href=\"#\">24x7 Customer Care</a></li>\n");
      out.write("\t  <li><a href=\"#\">Track Order</a></li>\n");
      out.write("      <li><a href=\"#myModal\" data-toggle=\"modal\" data-targe=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login | Registeration</a></li>\n");
      out.write("    </ul>\n");
      out.write(" </div>\n");
      out.write("  \n");
      out.write("\t<div class=\"container-fluid\" style=\"margin-top:20px; height:55px; width:100%;\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t  <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("\t\t\t<img width=\"149\" src=\"img/fk-logo_9fddff.png\">\n");
      out.write("\t\t  </a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"navbar-header\" style=\"width:80%; margin-top:10px; padding:4px;\">\n");
      out.write("\t\t<form>\n");
      out.write("\t\t\t<div style=\"width:91%;\">\n");
      out.write("\t\t\t\t<div style=\"width:100%;\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"\" class=\"LM6RPg\" title=\"Search for Products, Brands and More\" name=\"q\" autocomplete=\"off\" placeholder=\"Search for Products, Brands and More\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div style=\"width:8%;\">\n");
      out.write("\t\t\t\t\t<div style=\"width:100%;\">\n");
      out.write("\t\t\t\t\t<button class=\"vh79eN\" type=\"submit\" data-reactid=\"48\">\n");
      out.write("\t\t\t\t\t\t<svg class=\"_2BhAHa\" width=\"15px\" height=\"15px\" data-reactid=\"49\"></svg>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\" >\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("\t</div>\n");
      out.write("\t  \n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div id=\"myModal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" >\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("\t<div class=\"modal-content\">\n");
      out.write("\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t  <h4 class=\"modal-title\">Registeration/Login</h4>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t<div class=\"tabbable\"> <!-- Only required for left/right tabs -->\n");
      out.write("\t\t\t\t<ul class=\"nav nav-tabs\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#login\" data-toggle=\"tab\">Login</a></li>\n");
      out.write("\t\t\t\t<li ><a href=\"#reg\" data-toggle=\"tab\">Registration</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"tab-content\">\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane active\" id=\"login\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\">Email address:</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"email\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"pwd\">Password:</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"pwd\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t<label><input type=\"checkbox\"> Remember me</label>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"tab-pane\" id=\"reg\">\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"text\">Name:</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"name\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"text\">Address:</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"add\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"text\">Phone:</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"phone\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"text\">Email:</label>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" id=\"pwd\">\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t  <div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t<label><input type=\"checkbox\"> Remember me</label>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t    </div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"modal-footer\">\n");
      out.write("\t\t<a href=\"#\" class=\"btn btn-primary\" data-dismiss=\"modal\">Close</a>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"gallery\">\n");
      out.write("\t<div>\n");
      out.write("\t\t<a>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<img src=\"img/background.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div>\n");
      out.write("\t\t<a></a>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<img src=\"img/background.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div>\n");
      out.write("\t\t<a></a>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<img src=\"img/background.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div>\n");
      out.write("\t\t<a>\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<img src=\"img/background.jpg\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("<div class=\"container\" style=\"margin-top:60px;\" >\n");
      out.write("  \n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<script type=\"text/javascript\" src=\"js\\jquery-3.1.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js\\bootstrap.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</html>");
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
