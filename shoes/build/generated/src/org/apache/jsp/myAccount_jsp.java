package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class myAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/conn.jsp");
    _jspx_dependants.add("/menuLogin.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jssor.slider-22.2.16.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        jssor_1_slider_init = function() {\n");
      out.write("\n");
      out.write("            var jssor_1_options = {\n");
      out.write("              $AutoPlay: true,\n");
      out.write("              $SlideDuration: 800,\n");
      out.write("              $SlideEasing: $Jease$.$OutQuint,\n");
      out.write("              $ArrowNavigatorOptions: {\n");
      out.write("                $Class: $JssorArrowNavigator$\n");
      out.write("              },\n");
      out.write("              $BulletNavigatorOptions: {\n");
      out.write("                $Class: $JssorBulletNavigator$\n");
      out.write("              }\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            var jssor_1_slider = new $JssorSlider$(\"jssor_1\", jssor_1_options);\n");
      out.write("\n");
      out.write("            /*responsive code begin*/\n");
      out.write("            /*remove responsive code if you don't want the slider scales while window resizing*/\n");
      out.write("            function ScaleSlider() {\n");
      out.write("                var refSize = jssor_1_slider.$Elmt.parentNode.clientWidth;\n");
      out.write("                if (refSize) {\n");
      out.write("                    refSize = Math.min(refSize, 1500);\n");
      out.write("                    jssor_1_slider.$ScaleWidth(refSize);\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    window.setTimeout(ScaleSlider, 30);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            ScaleSlider();\n");
      out.write("            $Jssor$.$AddEvent(window, \"load\", ScaleSlider);\n");
      out.write("            $Jssor$.$AddEvent(window, \"resize\", ScaleSlider);\n");
      out.write("            $Jssor$.$AddEvent(window, \"orientationchange\", ScaleSlider);\n");
      out.write("            /*responsive code end*/\n");
      out.write("        };\n");
      out.write("    </script>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoes","root","");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<!--menu bar-->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>   \n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><img src=\"images/logo1.png\"></a>                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">MEN<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Page 1-1</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-2</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-3</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">WOMEN</a></li>\n");
      out.write("                    <li><a href=\"#\">BRANDS</a></li>\n");
      out.write("                    <li><a href=\"#\">SALE</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div style=\"float: right; top: 0;\">\n");
      out.write("                <form class=\"navbar-form navbar-left\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button class=\"btn btn-default\" type=\"submit\">\n");
      out.write("                                <i class=\"fa fa-search\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"><span class=\"fa fa-shopping-cart\"/></a>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    \n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"> Hi ");
      out.print(session.getAttribute("fname"));
      out.write("<span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                            <li><a href=\"#\">Page 1-1</a></li>\n");
      out.write("                            <li><a href=\"#\">Page 1-2</a></li>\n");
      out.write("                            <li><a href=\"#\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>               \n");
      out.write("            </div>            \n");
      out.write("        </div>\n");
      out.write("    </nav>");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12 col-md-12 col-lg-12 content-center\">\n");
      out.write("                <div class=\"block\">\n");
      out.write("                    <ul >\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">Account Information</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">Address Book</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">My Orders</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">My Wishlist</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"\">Returns</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--dashboard-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12 col-md-12 col-lg-12 content-center\" style=\"text-align: center;margin-top: 100px; border-bottom: 1px solid black;\">\n");
      out.write("                <h1>My DASHBOARD</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-12 col-md-12 col-lg-12 content-center\" style=\"margin-top: 30px; padding: 10px; border-bottom: 1px solid black;\">\n");
      out.write("                <p>Hello ");
      out.print(session.getAttribute("fname"));
      out.write(' ');
      out.print(session.getAttribute("lname"));
      out.write("!</p>\n");
      out.write("                <p>From your My Account Dashboard you have the ability to view a snapshot of your recent account activity and update your account information. Select a link below to view or edit information.</p>\n");
      out.write("                <p><b>Account Information</b></p>\n");
      out.write("                <br>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"row\" style=\"margin-top: 30px; margin-bottom: 30px; border-bottom: 1px solid black;\">\n");
      out.write("                    <div class=\"col-md-6\" style=\"margin-top: 20px;\">\n");
      out.write("                        <div><b>Contact Information</b><span style=\"float:right;\"><a href=\"edit.jsp\">Edit</a></span></div>\n");
      out.write("                        <p>");
      out.print(session.getAttribute("fname"));
      out.write(' ');
      out.print(session.getAttribute("lname"));
      out.write("</p>\n");
      out.write("                        <p>");
      out.print(session.getAttribute("email"));
      out.write("</p>\n");
      out.write("                        <br>\n");
      out.write("                        <div><b>ADDRESS BOOK</b></div>\n");
      out.write("                        <br>\n");
      out.write("                        <h6><b>DEFAULT SHIPPING ADDRESS</b></h6>\n");
      out.write("                        <p>You have not set a default billing address.</p>\n");
      out.write("                        <p><a href=\"#\">Edit Address</a></p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\" style=\"margin-top: 20px;\">\n");
      out.write("                        <div><b>News Letters</b><span style=\"float:right;\"><a href=\"edit.jsp\">Edit</a></span></div>\n");
      out.write("                        <p>You are currently not subscribed to any newsletter.</p>\n");
      out.write("                        <br>\n");
      out.write("                        <div><span style=\"float:right;\"><a href=\"editaddr.jsp\">Manage Addresses</a></span></div>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <h6><b>DEFAULT SHIPPING ADDRESS</b></h6>\n");
      out.write("                        <p>You have not set a default billing address.</p>\n");
      out.write("                        <p><a href=\"#\">Edit Address</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>   \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"col-sm-6 col-md-6 col-lg-6\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6 col-md-6 col-lg-6\"></div>\n");
      out.write("                    </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
