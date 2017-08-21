package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>List Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\" >\n");
      out.write("        <div style=\"width:1000px; margin:auto; padding:20px;  border-radius: 10px;  margin-top: 50px;  box-shadow: 0px 0px 5px black; background-color:whitesmoke; \">\n");
      out.write("            <div ><center><h2>List Page</h2></center>\n");
      out.write("                <a href=\"add.jsp\" ><span class=\"fa fa-plus fa-2x\" style=\"float:right;\"></span></a></div>\n");
      out.write("            <table class=\"table\"  id=\"myTable\">\n");
      out.write("                <thead class=\"thead-inverse\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Mobile</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
                            int count = 0;
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from student");
                        while (rs.next()) {

                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><div align=\"center\">");
      out.print(++count);
      out.write("</div></td>\n");
      out.write("                        <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs.getString("mobile"));
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <div align=\"center\"> <a href=\"edit.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("\"> <span  class=\"fa fa-pencil\" name=\"edit\"></span></a>&nbsp&nbsp&nbsp\n");
      out.write("                                <!--<a href=\"delete.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("\"> <span  class=\"fa fa-pencil\" name=\"edit\"></span></a>&nbsp&nbsp&nbsp</div>-->\n");
      out.write("                                <a data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"fa fa-trash\" name=\"del\"></span></a></div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                <div class=\"modal fade\" id=\"myModal\" >\n");
      out.write("                    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                        <div class=\"modal-content\" style=\"background-color:whitesmoke;\">\n");
      out.write("                            <div class=\"modal-header\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\n");
      out.write("                                <center><p>Do You Want To Delete &nbsp&nbsp<span class=\"fa fa-exclamation-triangle\"/></p></center>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <span type=\"button\" class=\"fa fa-close\" data-dismiss=\"modal\"></span>&nbsp&nbsp\n");
      out.write("                                <a href=\"delete.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("\" ><span type=\"button\" class=\"fa fa-check\"></span></a>&nbsp&nbsp\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!--     <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                  var table=$('#myTable').dataTable(\n");
      out.write("                          {\n");
      out.write("                              \"order\":[[1,\"des\"]];\n");
      out.write("                              \"fnDrawCallback\":function (0Settings)\n");
      out.write("                              {\n");
      out.write("                                  $('#tbl thead th').each(\n");
      out.write("                                          \n");
      out.write("                                          function (i)\n");
      out.write("                                  {\n");
      out.write("                                      if(!$(this).hasClass('tfilter'))\n");
      out.write("                                      {\n");
      out.write("                                          $(this).removeClass(\"sorting\");\n");
      out.write("                                          $(this).off();\n");
      out.write("                                      }\n");
      out.write("                                  });\n");
      out.write("                              }\n");
      out.write("                          });\n");
      out.write("                    });\n");
      out.write("           </script>-->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
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
