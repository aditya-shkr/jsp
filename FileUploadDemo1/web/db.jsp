<%-- 
    Document   : db
    Created on : 8 Apr, 2017, 2:22:40 PM
    Author     : Aditya
--%>


<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/file","root","");
%>

