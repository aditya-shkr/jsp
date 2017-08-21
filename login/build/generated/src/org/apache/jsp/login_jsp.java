package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"check.jsp\" method=\"POST\">\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"main2\">\n");
      out.write("\t\t\t<center><h3>Login</h3></center>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main2\">\n");
      out.write("\t\t\t<div class=\"left\">\n");
      out.write("\t\t\tUser Name:\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right\">\n");
      out.write("\t\t\t<input type=\"text\" name=\"uname\" >\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main2\">\n");
      out.write("\t\t\t<div class=\"left\">\n");
      out.write("\t\t\tPassword:\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"right\">\n");
      out.write("                            <input type=\"password\" name=\"pass\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"main2\">\n");
      out.write("\t\t\t<center><input type=\"submit\" vlaue=\"Login\" ></center>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
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
