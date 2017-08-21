<%-- 
    Document   : plugindemo
    Created on : 9 Mar, 2017, 3:24:03 PM
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
        <jsp:plugin type="applet" code="Applet_jsp.class" codebase="http://localhost:8080/plugindemo/AppletClass.class" width="500" height="500">
            <jsp:fallback>
             <p>Unable To Load Applet.......</p>  
             </jsp:fallback>
            </jsp:plugin>
    </body>
</html>
