<%-- 
    Document   : pattern1
    Created on : 17 Feb, 2017, 5:43:35 PM
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
            for(i=0;i<10;i++)
            {
                for(j=i;j<10;j++)
                    out.print("*");
                %>
                <br>
                <%
            }
        %>
    </body>
</html>
