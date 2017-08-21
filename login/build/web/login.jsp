<%-- 
    Document   : login
    Created on : 24 Feb, 2017, 4:31:53 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/login.css" rel="stylesheet">
</head>
<body>
    <form action="check.jsp" method="POST">
	<div class="main">
		<div class="main2">
			<center><h3>Login</h3></center>
		</div>
		<div class="main2">
			<div class="left">
			User Name:
			</div>
			<div class="right">
			<input type="text" name="uname" >
			</div>
		</div>
		<div class="main2">
			<div class="left">
			Password:
			</div>
			<div class="right">
                            <input type="password" name="pass">
			</div>
		</div>
		<div class="main2">
			<center><input type="submit" vlaue="Login" ></center>
		</div>
	</div>
    </form>
</body>
</html>
