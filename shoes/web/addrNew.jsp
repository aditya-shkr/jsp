<%-- 
    Document   : addrNew
    Created on : 30 Mar, 2017, 5:33:46 PM
    Author     : Aditya
--%>

<%@include file="header.jsp" %>
<%@include file="conn.jsp" %>
<title>JSP Page</title>
</head>
<body>
    <%@include file="menuLogin.jsp"%>
    <div class="container">
        <!--dashboard-->
        <div class="row">
            <div class="col-sm-12 col-md-12 col-lg-12 " style="text-align: center;margin-top: 100px; border-bottom: 1px solid black;">
                <h3>ADD NEW ADDRESS</h3>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
        <div style="max-width: 360px; margin: auto; margin-top: 20px;">      

            <form class="form-horizontal">
                <div class="form-group">

                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="inputEmail3" placeholder="First Name">
                    </div>
                </div>
                <div class="form-group">

                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="inputEmail3" placeholder="Last Name">
                    </div>
                </div>
                <div class="form-group">

                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="inputEmail3" placeholder="Mobile No.">
                    </div>
                </div>
                <div class="form-group">

                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="inputEmail3" placeholder="Street Address">
                    </div>
                </div>
                <div class="form-group">

                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="inputPassword3" placeholder="City">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-10">
                        <select id="region_id" name="region_id" title="State/Province" class="form-control" defaultvalue="0" >
                            <option value="">Please select region, state or province</option>
                            <option value="485">Andaman Nicobar</option><option value="486">Andhra Pradesh</option><option value="487">Arunachal Pradesh</option><option value="488">Assam</option><option value="489">Bihar</option><option value="490">Chandigarh</option><option value="491">Chhattisgarh</option><option value="492">Dadra Nagar Haveli</option><option value="493">Daman Diu</option><option value="494">Delhi</option><option value="495">Goa</option><option value="496">Gujarat</option><option value="497">Haryana</option><option value="498">Himachal Pradesh</option><option value="499">Jammu Kashmir</option><option value="500">Jharkhand</option><option value="501">Karnataka</option><option value="502">Kerala</option><option value="503">Lakshadweep</option><option value="504">Madhya Pradesh</option><option value="505">Maharashtra</option><option value="506">Manipur</option><option value="507">Meghalaya</option><option value="508">Mizoram</option><option value="509">Nagaland</option><option value="510">Orissa</option><option value="511">Pondicherry</option><option value="512">Punjab</option><option value="513">Rajasthan</option><option value="514">Sikkim</option><option value="515">Tamil Nadu</option><option value="516">Telangana</option><option value="517">Tripura</option><option value="518">Uttar Pradesh</option><option value="519">Uttaranchal</option><option value="520">West Bengal</option></select>
                    </div>
                </div>
                <div class="form-group">

                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="inputEmail3" placeholder="Zip/Postal Code">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-10">
                <select name="country_id" id="country" class="form-control" title="Country"><option value=""> </option><option value="IN" selected="selected">India</option></select>
                 </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Save & Continue</button>
                    </div>
                </div>
            </form>         

        </div>
            </div>
        </div>
    </div>
    <footer class="footer">
        <div class="container">
            <p>Footer</p>
        </div>
    </footer>
    <%@include file="footer.jsp" %>