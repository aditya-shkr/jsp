package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/conn.jsp");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/newcss.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/select2.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/dataTables.bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/jquery-ui.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");

      out.write('\n');
      out.write("\n");
      out.write("<title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"outer\">\n");
      out.write("                ");
             
                    int id=Integer.parseInt(request.getParameter("id"));
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from student where id="+id);
                    while(rs.next())
                    {
                
      out.write("\n");
      out.write("    <form name=\"editForm\" action=\"update.jsp\">\n");
      out.write("      <div class=\"form-group row\">\n");
      out.write("          <input type=\"hidden\" id=\"id\" name=\"id\" value=\"");
      out.print(rs.getInt("id"));
      out.write("\">\n");
      out.write("          <label for=\"lblname\" class=\"col-sm-3 col-form-label\">Name</label>\n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("          <input type=\"text\"  class=\"form-control\" placeholder=\"Name\" id=\"name\" name=\"name\" value=\"");
      out.print(rs.getString("name") );
      out.write("\" required ><span class=\"fa fa-user err\"/>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group row\">\n");
      out.write("      <label for=\"lblemail\" class=\"col-sm-3 col-form-label\">Email</label>\n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("        <input type=\"email\" class=\"form-control\" placeholder=\"Email\" id=\"email\" name=\"email\" value=\"");
      out.print(rs.getString("email") );
      out.write("\" required><span class=\" fa fa-envelope err\"/>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group row\">\n");
      out.write("      <label for=\"lbladdress\" class=\"col-sm-3 col-form-label\">Address</label>\n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Address\" id=\"address\" name=\"address\" value=\"");
      out.print(rs.getString("address") );
      out.write("\" required><span class=\"fa fa-map-marker err\"/>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form-group row\">\n");
      out.write("      <label for=\"lblmobile\" class=\"col-sm-3 col-form-label\">Mobile</label>\n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Mobile\" id=\"mobile\" name=\"mobile\" value=\"");
      out.print(rs.getString("mobile") );
      out.write("\" required minlength=\"10\" maxlength=\"10\"><span class=\"fa fa-mobile err\"/>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form-group row\">\n");
      out.write("      <label for=\"lblphone\" class=\"col-sm-3 col-form-label\">Phone</label>\n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"phone\" placeholder=\"Phone\" id=\"phone\" value=\"");
      out.print(rs.getString("phone") );
      out.write("\" required minlength=\"11\" maxlength=\"11\"><span class=\"fa fa-phone err\"/>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <fieldset class=\"form-group row\">\n");
      out.write("      <label for=\"lblgender\" class=\"col-sm-3 col-form-label\">Gender</label>\n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("        <div class=\"form-check\">\n");
      out.write("          <label class=\"form-check-label\">\n");
      out.write("            <input class=\"form-check-input\" type=\"radio\" name=\"gen\"  value=\"Male\" checked>\n");
      out.write("            Male\n");
      out.write("          </label>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-check\">\n");
      out.write("          <label class=\"form-check-label\">\n");
      out.write("            <input class=\"form-check-input\" type=\"radio\" name=\"gen\"  value=\"Female\">\n");
      out.write("            Female\n");
      out.write("          </label>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </fieldset>\n");
      out.write("      <div class=\"form-group row\">\n");
      out.write("      <label for=\"lblphone\" class=\"col-sm-3 col-form-label\">Marital Status</label>\n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("          \n");
      out.write("          <select class=\"custom-select mb-2 mr-sm-2 mb-sm-0\" id=\"maritalStatus\" name=\"maritalStatus\" required>\n");
      out.write("              <option selected>");
      out.print(rs.getString("maritalstatus") );
      out.write("</option>\n");
      out.write("    <option value=\"married\">Married</option>\n");
      out.write("    <option value=\"unmarried\">UnMarried</option>\n");
      out.write("  </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form-group row\">\n");
      out.write("  <label for=\"example-date-input\" class=\"col-sm-3 col-form-label\">Date Of Birth</label>\n");
      out.write("  <div class=\"col-sm-9\">\n");
      out.write("      <input class=\"form-control\" type=\"date\" id=\"dob\" name=\"dob\" value=\"");
      out.print(rs.getString("dob") );
      out.write("\" >\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"form-group row\">\n");
      out.write("      <label for=\"lblclass\" class=\"col-sm-3 col-form-label\" >Class</label>\n");
      out.write("      <div class=\"col-sm-9\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" name=\"class\" id=\"phone\" value=\"");
      out.print(rs.getString("class") );
      out.write("\" placeholder=\"Class\" required><span class=\"fa fa-book err\"/>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      ");

      }
      
      out.write("\n");
      out.write("    <div class=\"form-group row\">\n");
      out.write("      <div class=\"offset-sm-2 col-sm-12\">\n");
      out.write("          <center><input type=\"submit\" class=\"btn btn-primary\" value=\"Update\">&nbsp&nbsp&nbsp&nbsp\n");
      out.write("              <a href=\"list.jsp\"><input type=\"button\" class=\"btn btn-secondary\" id=\"cancel\" value=\"Cancel\"></a>\n");
      out.write("          </center>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("   </div>\n");
      out.write("</div>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
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
