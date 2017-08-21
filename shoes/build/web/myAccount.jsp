<%-- 
    Document   : myAccount
    Created on : 29 Mar, 2017, 12:00:51 AM
    Author     : Aditya
--%>

<%@include file="header.jsp" %>
<%@include file="conn.jsp" %>
<title>JSP Page</title>
</head>
<body>
    <%@include file="menuLogin.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col-sm-12 col-md-12 col-lg-12 content-center">
                <div class="block">
                    <ul >
                        <li>
                            <a href="">Account Information</a>
                        </li>
                        <li>
                            <a href="">Address Book</a>
                        </li>
                        <li>
                            <a href="">My Orders</a>
                        </li>
                        <li>
                            <a href="">My Wishlist</a>
                        </li>
                        <li>
                            <a href="">Returns</a>
                        </li>
                    </ul>
                </div> 
            </div>
        </div>
        <!--dashboard-->
        <div class="row">
            <div class="col-sm-12 col-md-12 col-lg-12 content-center" style="text-align: center;margin-top: 100px; border-bottom: 1px solid black;">
                <h1>My DASHBOARD</h1>
            </div>
            <div class="col-sm-12 col-md-12 col-lg-12 content-center" style="margin-top: 30px; padding: 10px; border-bottom: 1px solid black;">
                <p>Hello <%=session.getAttribute("fname")%> <%=session.getAttribute("lname")%>!</p>
                <p>From your My Account Dashboard you have the ability to view a snapshot of your recent account activity and update your account information. Select a link below to view or edit information.</p>
                <p><b>Account Information</b></p>
                <br>
            </div>
                <div class="row" style="margin-top: 30px; margin-bottom: 30px; border-bottom: 1px solid black;">
                    <div class="col-md-6" style="margin-top: 20px;">
                        <div><b>Contact Information</b><span style="float:right;"><a href="edit.jsp">Edit</a></span></div>
                        <p><%=session.getAttribute("fname")%> <%=session.getAttribute("lname")%></p>
                        <p><%=session.getAttribute("email")%></p>
                        <br>
                        <div><b>ADDRESS BOOK</b></div>
                        <br>
                        <h6><b>DEFAULT SHIPPING ADDRESS</b></h6>
                        <p>You have not set a default billing address.</p>
                        <p><a href="#">Edit Address</a></p>
                    </div>
                    <div class="col-md-6" style="margin-top: 20px;">
                        <div><b>News Letters</b><span style="float:right;"><a href="edit.jsp">Edit</a></span></div>
                        <p>You are currently not subscribed to any newsletter.</p>
                        <br>
                        <div><span style="float:right;"><a href="editaddr.jsp">Manage Addresses</a></span></div>
                        <br>
                        <br>
                        <br>
                        <h6><b>DEFAULT SHIPPING ADDRESS</b></h6>
                        <p>You have not set a default billing address.</p>
                        <p><a href="#">Edit Address</a></p>
                    </div>
                </div>   
                    <div class="row">
                        
                        <div class="col-sm-6 col-md-6 col-lg-6">
                            
                        </div>
                        <div class="col-sm-6 col-md-6 col-lg-6"></div>
                    </div>
        </div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>