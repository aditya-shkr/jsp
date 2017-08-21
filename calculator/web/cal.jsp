<%-- 
    Document   : cal
    Created on : 25 Feb, 2017, 2:58:07 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/newcss.css" rel="stylesheet">
        <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
        <script>
            function validateForm() {
            var x = document.forms["myForm"]["text1"].value;
            var y = document.forms["myForm"]["text2"].value;
            if (x == "" || y=="") {
            alert("Number must be filled out");
            return false;
            }
            }
        </script>

    <script >
		$(document).ready(function(){                
           $(".text").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which !== 8 && e.which !== 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        $("#errmsg").html("Digits Only").show().fadeOut("slow");
             
			 return false;
        }
    
            });
        });
	</script>
        <script>
        
        function calculate() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
     document.getElementById("text3").innerHTML = this.responseText;
    }
  };
  xhttp.open("GET", "calculation.jsp", true);
  xhttp.send();
}

</script>
    </head>
    <body>
        <form id="myForm" >
        <div class="main">
            <div class="num">
                <div class="left">
                    <input type="text" class="text" placeholder="number 1" name="text1" required> 
                    
                </div>
                <div class="right">
                    <input type="text" class="text" placeholder="number 2" name="text2" required> 
                </div>
               
            </div>
             <span id="errmsg"></span>
                    &nbsp&nbsp&nbsp&nbsp
            <div class="rslt">
                <input type="text" placeholder="result" id="text3" disabled> 
            </div>
            <div class="rslt">
                <input type="submit" value="+" name="cal" onclick="validateForm()">
                <input type="submit" value="-" name="cal" onclick="validateForm()">
                <input type="submit" value="/" name="cal" onclick="validateForm()">
                <input type="submit" value="*" name="cal" onclick="validateForm()">
            </div>
        </div>
        </form>
    </body>
</html>
