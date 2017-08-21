<%-- 
    Document   : profile
    Created on : 10 Apr, 2017, 11:48:01 AM
    Author     : Aditya
--%>

<%@page contentType="text/html" session="true" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%@include file="db.jsp" %>
<title>Profile Page</title>
</head>
<body>
    <div class="container" style="margin-top: 100px;">
        <div class="row" style="background-color:  snow;box-shadow: 0px 0px 8px 2px; padding: 40px; width: 60%; " >
           
                    <form action="update.jsp" method="post" enctype="multipart/form-data">
                         <%                            
//                        int id=Integer.parseInt(request.getParameter("id"));
                            int id=(Integer)session.getAttribute("id");
                            
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select * from profile where id="+id);
                        while (rs.next()) {

                    %>
            <div class="col-md-6 " style="text-align: center;">
                <input type="hidden" name="id" value="<%=rs.getInt("id")%>">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="name" name="name" value="<%=rs.getString("name")%>">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="phone" name="phone" value="<%=rs.getString("phone")%>">
                </div>
                <div class="form-group">
                    <input type="email" class="form-control" placeholder="email" name="email" value="<%=rs.getString("email")%>">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="password" name="password" value="<%=rs.getString("password")%>">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="confirm password" name="password1">
                </div>
                <div class="form-group">
                    <button class="btn btn-primary"  type="submit" value="submit">Submit</button>
                </div>


            </div>
            <div class="col-md-6 " style="text-align: center;">
                <div class="form-group">
                    <input type="hidden" value="<%=rs.getString("pic")%>" name="img1">
                    <img src="images/<%=rs.getString("pic")%>"  name="profImg" id="profImg"  class="image"  >
                </div>
                <div class="form-group" >
                    <label class="btn btn-primary">Browse..<input type="file" style="display:none;" id="imgName" name="imgName"/></label>
                </div>        
            </div>
</form>
                <%}%>
        </div>
    </div>
    
    <%@include file="footer.jsp" %>
    <script>
        $(function () {
            $('#imgName').change(function (e) {

                var img = URL.createObjectURL(e.target.files[0]);
                $('#profImg').attr('src', img);
            });
        });
    </script>