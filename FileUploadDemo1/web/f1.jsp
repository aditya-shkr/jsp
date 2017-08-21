<%-- 
    Document   : f1
    Created on : 7 Apr, 2017, 8:05:04 PM
    Author     : shriram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <form action="upload.jsp" method="post" enctype="multipart/form-data">  
    Select File:<input type="file" name="fname"/><br/> 
    <input type="text" placeholder="Name" name="name">
    <input type="submit" value="upload"/>
    </form>  
    </body>
</html>
