<%-- 
    Document   : home
    Created on : 24 Mar, 2017, 12:36:10 AM
    Author     : Aditya
--%>

<%@include file="header.jsp" %>
<title>Home Page</title>
<body>
    <!--nav bar-->
    <nav class="navbar navbar-default navbar-fixed-top" style="background-color: #4286f4">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
        <a class="navbar-brand" href="#"><img src="images/logo2.png" height="50px"></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
    <!--- modal start --->

    <div id="myModal" class="modal fade" tabindex="-1" role="dialog" >
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Registration/Login</h4>
                </div>
                <div class="modal-body">
                    <div class="tabbable"> <!-- Only required for left/right tabs -->
                        <ul class="nav nav-tabs">
                            <li class="active"><a href="#login" data-toggle="tab">Login</a></li>
                            <li ><a href="#reg" data-toggle="tab">Registration</a></li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane active" id="login" style="padding:20px;">
                                <form id="login" action="login.jsp" method="post">
                                    <div class="form-group row">                                       
                                        <div class="col-sm-12">
                                            <input type="email"  class="form-control" name="email" placeholder="Email" required><span class="fa fa-user err"/>
                                        </div>
                                    </div>
                                    <div class="form-group row">                                        
                                        <div class="col-sm-12">
                                            <input type="password" class="form-control" name="password" placeholder="Password" required><span class=" fa fa-key err"/>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-12">
                                            <label><input type="checkbox" id="remember" name="remember" value="remember">&nbsp;&nbsp;&nbsp;Remember me</label>          
                                        </div>
                                    </div>                                    
                                    <div align="right">
                                        <input type="submit" class="btn btn-primary" value="Login">                                        
                                    </div>
                                </form>
                            </div>
                            <div class="tab-pane" id="reg" style="padding:20px;">
                                <form name="regform" action="insert.jsp">
                                    <div class="form-group row">
                                        <div class="col-sm-12">
                                            <input type="text"  class="form-control" name="fname" placeholder="Firstname" required><span class="fa fa-user err"/>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-12">
                                            <input type="text"  class="form-control" name="lname" placeholder="Lastname" required><span class="fa fa-user err"/>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-12">
                                            <input type="email" class="form-control" name="email" placeholder="Email" required><span class=" fa fa-envelope err"/>
                                        </div>
                                    </div>
                                    <div class="form-group row">
                                        <div class="col-sm-12">
                                            <input type="text" class="form-control" name="mobile" placeholder="Mobile" required minlength="10" maxlength="10"><span class="fa fa-mobile err"/>
                                        </div>
                                    </div>
                                    <div class="form-group row">                                       
                                        <div class="col-sm-12">
                                            <input type="password" class="form-control" name="password" placeholder="Password" required><span class=" fa fa-key err"/>
                                        </div>
                                    </div>
                                    <div class="form-group row">                                        
                                        <div class="col-sm-12">
                                            <input type="password" class="form-control" name="cpassword" placeholder="Confirm Password" required><span class=" fa fa-key err"/>
                                        </div>
                                    </div>
                                    <fieldset class="form-group row">
                                        <div class="col-sm-9">
                                            <div class="form-check">
                                                <label class="form-check-label">
                                                    <input class="form-check-input" type="radio" name="gender"  value="Male" checked>
                                                    Male
                                                </label>
                                            </div>
                                            <div class="form-check">
                                                <label class="form-check-label">
                                                    <input class="form-check-input" type="radio" name="gender"  value="Female">
                                                    Female
                                                </label>
                                            </div>
                                        </div>
                                    </fieldset>
                                    <div class="form-group row">
                                        <div class="offset-sm-2 col-sm-12">
                                            <div align="right">                     
                                                <input type="submit" value="SIGN UP" class="btn btn-primary">&nbsp&nbsp&nbsp&nbsp                                                
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                </div>
            </div>
        </div>
    </div>
