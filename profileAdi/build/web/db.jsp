<%-- 
    Document   : db
    Created on : 10 Apr, 2017, 10:54:42 AM
    Author     : Aditya
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/profiledb","root","");
//    out.print("connection");
%>