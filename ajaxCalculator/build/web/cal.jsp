<%-- 
    Document   : cal
    Created on : 23 Mar, 2017, 4:57:34 PM
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
        <form id="myForm" >
        <div class="main">
            <div class="num">
                <div class="left">
                    <input type="text" class="text" placeholder="number 1" id="num1" name="num1" required>                     
                </div>
                <div class="right">
                    <input type="text" class="text" placeholder="number 2" id="num2" name="num2" required> 
                </div>               
            </div>
             <span id="errmsg"></span>
                    &nbsp&nbsp&nbsp&nbsp
            <div class="rslt">
                <input type="text" placeholder="result" id="result" name="result" disabled> 
            </div>
            <div class="rslt">
                <input type="submit" value="+" name="cal" onclick="addNumber()">
                <input type="submit" value="-" name="cal" onclick="cal()">
                <input type="submit" value="/" name="cal" onclick="cal()">
                <input type="submit" value="*" name="cal" onclick="cal()">
            </div>
        </div>
        </form>
        <script src="js/jquery-3.1.1.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            function addNumber(){
                $.get("calculation.jsp",{num1:$("#num1").val(),num2:$("num2").val()},doUpdate);
            }
            function doUpdate(response){
                if(response){
                            $("#result").val(response);
                }
            }
        </script>
        
    </body>
</html>
