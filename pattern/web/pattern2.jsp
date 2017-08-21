<%-- 
    Document   : pattern2
    Created on : 17 Feb, 2017, 5:47:31 PM
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
            int i,j;
            for(i=10;i>0;i--)
            {
                for(j=i;j<=10;j++)
                    out.print("*");
                %>
                <br>
                <%
            }
        %>
    </body>
</html>