<div class="container" style="text-align: center;">
    <!--slider-->
    
        <div class="row">
            <div class="col-sm-12 col-lg-12 col-md-12">
    <div id="jssor_1" style="position:relative;margin:0 auto;left:0px;width:1500px;height:600px;overflow:hidden;visibility:hidden;">
        <!-- Loading Screen -->
        <div data-u="loading" class="jssorl-oval" style="position:absolute;top:0px;left:0px;text-align:center;background-color:rgba(0,0,0,0.7);">
            <img style="margin-top:-19.0px;position:relative;top:50%;width:38px;height:38px;" src="images/oval.svg" />
        </div>
        <div data-u="slides" style="cursor:default;position:relative;top:0px;left:0px;width:1500px;height:600px;overflow:hidden;">
            <a data-u="any" href="#" style="display:none"></a>
            <div>
                <a href=""><img data-u="image" src="images/banner5.jpg" /></a>
            </div>
            <div>
                <img data-u="image" src="images/banner2.jpg" />
            </div>
            <div>
                <img data-u="image" src="images/banner10.jpg" />
            </div>
        </div>
        <!-- Bullet Navigator -->
        <div data-u="navigator" class="jssorb05" style="bottom:16px;right:16px;" data-autocenter="1">
            <!-- bullet navigator item prototype -->
            <div data-u="prototype" style="width:16px;height:16px;"></div>
        </div>
        <!-- Arrow Navigator -->
        <span data-u="arrowleft" class="jssora22l" style="top:0px;left:8px;width:40px;height:58px;" data-autocenter="2"></span>
        <span data-u="arrowright" class="jssora22r" style="top:0px;right:8px;width:40px;height:58px;" data-autocenter="2"></span>
    </div>
        </div>
        </div>

    <!---deal-->
    <div class="deal"> 
    <div class="row">
        
                        
        <div class="col-sm-4 col-md-4 col-lg-4">
            <h2><strong>DEAL</strong> of the day</h2>
        </div>
        <div  class="col-sm-4 col-md-4 col-lg-4">
            <div><a><img src="images/FST_K6081_OLIVE_1.jpg"></a></div>
            <div></div>
        </div>
        <div class="col-sm-4 col-md-4 col-lg-4">b</div>
    </div>
            </div>
    <!--big image-->
    <div class="bigimage">      
        <div class="row">
            <div class="col-md-4">
                <div class="thumbnail">
                    <a href="">
                        <img src="images/sale10.jpg" alt="Lights" >
                        <div class="caption">
                            <p>sale upto 40%</p>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="thumbnail">
                    <a href="">
                        <img src="images/sale5.jpg" alt="Nature" >
                        <div class="caption">
                            <p>sale up to 70%</p>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="thumbnail">
                    <a href="single.jsp">
                        <img src="images/sale6.jpg" alt="Fjords" style="width:100%">
                        <div class="caption">
                            <p>Sale up to 75%</p>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </div>
        
    <!--top sale-->

    <div class="topsale">
        <h2>Top Sales</h2>
        <img src="images/bs1.jpg" class="img-rounded" alt="Cinque Terre" width="150" height="150"> 
        <img src="images/bs2.jpg" class="img-rounded" alt="Cinque Terre" width="150" height="150"> 
        <img src="images/g3.jpg" class="img-rounded" alt="Cinque Terre" width="150" height="150"> 
        <img src="images/bs4.jpg" class="img-rounded" alt="Cinque Terre" width="150" height="150"> 
        <img src="images/gs1.jpg" class="img-rounded" alt="Cinque Terre" width="150" height="150"> 
        <img src="images/g4.jpg" class="img-rounded" alt="Cinque Terre" width="150" height="150"> 
        <img src="images/bs3.jpg" class="img-rounded" alt="Cinque Terre" width="150" height="150"> 
        <img src="images/g2.jpg" class="img-rounded" alt="Cinque Terre" width="150" height="150">

    </div>

    <!--magic-->
    <div class="magic">
        <p id="p1">   MAGIC IN JUST 499 </p><br><br>
        <button type="button" class="btn btn-danger btn-lg">MALE</button>&nbsp&nbsp&nbsp
        <button type="button" class="btn btn-danger btn-lg">FEMALE</button>
    </div>
    <!--featured-->
    <div class="featured">
        <b> <i> <h1 id="p2">FEATURED STORES </h1></i></b>
        <div class="bigimage">      
            <div class="row">
                <div class="col-md-4">
                    <div class="thumbnail">
                        <a href="">
                            <img src="images/ys1.jpg" alt="Lights" style="width:100%;height:300px; ">
                        </a>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="thumbnail">
                        <a href="">
                            <img src="images/bata.jpg" alt="Nature" style="width:100%;height:300px;">
                        </a>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="thumbnail">
                        <a href="/w3images/fjords.jpg">
                            <img src="images/rs.jpg" alt="Fjords" style="width:100%;height:300px;">
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div><br>
    <br>

    <!--bigimage-->

    <div class="bigimage1">      
        <div class="row">
            <div class="col-md-6">
                <div class="thumbnail" id="t1">
                    <a href="">
                        <button type="button" class="btn btn-danger btn-lg">FEMALE</button>
                    </a>
                </div>
            </div>
            <div class="col-md-6">
                <div class="thumbnail" id="t2">
                    <a href="">
                        <button type="button" class="btn btn-danger btn-lg">MaLE</button>
                    </a>
                </div>
            </div>
        </div>
    </div>
    <br><br>
    <div class="bigimage" id="bi2">             
        <div class="row">
            <div class="col-md-4">
                <div class="thumbnail">
                    <a href="">
                        <img src="images/office.jpg" alt="Lights" >
                        <div class="caption">
                            <b><p  style="color:red;">Office</p></b>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="thumbnail">
                    <a href="">
                        <img src="images/sandel.jpg" alt="Nature" >
                        <div class="caption">
                            <b> <p style="color:red;">comfort</p></b>
                        </div>
                    </a>
                </div>
            </div>
            <div class="col-md-4">
                <div class="thumbnail">
                    <a href="/w3images/fjords.jpg">
                        <img src="images/ss1.jpg" alt="Fjords" >
                        <div class="caption">
                            <b> <p style="color:red;">Sports</p></b>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </div>

    <!--top Catagory-->
    <div class="top">

        <b>  <p id="p1">TOP CATAGORY </p></b><br><br>                
        <button type="button" class="btn btn-danger btn-lg">MALE</button>&nbsp&nbsp&nbsp
        <button type="button" class="btn btn-danger btn-lg">FEMALE</button>
    </div><br>
    <div class="circle">
        <img src="images/a2.jpg" class="img-circle" alt="Cinque Terre" width="170" height="170">
        <img src="images/g3.jpg" class="img-circle" alt="Cinque Terre" width="170" height="170">
        <img src="images/bs3.jpg" class="img-circle" alt="Cinque Terre" width="170" height="170">
        <img src="images/s1.jpg" class="img-circle" alt="Cinque Terre" width="170" height="170">
        <img src="images/g2.jpg" class="img-circle" alt="Cinque Terre" width="170" height="170">
    </div>
    <!--brand-->
    <div class="brand">
        <div id="bl"><h1> TOP BRANDS</h1> </div><br>
        <!--<div class="brand logo">-->

        <div class="brandimg" id="bi4">      
            <div class="row">
                <div class="col-md-2">
                    <div class="thumbnail">
                        <a href="">
                            <img src="images/woodland.jpg" alt="Nature" style="width:100%;object-fit:cover; ">
                        </a>
                    </div>
                </div>
                <div class="col-md-2">
                    <div class="thumbnail">
                        <a href="">
                            <img src="images/crocks.jpg" alt="Nature" style="width:100%; height:104px;object-fit:cover">
                        </a>
                    </div>
                </div>
                <div class="col-md-2">
                    <div class="thumbnail">
                        <a href="/w3images/fjords.jpg">
                            <img src="images/red_chief.jpg" alt="Fjords" style="width:100%;object-fit:cover;">
                        </a>
                    </div>
                </div>
                <div class="col-md-2">
                    <div class="thumbnail">
                        <a href="/w3images/fjords.jpg">
                            <img src="images/bt.jpg" alt="Fjords" style="width:100%;object-fit:cover;">
                        </a>
                    </div>
                </div>
                <div class="col-md-2">
                    <div class="thumbnail">
                        <a href="/w3images/fjords.jpg">
                            <img src="images/action.jpg" alt="Fjords" style="width:100%;object-fit:cover;">
                        </a>
                    </div>
                </div>
                <div class="col-md-2">
                    <div class="thumbnail">
                        <a href="/w3images/fjords.jpg">
                            <img src="images/shoebelly.png" alt="Fjords" style="width:100%;object-fit:cover;">
                        </a>
                    </div>
                </div>
            </div>
            <br>
            <div class="content">
            </div>
        </div>
    </div>

    <!--footer-->
    <div class="footer">
        <div class="form-inline" id ="f2">
            <label for="news">NEWS LETTER SIGNUP:</label><input type="text" class="form-inline" id="news" placeholde="your email" style="width:40%;">
            <span class="glyphicon glyphicon-search"> </span>
        </div>
        <div class="f1">
            <h1 style="font-size:20px;">Need Help? Contact Us</h1>
            <p style="font-size:20px; color:red;">011-42333838</p>
        </div>
    </div>
    </div>
<script type="text/javascript">jssor_1_slider_init();</script>
<%@include file="footer.jsp" %>
