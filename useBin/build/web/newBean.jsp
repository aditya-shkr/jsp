<%-- 
    Document   : newBean
    Created on : 10 Mar, 2017, 3:07:58 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="student" class="bean.studentData" scope="page">
            <jsp:setProperty name="student" property="name" value="Rahul"/>
            <jsp:setProperty name="student" property="email" value="rahul@gmail.com"/>            
        </jsp:useBean>
        <h1><p>Student  data</p></h1>
        <p>Name: <i><jsp:getProperty name="student" property="name"/></i></p>
        <p>Email: <i><jsp:getProperty name="student" property="email"/></i></p>
    </body>
</html>
