<%-- 
    Document   : db
    Created on : 24 Mar, 2017, 3:10:56 PM
    Author     : Aditya
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
//    out.print("connection");
%>
