<%-- 
    Document   : insert
    Created on : 8 Apr, 2017, 3:38:12 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="db.jsp" %>
<%
    String img=request.getParameter("img");
    try
    {
        String query="insert into file(image)"+"values(?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, img);     
        ps.executeUpdate();
        %>
        <jsp:forward page="display.jsp"/>
        <%            
        con.close();
        ps.close();       
    }  
    catch(Exception e)
            {
                out.print(e);
            }
%>
