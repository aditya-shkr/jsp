<%-- 
    Document   : check
    Created on : 24 Feb, 2017, 5:13:24 PM
    Author     : Aditya
--%>

<%@page import="javafx.scene.control.Alert"%>
<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           String username =request.getParameter("uname");
           String password =request.getParameter("pass");
           
           if(username.equals("rosa") && password.equals("123"))
           {
              
        %>
             
        <jsp:forward page="success.jsp"/>
        <%
           }
           else
            {
        %>
               <jsp:forward page="error.jsp"/>
               <%
                   
                   }
                %>
    </body>
</html>
