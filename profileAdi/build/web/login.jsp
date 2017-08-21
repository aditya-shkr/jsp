<%-- 
    Document   : login
    Created on : 10 Apr, 2017, 10:54:16 AM
    Author     : Aditya
--%>

<%@include file="header.jsp" %>
<%@include file="db.jsp" %>
<title>Login</title>
</head>
<body>
    <div class="container" style="margin-top: 100px; " >
        <div class="col-md-4 col-md-offset-4" style="background-color:  snow;box-shadow: 0px 0px 8px 2px; padding:40px;">
            
            <form id="login" action="check.jsp">
                <div class="form-group row">
                    <div class="col-md-12">
                        <input type="email" class="form-control" name="email" placeholder="Email"> 
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-12">
                        <input type="password" class="form-control" name="password" placeholder="Password"> 
                    </div>
                </div>
                <div class="form-group row">
                    <div class="col-md-12">
                        <center><button type="Submit"  class=" btn btn-primary"  value="login">Login </button></center>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <%@include file="footer.jsp" %>
