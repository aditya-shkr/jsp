<%-- 
    Document   : conn
    Created on : 9 Mar, 2017, 5:19:37 PM
    Author     : Aditya
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
%>
