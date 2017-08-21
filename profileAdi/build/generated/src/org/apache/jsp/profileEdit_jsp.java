package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class profileEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/db.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/dataTables.bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/select2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/profile.css\" rel=\"stylesheet\" type=\"text/css\"/>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/profiledb","root","");
//    out.print("connection");

      out.write("\n");
      out.write("<title>Profile Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\" style=\"margin-top: 100px;\">\n");
      out.write("        <div class=\"row\" style=\"background-color:  snow;box-shadow: 0px 0px 8px 2px; padding: 40px; width: 60%; \" >\n");
      out.write("           \n");
      out.write("                    <form action=\"update.jsp\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                         ");
                            
//                        int id=Integer.parseInt(request.getParameter("id"));
                            int id=(Integer)session.getAttribute("id");
                            
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from profile where id="+id);
                        while (rs.next()) {

                    
      out.write("\n");
      out.write("            <div class=\"col-md-6 \" style=\"text-align: center;\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(rs.getInt("id"));
      out.write("\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"name\" name=\"name\" value=\"");
      out.print(rs.getString("name"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"phone\" name=\"phone\" value=\"");
      out.print(rs.getString("phone"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" placeholder=\"email\" name=\"email\" value=\"");
      out.print(rs.getString("email"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"password\" name=\"password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"confirm password\" name=\"password1\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button class=\"btn btn-primary\"  type=\"submit\" value=\"submit\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 \" style=\"text-align: center;\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"hidden\" value=\"");
      out.print(rs.getString("pic"));
      out.write("\" name=\"img1\">\n");
      out.write("                    <img src=\"images/");
      out.print(rs.getString("pic"));
      out.write("\"  name=\"profImg\" id=\"profImg\"  class=\"image\"  >\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\" >\n");
      out.write("                    <label class=\"btn btn-primary\">Browse..<input type=\"file\" style=\"display:none;\" id=\"imgName\" name=\"imgName\"/></label>\n");
      out.write("                </div>        \n");
      out.write("            </div>\n");
      out.write("</form>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("<script src=\"js/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/select2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(function () {\n");
      out.write("            $('#imgName').change(function (e) {\n");
      out.write("\n");
      out.write("                var img = URL.createObjectURL(e.target.files[0]);\n");
      out.write("                $('#profImg').attr('src', img);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>");
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
