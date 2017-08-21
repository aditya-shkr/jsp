<%-- 
    Document   : display
    Created on : 8 Apr, 2017, 2:23:53 PM
    Author     : Aditya
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%@include file="db.jsp" %>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <form action="insert.jsp">
                <div class="col-lg-6">
                    <input name="img" type="file">
                    <input type="submit" value="submit">
                </div>
            </form>
        </div>
    </body>
</html>
