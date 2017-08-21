<%-- 
    Document   : delete
    Created on : 23 Mar, 2017, 11:50:06 AM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="conn.jsp" %>
<%
  int id=Integer.parseInt(request.getParameter("id"));
  out.print(id);
//  try
//  {
//      String query="delete from student where id="+id;
//      PreparedStatement ps=con.prepareStatement(query);
//      ps.executeUpdate();
//      con.close();
//      ps.close();
//%>
//
//<%
//  }
//  catch(Exception e)
//{
//    out.print(e.getMessage());
//    out.print("can not delete Record");
//}
//%>