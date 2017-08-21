package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link href=\"css/index.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"menu\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"\">HOME</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">PHONES</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">TABLET</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">NEWS</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">REVIEWS</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"\">VIDEOS</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"login\">\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"login1\" value=\"login\">|\n");
      out.write("\t\t\t\t<a href=\"\">\n");
      out.write("\t\t\t\t<a href=\"\">Register</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"divider\">\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"body\">\n");
      out.write("\t\t\t<div class=\"filter\">Filter Page\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"menu2\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Android</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Apple</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Windows</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">BlackBerry</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Tablets</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Samsung</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">LG</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Motorola</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Sony</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">HTC</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Huawei</a></li>\n");
      out.write("\t\t\t\t\t<li ><a href=\"\">Alcatel</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"view\">\t\n");
      out.write("\t\t\t\t<a href=\"\">View All</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div style=\"width:1000px;height:220px;float:left;\">\n");
      out.write("\t\t\t\t<div class=\"image\">\t\n");
      out.write("\t\t\t\t\t<a href=\"\"></a>\n");
      out.write("\t\t\t\t\t<div class=\"imgtxt\">\t\n");
      out.write("\t\t\t\t\t<h3>8 biggest rumored features of the Galaxy S8</h3>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"image1\">\t\n");
      out.write("\t\t\t\t\t<div class=\"imgtxt\">\n");
      out.write("\t\t\t\t\t<h3>Galaxy A (2017) series: premium specs and features at an affordable price</h3>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"image2\">\t\n");
      out.write("\t\t\t\t\t<div class=\"imgtxt\">\n");
      out.write("\t\t\t\t\t<h3>PhoneArena-Awards-2016</h3>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"left\">\n");
      out.write("\t\t\t\t\t\t<div class=\"header1\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"subtext\">FEATURED STORIES\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"navigate\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"page\" id=\"nav1\" href=\"\">1</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"page\" id=\"nav2\" href=\"\">2</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"page\" id=\"nav3\" href=\"\">3</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"page\" id=\"nav4\" href=\"\">4</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"subpage\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"myclass\" id=\"a\" >\n");
      out.write("\t\t\t\t\t\t\t\t1\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"myclass\" id=\"b\" >\n");
      out.write("\t\t\t\t\t\t\t\t2\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"myclass\" id=\"c\" >\n");
      out.write("\t\t\t\t\t\t\t\t3\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"myclass\" id=\"d\" >\n");
      out.write("\t\t\t\t\t\t\t\t4\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<div style=\"padding-top:20px;\">\t\n");
      out.write("\t\t\t\t<div style=\"width:200px;float:left; height:150px; border-right:1px solid #404040;\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"footerb\" >\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Manufacturers</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Carriers</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">News</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Reviews</a></li>\n");
      out.write("\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"footerb\" style=\"border-right:1px solid #404040;\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Discussions</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Videos</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"footerc\">\n");
      out.write("\t\t\t\tAffliates:\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a>Cell Phone Accessories</a></li>,\n");
      out.write("\t\t\t\t\t<li><a>Tech Spot</a></li>,\n");
      out.write("\t\t\t\t\t<li><a>Speed Guide</a></li>,\n");
      out.write("\t\t\t\t\t<li><a>Cell Phone Accessories</a></li>,\n");
      out.write("\t\t\t\t\t<li><a>Pub Galaxy</a></li>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"footerd\">\n");
      out.write("\t\t\td\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"popup\">\n");
      out.write("\t\t<div class=\"transparent\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"loginpopup\">\n");
      out.write("\t\t\t<div class=\"main2\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<center><h3>Login</h3></center>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t<div class=\"main2\">\n");
      out.write("\t\t\t<div class=\"left\">\n");
      out.write("\t\t\tUser Name:\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right\">\n");
      out.write("\t\t\t<input type=\"text\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main2\">\n");
      out.write("\t\t\t<div class=\"left\">\n");
      out.write("\t\t\tPassword:\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right\">\n");
      out.write("\t\t\t<input type=\"text\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main2\">\n");
      out.write("\t\t\t<div style=\" width:50%;float:left; \">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Login\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div style=\" float:right; width:50%;\">\n");
      out.write("\t\t\t<input id=\"cancel\" type=\"button\" value=\"Cancel\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\"#a\").show();\n");
      out.write("\t\t\t$(\"#nav1\").addClass(\"pageactive\");\n");
      out.write("\t\t\t$('#login1').click(function(){\n");
      out.write("\t\t\t\t$('.popup').show();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$('#cancel').click(function(){\n");
      out.write("\t\t\t\t$('.popup').hide();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$('#nav1').click(function(){\n");
      out.write("\t\t\t\t$(\".myclass\").hide();\n");
      out.write("\t\t\t\t$('#a').show();\n");
      out.write("\t\t\t\t$('.pageactive').removeClass(\"pageactive\");\n");
      out.write("\t\t\t\t$('#nav1').addClass(\"pageactive\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$('#nav2').click(function(){\n");
      out.write("\t\t\t\t$(\".myclass\").hide();\n");
      out.write("\t\t\t\t$('#b').show();\n");
      out.write("\t\t\t\t$('.pageactive').removeClass(\"pageactive\");\n");
      out.write("\t\t\t\t$('#nav2').addClass(\"pageactive\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$('#nav3').click(function(){\n");
      out.write("\t\t\t\t$(\".myclass\").hide();\n");
      out.write("\t\t\t\t$('#c').show();\n");
      out.write("\t\t\t\t$('.pageactive').removeClass(\"pageactive\");\n");
      out.write("\t\t\t\t$('#nav3').addClass(\"pageactive\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$('#nav4').click(function(){\n");
      out.write("\t\t\t\t$(\".myclass\").hide();\n");
      out.write("\t\t\t\t$('#d').show();\n");
      out.write("\t\t\t\t$('.pageactive').removeClass(\"pageactive\");\n");
      out.write("\t\t\t\t$('#nav4').addClass(\"pageactive\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("        </html>");
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
