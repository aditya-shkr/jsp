package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class crud_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/json");
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

    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
    out.print("s");
//    String act=request.getParameter("act");
//
//if(act.equals("viewall"))
//{
//    int count=0;
//    int counter=0;
//    Statement st1=con.createStatement();
//    ResultSet rs1=st1.executeQuery("select count(*) as count from student");
//    while(rs1.next())
//    {
//        counter=rs1.getInt("count");
//    }
//    Statement st=con.createStatement();
//    ResultSet  rs=st.executeQuery("select id,name,email,mobile,gender from student");
//    out.print("[");
//    while(rs.next())
//    {
//        count=count+1;
//        out.print("{\"id\":\""+rs.getInt("id")+"\",\"name\":\""+rs.getString("name")+"\""+",\"mobile\":\""+rs.getString("mobile")+"\",\"email\":\""+rs.getString("email")+"\","+"\"gender\":\""+rs.getString("gender")+"\"}");
//    if(count==counter)
//    {
//        out.print("");
//        
//    }
//    
//    else
//    {
//        out.print(",");
//        
//    }
//    
//    
//    
//    }
//    out.print("]");
//}
//
//else if(act.equals("add"))
//        {
//            String name=request.getParameter("name");
//         String mobile=request.getParameter("mobile");
//          String email=request.getParameter("email");
//           String gender=request.getParameter("gender");
//           //int mobile;
//           //mobile=Integer.parseInt(request.getParameter("mobile"));
//           
//           try
//           {
//               String query="insert into student(name,mobile,email,gender)"+"values(?,?,?,?)";
//           
//           PreparedStatement ps=con.prepareStatement(query);
//           ps.setString(1,name);
//            ps.setString(2,mobile); 
//            ps.setString(3,email);
//               ps.setString(4,gender);
//               ps.executeUpdate();
//               con.close();
//               ps.close();
//               out.println("{\"success\":\"inserted Successfully\"}");
//        }
//catch(Exception ex)
//        {
//        out.println(ex.getMessage());
//        out.println("{\"error\":\"Can not inserteed Record\"}");
//        
//            
//           
//            
//        }
//        }
//else if(act.equals("delete"))
//{
//    int id;
//    id=Integer.parseInt(request.getParameter("id"));
//    try{
//        String query="delete from student where id="+id;
//        
//                   PreparedStatement ps=con.prepareStatement(query);
//           ps.executeUpdate();
//           con.close();
//           ps.close();
//           out.println("{\"success\":\"deleted Successfully\"}");
//    }
//    catch(Exception ex)
//    {
//        out.println(ex.getMessage());
//        out.println("{\" error\":\"can not deleted Record\"}");
//    }
//}
//else if( act.equals("show"))
//{
//    int id;
//    id=Integer.parseInt(request.getParameter("id"));
//    Statement  st=con.createStatement();
//    ResultSet rs=st.executeQuery("select id name,email,mobile,gender from student where id="+id);
//    if(rs.next())
//    {
//        out.print("{\"id\":\""+rs.getInt("id")+"\",\"name\":\""+rs.getString("name")+"\""+",\" mobile\":\""+rs.getString("mobile")+"\",\"email\":\""+rs.getString("email")+"\","+"\"gender\":\""+rs.getString("gender")+"\"}");
//       
//    }
//    else{
//                out.println("{\"error\":\"Student id not found!\"}");
//                
//                }
//        
//    rs.close();
//    st.close();
//    con.close();
//    }
//
//
//else if(act.equals("update"))
//{
//    String name=request.getParameter("name");
//    String mobile=request.getParameter("mobile");
//    String email=request.getParameter("email");String gender=request.getParameter("gender");
//    int id;
//    id=Integer.parseInt(request.getParameter("#id"));
//    try{
//        String query="update student set name=?,mobile=?,email=?,gender=?"+"where id="+id;
//        PreparedStatement ps=con.prepareStatement(query);
//        ps.setString(1,name);
//        ps.setString(2,mobile);
//        ps.setString(3,email);
//        ps.setString(4,gender);
//        ps.executeUpdate();
//        con.close();
//        ps.close();
//        out.println("{\"success\":\"updated successfully\"}");
//    }
//    catch(Exception ex)
//    {
//        out.println(ex.getMessage());
//        out.println("{\"error\":\"can not updated record\"}");
//        
//    }
//    
//}

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
