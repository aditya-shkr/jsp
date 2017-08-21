
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%@include file="db.jsp" %>

<title>JSP Page</title>
</head>
<body>
    <input type="hidden" id="viewallact" name="viewallact" value="viewall"/>
    <input type="hidden" id="addact" name="addact" value="add"/>
    <input type="hidden" id="deleteact" name="deleteact" value="delete"/>
    <input type="hidden" id="showact" name="showact" value="show"/>
    <input type="hidden" id="updateact" name="updateact" value="update"/>
    <div id="page-wrapper">
        <div class="container" >
            <div id="showmessage"></div>
            <div style="width:1000px; margin:auto; padding:20px;  border-radius: 10px;  margin-top: 50px;  box-shadow: 0px 0px 5px black; background-color:whitesmoke; ">
                <div ><center><h2>List Page</h2></center>
                    <button type="button" style="float: right;margin-bottom: 10px;" data-toggle="modal" data-target="#myModal" class="btn btn-info btn-lg">Add Student</button>
                    <input type="button" value="view" onclick="viewall()">
                    <p id="demo"></p>
                    <br>
                    <table class="table"  id="stuinfotb1">
                        <thead class="thead-inverse">
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Mobile</th>
                                <th>EMAIL</th>
                                <th>Gender</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%                            int count = 0;
                                Statement st = con.createStatement();
                                ResultSet rs = st.executeQuery("select * from student");
                                while (rs.next()) {

                            %>
                            <tr>
                                <td><div align="center" ><%=rs.getInt("id")%></div></td>
                                <td><%=rs.getString("name")%></td>                                   
                                <td><%=rs.getLong("mobile")%></td>
                                <td><%=rs.getString("email")%></td>

                                <td><%=rs.getString("gender")%></td>
                                <td>
                                    <div align='center'><a href="javascript:showmodel(<%=rs.getInt("id")%>)">EDIT</a>/<a href="javascript:showdelmodel(<%=rs.getInt("id")%>)">DELETE</a></div>

                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
    </div>
    <div class="modal fade" id="myModal" >
        <div class="modal-dialog" role="document">
            <div class="modal-content" style="background-color:whitesmoke;">
                <div class="modal-header">
                </div>
                <div class="modal-body">
                    <center>
                        <form name="addForm" method="POST" enctype="multipart/form-data">
                            <input type="hidden" id="id" name="id" >
                            <div class="form-group row">
                                <label for="lblname" class="col-sm-3 col-form-label">Name</label>
                                <div class="col-sm-9">
                                    <input type="text" id="name"  class="form-control" name="name" placeholder="Name" required><span class="fa fa-user err"/>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="lblemail" class="col-sm-3 col-form-label">Email</label>
                                <div class="col-sm-9">
                                    <input type="email" id="email" class="form-control" name="email" placeholder="Email" required><span class=" fa fa-envelope err"/>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="lbladdress" class="col-sm-3 col-form-label">Address</label>
                                <div class="col-sm-9">
                                    <input type="text" id="address" class="form-control" name="address" placeholder="Address" required><span class="fa fa-map-marker err"/>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="lblmobile" class="col-sm-3 col-form-label">Mobile</label>
                                <div class="col-sm-9">
                                    <input type="text" id="mobile" class="form-control" name="mobile" placeholder="Mobile" required minlength="10" maxlength="10"><span class="fa fa-mobile err"/>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="lblphone" class="col-sm-3 col-form-label">Phone</label>
                                <div class="col-sm-9">
                                    <input type="text" id="phone" class="form-control" name="phone" placeholder="Phone" required minlength="11" maxlength="11"><span class="fa fa-phone err"/>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="lblphone" class="col-sm-3 col-form-label">Gender</label>
                                <div class="col-sm-9">

                                    <select class="custom-select mb-2 mr-sm-2 mb-sm-2" id="gender" name="gender" required>
                                        <option value="">Choose...</option>
                                        <option value="Male">Male</option>
                                        <option value="Female">Female</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="lblphone" class="col-sm-3 col-form-label">Marital Status</label>
                                <div class="col-sm-9">

                                    <select class="custom-select mb-2 mr-sm-2 mb-sm-0" id="maritalStatus" name="maritalStatus" required>
                                        <option selected>Choose...</option>
                                        <option value="married">Married</option>
                                        <option value="unmarried">UnMarried</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="example-date-input" class="col-sm-3 col-form-label">Date Of Birth</label>
                                <div class="col-sm-9">
                                    <input class="form-control" type="date" value="2011/08/19" id="dob" name="dob">
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="lblclass" class="col-sm-3 col-form-label" >Class</label>
                                <div class="col-sm-9">
                                    <input type="text" id="class" class="form-control" name="class" placeholder="Class" required><span class="fa fa-book err"/>
                                </div>
                            </div>
                        </form>
                    </center>
                </div>
                <div class="modal-footer">
                    <div id="showbtn">
                        <input type="button" id="addbtn" class="btn btn-primary" value="ADD" onclick="savestu()">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--del model-->
    <div class="modal fade" id="delModal" >
        <div class="modal-dialog" role="document">
            <div class="modal-content" style="background-color:whitesmoke;">
                <div class="modal-header">
                </div>
                <div class="modal-body">
                    <center><p>Do You Want To Delete &nbsp&nbsp<span class="fa fa-exclamation-triangle"/></p></center>
                </div>
                <div class="modal-footer">
                    <span type="button" class="fa fa-close" data-dismiss="modal"></span>&nbsp&nbsp
                    <a href="javascript:deletestu()" id="btnYes" ><span type="button" class="fa fa-check"></span></a>&nbsp&nbsp

                </div>
            </div>
        </div>
    </div>

    <%@include file="footer.jsp" %>
