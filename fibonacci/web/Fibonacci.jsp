<%-- 
    Document   : Fibonacci
    Created on : 17 Feb, 2017, 5:18:41 PM
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
        <%
            long i=0,j=1;
            out.println("Fibonacci Series");
         %>
        <br>
        <%   
            out.println(i);
        %>
        <br>
        <%
            out.println(j);
        %>
        <br>
        <%
            for(int k=2;k<100;k++)
            {
                out.print(i+j);
             %>
             <br>
             <%
                long t=i+j;
                i=j;
                j=t;
            }
        %>
    </body>
</html>
