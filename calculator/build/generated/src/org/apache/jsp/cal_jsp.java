package org.apache.jsp;

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
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function validateForm() {\n");
      out.write("            var x = document.forms[\"myForm\"][\"text1\"].value;\n");
      out.write("            var y = document.forms[\"myForm\"][\"text2\"].value;\n");
      out.write("            if (x == \"\" || y==\"\") {\n");
      out.write("            alert(\"Number must be filled out\");\n");
      out.write("            return false;\n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    <script >\n");
      out.write("\t\t$(document).ready(function(){                \n");
      out.write("           $(\".text\").keypress(function (e) {\n");
      out.write("     //if the letter is not digit then display error and don't type anything\n");
      out.write("     if (e.which !== 8 && e.which !== 0 && (e.which < 48 || e.which > 57)) {\n");
      out.write("        //display error message\n");
      out.write("        $(\"#errmsg\").html(\"Digits Only\").show().fadeOut(\"slow\");\n");
      out.write("             \n");
      out.write("\t\t\t return false;\n");
      out.write("        }\n");
      out.write("    \n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("\t</script>\n");
      out.write("        <script>\n");
      out.write("        \n");
      out.write("        function calculate() {\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() {\n");
      out.write("    if (this.readyState == 4 && this.status == 200) {\n");
      out.write("     document.getElementById(\"text3\").innerHTML = this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"calculation.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form id=\"myForm\" >\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"num\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <input type=\"text\" class=\"text\" placeholder=\"number 1\" name=\"text1\" required> \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <input type=\"text\" class=\"text\" placeholder=\"number 2\" name=\"text2\" required> \n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("             <span id=\"errmsg\"></span>\n");
      out.write("                    &nbsp&nbsp&nbsp&nbsp\n");
      out.write("            <div class=\"rslt\">\n");
      out.write("                <input type=\"text\" placeholder=\"result\" id=\"text3\" disabled> \n");
      out.write("            </div>\n");
      out.write("            <div class=\"rslt\">\n");
      out.write("                <input type=\"submit\" value=\"+\" name=\"cal\" onclick=\"calculate()\">\n");
      out.write("                <input type=\"submit\" value=\"-\" name=\"cal\" onclick=\"validateForm()\">\n");
      out.write("                <input type=\"submit\" value=\"/\" name=\"cal\" onclick=\"validateForm()\">\n");
      out.write("                <input type=\"submit\" value=\"*\" name=\"cal\" onclick=\"validateForm()\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
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
