<%-- 
    Document   : db
    Created on : 2 May, 2017, 4:12:15 PM
    Author     : Aditya
--%>


<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoes","root","");
//    out.print("connection");
%>
