<%-- 
    Document   : conn
    Created on : 24 Mar, 2017, 12:57:18 AM
    Author     : Aditya
--%>

<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoes","root","");
%>

