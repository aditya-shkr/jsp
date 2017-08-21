<%-- 
    Document   : list
    Created on : 2 Mar, 2017, 4:42:17 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.html" %>
<%@include file="conn.jsp" %>
<title>List Page</title>
</head>
<body>
    <div class="container" >
        <div style="width:1000px; margin:auto; padding:20px;  border-radius: 10px;  margin-top: 50px;  box-shadow: 0px 0px 5px black; background-color:whitesmoke; ">
            <div ><center><h2>List Page</h2></center>
                <a href="add.jsp" ><span class="fa fa-plus fa-2x" style="float:right;"></span></a></div>
            <table class="table"  id="myTable">
                <thead class="thead-inverse">
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Mobile</th>
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
                        <td><div align="center"><%=++count%></div></td>
                        <td><%=rs.getString("name")%></td>
                        <td><%=rs.getString("email")%></td>
                        <td><%=rs.getString("mobile")%></td>
                        <td>
                            <div align="center"> <a href="edit.jsp?id=<%=rs.getInt("id")%>"> <span  class="fa fa-pencil" name="edit"></span></a>&nbsp&nbsp&nbsp
                                <!--<a href="delete.jsp?id=<%=rs.getInt("id")%>"> <span  class="fa fa-pencil" name="edit"></span></a>&nbsp&nbsp&nbsp</div>-->
                                <a data-toggle="modal" data-target="#myModal"><span class="fa fa-trash" name="del"></span></a></div>
                        </td>
                    </tr>
                <div class="modal fade" id="myModal" >
                    <div class="modal-dialog" role="document">
                        <div class="modal-content" style="background-color:whitesmoke;">
                            <div class="modal-header">
                            </div>
                            <div class="modal-body">
                                <center><p>Do You Want To Delete &nbsp&nbsp<span class="fa fa-exclamation-triangle"/></p></center>
                            </div>
                            <div class="modal-footer">
                                <span type="button" class="fa fa-close" data-dismiss="modal"></span>&nbsp&nbsp
                                <a href="delete.jsp?id=<%=rs.getInt("id")%>" ><span type="button" class="fa fa-check"></span></a>&nbsp&nbsp

                            </div>
                        </div>
                    </div>
                </div>


                <%
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>

    <!--     <script type="text/javascript">
                $(document).ready(function() {
                  var table=$('#myTable').dataTable(
                          {
                              "order":[[1,"des"]];
                              "fnDrawCallback":function (0Settings)
                              {
                                  $('#tbl thead th').each(
                                          
                                          function (i)
                                  {
                                      if(!$(this).hasClass('tfilter'))
                                      {
                                          $(this).removeClass("sorting");
                                          $(this).off();
                                      }
                                  });
                              }
                          });
                    });
           </script>-->
    <jsp:include page="footer.html"></jsp:include>
