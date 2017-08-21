<%-- 
    Document   : scriptletDemo
    Created on : 17 Feb, 2017, 4:23:54 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%-- Declaration tag --%>
        <%! int i=10; %>
        <%-- scriplet tag --%>
        <% out.print("i="+i); %>
        <br>
        <br>
        <% out.print("for loop expression start--"); %>
        <br>
        <%
            for(int j=0;j<10;j++)
            {
                out.print("j="+j);
        %>
        <br>
        <%
            }
            out.print("for loop end--");
        %>
        <br>
        <%-- expression tag --%>
        <%! int a=10;
            int b=20;
        %>
        The addition of two numbers a+b=10+20=<%=a+b%>
        <br>
        Current time:<%=new java.util.Date() %>
            
    </body>
</html>
