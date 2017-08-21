<%-- 
    Document   : home
    Created on : 18 Feb, 2017, 5:16:02 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.html" %>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" style="height:auto; background-color:#2874f0;">
  
 <div class="container-fluid" style="height:30px; float:right;">
	<ul class="nav navbar-nav">
      <li><a class="lnk" href="#">F-Assured</a></li>
      <li><a class="lnk" href="#">Advertise</a></li>
	  <li><a href="#">Gift Card</a></li>
	  <li><a href="#">Download App</a></li>
	  <li><a href="#">24x7 Customer Care</a></li>
	  <li><a href="#">Track Order</a></li>
      <li><a href="#myModal" data-toggle="modal" data-targe="#"><span class="glyphicon glyphicon-log-in"></span> Login | Registeration</a></li>
    </ul>
 </div>
  
	<div class="container-fluid" style="margin-top:20px; height:55px; width:100%;">
		<div class="navbar-header">
		  <a class="navbar-brand" href="#">
			<img width="149" src="img/fk-logo_9fddff.png">
		  </a>
		</div>
		<div class="navbar-header" style="width:80%; margin-top:10px; padding:4px;">
		<form>
			<div style="width:91%;">
				<div style="width:100%;">
					<input type="text" value="" class="LM6RPg" title="Search for Products, Brands and More" name="q" autocomplete="off" placeholder="Search for Products, Brands and More">
				</div>
				<div style="width:8%;">
					<div style="width:100%;">
					<button class="vh79eN" type="submit" data-reactid="48">
						<svg class="_2BhAHa" width="15px" height="15px" data-reactid="49"></svg>
					</button>
					</div>
				</div>
			</div>
		</form>
		</div>
	
    
    <ul class="nav navbar-nav navbar-right" >
      
    </ul>
	</div>
	  
</nav>

<div id="myModal" class="modal fade" tabindex="-1" role="dialog" >
    <div class="modal-dialog">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
		  <h4 class="modal-title">Registeration/Login</h4>
		</div>
		<div class="modal-body">
			<div class="tabbable"> <!-- Only required for left/right tabs -->
				<ul class="nav nav-tabs">
				<li class="active"><a href="#login" data-toggle="tab">Login</a></li>
				<li ><a href="#reg" data-toggle="tab">Registration</a></li>
				</ul>
				<div class="tab-content">
					<div class="tab-pane active" id="login">
						<form>
						  <div class="form-group">
							<label for="email">Email address:</label>
							<input type="email" class="form-control" id="email">
						  </div>
						  <div class="form-group">
							<label for="pwd">Password:</label>
							<input type="password" class="form-control" id="pwd">
						  </div>
						  <div class="checkbox">
							<label><input type="checkbox"> Remember me</label>
						  </div>
						  <button type="submit" class="btn btn-default">Submit</button>
						</form>
					</div>
					<div class="tab-pane" id="reg">
					<form>
						  <div class="form-group">
							<label for="text">Name:</label>
							<input type="text" class="form-control" id="name">
						  </div>
						  <div class="form-group">
							<label for="text">Address:</label>
							<input type="text" class="form-control" id="add">
						  </div>
						  <div class="form-group">
							<label for="text">Phone:</label>
							<input type="text" class="form-control" id="phone">
						  </div>
						  <div class="form-group">
							<label for="text">Email:</label>
							<input type="email" class="form-control" id="pwd">
						  </div>
						  <div class="checkbox">
							<label><input type="checkbox"> Remember me</label>
						  </div>
							<button type="submit" class="btn btn-default">Submit</button>
						</form>
					</div>
				</div>
			</div>
	    </div>
	
	<div class="modal-footer">
		<a href="#" class="btn btn-primary" data-dismiss="modal">Close</a>
	</div>
	</div>
	</div>
</div>

<div class="gallery">
	<div>
		<a>
		<div>
			<img src="img/background.jpg">
		</div>
		</a>
	</div>
	<div>
		<a></a>
		<div>
			<img src="img/background.jpg">
		</div>
		</a>
	</div>
	<div>
		<a></a>
		<div>
			<img src="img/background.jpg">
		</div>
		</a>
	</div>
	<div>
		<a>
		<div>
			<img src="img/background.jpg">
		</div>
		</a>
	</div>
</div>

		
<div class="container" style="margin-top:60px;" >
  
	
</div>


</body>
<%@include file="footer.html" %>