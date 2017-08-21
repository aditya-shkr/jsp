<%-- 
    Document   : insert
    Created on : 24 Mar, 2017, 12:56:38 AM
    Author     : Aditya
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat,java.util.*,java.util.Date"%>
<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@include file="conn.jsp"%>
<% 
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String email=request.getParameter("email");
    long mobile = Long.parseLong(request.getParameter("mobile"));
    String password=request.getParameter("password");
    String gender=request.getParameter("gender");
    try
    {
        String query="insert into customer(fname,lname,email,mobile,password,gender)"+"values(?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, fname);
        ps.setString(2, lname);
        ps.setString(3, email);
        ps.setLong(4, mobile);
        ps.setString(5, password);
        ps.setString(6, gender);
        ps.executeUpdate();
        %>
        <jsp:forward page="home.jsp"/>
        <%            
        con.close();
        ps.close();       
    }  
    catch(Exception e)
            {
                out.print(e);
            }
%>