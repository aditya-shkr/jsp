

<%-- 
    Document   : db
    Created on : Mar 9, 2017, 11:11:02 PM
    Author     : MY
--%>

<%@page import = "java.sql.*;"%>
<%
          Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajaxdemo","root","");
        out.println("connection successfully");
    
%>