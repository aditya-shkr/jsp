<%-- 
    Document   : check
    Created on : 10 Apr, 2017, 11:38:20 AM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="db.jsp" %>
<%    String emailx = request.getParameter("email");
    String passwordx = request.getParameter("password");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from profile where email='" + emailx + "' and password='" + passwordx + "'");

    if (rs.next()) {
            int id1 = rs.getInt("id");
            session.setAttribute("id", id1);
%>
<jsp:forward page="profileEdit.jsp"/>
    

<%
} else {
%>
<jsp:forward page="login.jsp"/>    
<%
        }
    
%>
