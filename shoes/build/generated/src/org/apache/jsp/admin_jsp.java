package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
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
      out.write("        <link href=\"css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/_all-skins.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/blue.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/bootstrap3-wysihtml5.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/datepicker3.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/daterangepicker.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/jquery-jvectormap-1.2.2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/morris.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("  <header class=\"main-header\">\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <a href=\"index2.html\" class=\"logo\">\n");
      out.write("      <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("      <span class=\"logo-mini\"><b>IND</b>A</span>\n");
      out.write("      <!-- logo for regular state and mobile devices -->\n");
      out.write("      <span class=\"logo-lg\"><b>Indian</b>ANDAZ</span>\n");
      out.write("    </a>\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\n");
      out.write("      <!-- Sidebar toggle button-->\n");
      out.write("      <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("      </a>\n");
      out.write("\n");
      out.write("      <div class=\"navbar-custom-menu\">\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("          <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("\n");
      out.write("          <!-- Notifications: style can be found in dropdown.less -->\n");
      out.write("\n");
      out.write("          <!-- Tasks: style can be found in dropdown.less -->\n");
      out.write("\n");
      out.write("          <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("          <li class=\"dropdown user user-menu\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("              <img src=\"dist/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("              <span class=\"hidden-xs\">Admin</span>\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("              <!-- User image -->\n");
      out.write("              <li class=\"user-header\">\n");
      out.write("                <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                <p>\n");
      out.write("                  Ashwini N.-Admin Indian ANDAZ\n");
      out.write("                  <small>since 2017</small>\n");
      out.write("                </p>\n");
      out.write("              </li>\n");
      out.write("              <!-- Menu Body -->\n");
      out.write("              <li class=\"user-body\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\n");
      out.write("                    <a href=\"#\">Vendors</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\n");
      out.write("                    <a href=\"#\">Sales</a>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-xs-4 text-center\">\n");
      out.write("                    <a href=\"#\">Stocks</a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("              </li>\n");
      out.write("              <!-- Menu Footer-->\n");
      out.write("              <li class=\"user-footer\">\n");
      out.write("                <div class=\"pull-left\">\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pull-right\">\n");
      out.write("                  <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("  <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("  <aside class=\"main-sidebar\">\n");
      out.write("    <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("    <section class=\"sidebar\">\n");
      out.write("      <!-- Sidebar user panel -->\n");
      out.write("      <div class=\"user-panel\">\n");
      out.write("        <div class=\"pull-left image\">\n");
      out.write("          <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"pull-left info\">\n");
      out.write("          <p>Admin</p>\n");
      out.write("          <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- search form -->\n");
      out.write("      <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("        <div class=\"input-group\">\n");
      out.write("          <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("              <span class=\"input-group-btn\">\n");
      out.write("                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\n");
      out.write("                </button>\n");
      out.write("              </span>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("      <!-- /.search form -->\n");
      out.write("      <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("      <ul class=\"sidebar-menu\">\n");
      out.write("        <li class=\"header\">MAIN NAVIGATION</li>\n");
      out.write("        <li class=\"active treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-dashboard\"></i> <span>Dashboard<a href=\"index.html\"></span>\n");
      out.write("<!--             <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span> -->\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("           <!--  <li class=\"active\"><a href=\"index.html\"><i class=\"fa fa-circle-o\"></i> Dashboard v1</a></li> -->\n");
      out.write("            <!-- <li><a href=\"index2.html\"><i class=\"fa fa-circle-o\"></i> Dashboard v2</a></li> -->\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-files-o\"></i>\n");
      out.write("            <span>Orders</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"pages/layout/top-nav.html\"><i class=\"fa fa-circle-o\"></i> Add Order</a></li>\n");
      out.write("            <li><a href=\"pages/layout/boxed.html\"><i class=\"fa fa-circle-o\"></i> Cancel Order</a></li>\n");
      out.write("            <li><a href=\"pages/layout/fixed.html\"><i class=\"fa fa-circle-o\"></i> Update Order</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-pie-chart\"></i>\n");
      out.write("            <span>Products</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"pages/charts/add product.html\"><i class=\"fa fa-circle-o\"></i> Add Product</a></li>\n");
      out.write("            <li><a href=\"pages/charts/update product.html\"><i class=\"fa fa-circle-o\"></i> Update Product</a></li>\n");
      out.write("            <li><a href=\"pages/charts/flot.html\"><i class=\"fa fa-circle-o\"></i> Remove Product</a></li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-laptop\"></i>\n");
      out.write("            <span>Stock</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"pages/UI/general.html\"><i class=\"fa fa-circle-o\"></i> Stock Details</a></li>\n");
      out.write("            <li><a href=\"pages/UI/icons.html\"><i class=\"fa fa-circle-o\"></i> Check Availability</a></li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-edit\"></i> <span>Vendors</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"pages/forms/general.html\"><i class=\"fa fa-circle-o\"></i> Add Vendors</a></li>\n");
      out.write("            <li><a href=\"pages/forms/advanced.html\"><i class=\"fa fa-circle-o\"></i> Remove Vendors</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"treeview\">\n");
      out.write("          <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-table\"></i> <span>Reports</span>\n");
      out.write("            <span class=\"pull-right-container\">\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"pages/tables/order details.html\"><i class=\"fa fa-circle-o\"></i> Order Details</a></li>\n");
      out.write("            <li><a href=\"pages/tables/product details.html\"><i class=\"fa fa-circle-o\"></i> Product Details</a></li>\n");
      out.write("\t\t\t<li><a href=\"pages/tables/vendor details.html\"><i class=\"fa fa-circle-o\"></i> Vendor Details</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </section>\n");
      out.write("    <!-- /.sidebar -->\n");
      out.write("  </aside>\n");
      out.write("\n");
      out.write("  <!-- Content Wrapper. Contains page content -->\n");
      out.write("  <div class=\"content-wrapper\">\n");
      out.write("    <!-- Content Header (Page header) -->\n");
      out.write("    <section class=\"content-header\">\n");
      out.write("      <h1>\n");
      out.write("        Dashboard\n");
      out.write("        <small>Control panel</small>\n");
      out.write("      </h1>\n");
      out.write("      <ol class=\"breadcrumb\">\n");
      out.write("        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("        <li class=\"active\">Dashboard</li>\n");
      out.write("      </ol>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <!-- Main content -->\n");
      out.write("    <section class=\"content\">\n");
      out.write("      <!-- Small boxes (Stat box) -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\n");
      out.write("          <!-- small box -->\n");
      out.write("          <div class=\"small-box bg-aqua\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("              <h3>150</h3>\n");
      out.write("\n");
      out.write("              <p>Orders</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon\">\n");
      out.write("              <i class=\"ion ion-bag\"></i>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#\" class=\"small-box-footer\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ./col -->\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\n");
      out.write("          <!-- small box -->\n");
      out.write("          <div class=\"small-box bg-green\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("              <h3>53</h3>\n");
      out.write("\n");
      out.write("              <p>Products</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon\">\n");
      out.write("              <i class=\"ion ion-stats-bars\"></i>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#\" class=\"small-box-footer\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ./col -->\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\n");
      out.write("          <!-- small box -->\n");
      out.write("          <div class=\"small-box bg-yellow\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("              <h3>44</h3>\n");
      out.write("\n");
      out.write("              <p>Customer Registered</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon\">\n");
      out.write("              <i class=\"ion ion-person-add\"></i>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#\" class=\"small-box-footer\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ./col -->\n");
      out.write("        <div class=\"col-lg-3 col-xs-6\">\n");
      out.write("          <!-- small box -->\n");
      out.write("          <div class=\"small-box bg-red\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("              <h3>65</h3>\n");
      out.write("\n");
      out.write("              <p>Available Stock</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon\">\n");
      out.write("              <i class=\"ion ion-pie-graph\"></i>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#\" class=\"small-box-footer\">More info <i class=\"fa fa-arrow-circle-right\"></i></a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ./col -->\n");
      out.write("      </div>\n");
      out.write("      <!-- /.row -->\n");
      out.write("      <!-- Main row -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <!-- Left col -->\n");
      out.write("        <section class=\"col-lg-7 connectedSortable\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("          <div class=\"box box-solid bg-teal-gradient\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- right col -->\n");
      out.write("      </div>\n");
      out.write("      <!-- /.row (main row) -->\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <!-- /.content -->\n");
      out.write("  </div>\n");
      out.write("  <!-- /.content-wrapper -->\n");
      out.write("  <footer class=\"main-footer\">\n");
      out.write("    <div class=\"pull-right hidden-xs\">\n");
      out.write("      <b>Version</b> 2.3.12\n");
      out.write("    </div>\n");
      out.write("    <strong>Copyright &copy; 2014-2016 <a href=\"http://indian-andaz.com\">Indian-ANDAZ</a>.</strong> All rights\n");
      out.write("    reserved.\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("  <div class=\"control-sidebar-bg\"></div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/bootstrap-datepicker.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/additional-methods.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write('\n');
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
