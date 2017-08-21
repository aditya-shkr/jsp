package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form id=\"myForm\" >\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"num\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <input type=\"text\" class=\"text\" placeholder=\"number 1\" name=\"text1\" required>                     \n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <input type=\"text\" class=\"text\" placeholder=\"number 2\" name=\"text2\" required> \n");
      out.write("                </div>               \n");
      out.write("            </div>\n");
      out.write("             <span id=\"errmsg\"></span>\n");
      out.write("                    &nbsp&nbsp&nbsp&nbsp\n");
      out.write("            <div class=\"rslt\">\n");
      out.write("                <input type=\"text\" placeholder=\"result\" id=\"text3\" disabled> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"rslt\">\n");
      out.write("                <input type=\"submit\" value=\"+\" name=\"cal\" onclick=\"cal()\">\n");
      out.write("                <input type=\"submit\" value=\"-\" name=\"cal\" onclick=\"cal()\">\n");
      out.write("                <input type=\"submit\" value=\"/\" name=\"cal\" onclick=\"cal()\">\n");
      out.write("                <input type=\"submit\" value=\"*\" name=\"cal\" onclick=\"cal()\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function cal(){\n");
      out.write("                $.get(\"calculation.jsp\",{num1:$(\"#num1\").val(),num2:$(\"num2\").val()},doUpdate);\n");
      out.write("            }\n");
      out.write("            function doUpdate(response){\n");
      out.write("                if(\"#result\").val(response);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
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
