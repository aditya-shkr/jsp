package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.sql.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Class .forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");

      out.write('\n');
      out.write('\n');

     
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String address=request.getParameter("address");
    int mobile=Integer.parseInt(request.getParameter("mobile"));
    int phone=Integer.parseInt(request.getParameter("phone"));
    String gen=request.getParameter("gen");
    String maritalStatus=request.getParameter("maritalStatus");
    String dob=request.getParameter("dob");
    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date myDate =formatter.parse(dob);
   java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
    String cl=request.getParameter("class");
    try
    {
        
        String query="insert into student(name,email,address,mobile,phone,gender,maritalstatus,dob,class)"+"values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, address);
        ps.setInt(4, mobile);
        ps.setInt(5, phone);
        ps.setString(6, gen);
        ps.setString(7, maritalStatus);
        ps.setDate(8, sqlDate);
        ps.setString(8, cl);
        ps.executeUpdate();
        out.println("data inserted succesfuly");
        con.close();
        ps.close();
        
    }
    
    catch(Exception e)
            {
                out.print(e);
            }

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
