<%-- 
    Document   : add
    Created on : 2 Mar, 2017, 5:35:02 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.html" %>
<%@include file="conn.jsp" %>
<title>JSP Page</title>
    </head>
    <body>
        <div class="wrapper">
            <div class="outer">
                <%             
                    int id=Integer.parseInt(request.getParameter("id"));
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from student where id="+id);
                    while(rs.next())
                    {
                %>
    <form name="editForm" action="update.jsp">
      <div class="form-group row">
          <input type="hidden" id="id" name="id" value="<%=rs.getInt("id")%>">
          <label for="lblname" class="col-sm-3 col-form-label">Name</label>
      <div class="col-sm-9">
          <input type="text"  class="form-control" placeholder="Name" id="name" name="name" value="<%=rs.getString("name") %>" required ><span class="fa fa-user err"/>
      </div>
    </div>
    <div class="form-group row">
      <label for="lblemail" class="col-sm-3 col-form-label">Email</label>
      <div class="col-sm-9">
        <input type="email" class="form-control" placeholder="Email" id="email" name="email" value="<%=rs.getString("email") %>" required><span class=" fa fa-envelope err"/>
      </div>
    </div>
    <div class="form-group row">
      <label for="lbladdress" class="col-sm-3 col-form-label">Address</label>
      <div class="col-sm-9">
          <input type="text" class="form-control" placeholder="Address" id="address" name="address" value="<%=rs.getString("address") %>" required><span class="fa fa-map-marker err"/>
      </div>
    </div>
      <div class="form-group row">
      <label for="lblmobile" class="col-sm-3 col-form-label">Mobile</label>
      <div class="col-sm-9">
          <input type="text" class="form-control" placeholder="Mobile" id="mobile" name="mobile" value="<%=rs.getString("mobile") %>" required minlength="10" maxlength="10"><span class="fa fa-mobile err"/>
      </div>
    </div>
      <div class="form-group row">
      <label for="lblphone" class="col-sm-3 col-form-label">Phone</label>
      <div class="col-sm-9">
          <input type="text" class="form-control" name="phone" placeholder="Phone" id="phone" value="<%=rs.getString("phone") %>" required minlength="11" maxlength="11"><span class="fa fa-phone err"/>
      </div>
    </div>
      <fieldset class="form-group row">
      <label for="lblgender" class="col-sm-3 col-form-label">Gender</label>
      <div class="col-sm-9">
        <div class="form-check">
          <label class="form-check-label">
            <input class="form-check-input" type="radio" name="gen"  value="Male" checked>
            Male
          </label>
        </div>
        <div class="form-check">
          <label class="form-check-label">
            <input class="form-check-input" type="radio" name="gen"  value="Female">
            Female
          </label>
        </div>
        
      </div>
    </fieldset>
      <div class="form-group row">
      <label for="lblphone" class="col-sm-3 col-form-label">Marital Status</label>
      <div class="col-sm-9">
          
          <select class="custom-select mb-2 mr-sm-2 mb-sm-0" id="maritalStatus" name="maritalStatus" required>
              <option selected><%=rs.getString("maritalstatus") %></option>
    <option value="married">Married</option>
    <option value="unmarried">UnMarried</option>
  </select>
      </div>
    </div>
      <div class="form-group row">
  <label for="example-date-input" class="col-sm-3 col-form-label">Date Of Birth</label>
  <div class="col-sm-9">
      <input class="form-control" type="date" id="dob" name="dob" value="<%=rs.getString("dob") %>" >
  </div>
</div>
    <div class="form-group row">
      <label for="lblclass" class="col-sm-3 col-form-label" >Class</label>
      <div class="col-sm-9">
          <input type="text" class="form-control" name="class" id="class" value="<%=rs.getString("class") %>" placeholder="Class" required><span class="fa fa-book err"/>
      </div>
    </div>
      <%
      }
      %>
    <div class="form-group row">
      <div class="offset-sm-2 col-sm-12">
          <center><input type="submit" class="btn btn-primary" value="Update">&nbsp&nbsp&nbsp&nbsp
              <a href="list.jsp"><input type="button" class="btn btn-secondary" id="cancel" value="Cancel"></a>
          </center>
      </div>
    </div>
  </form>
   </div>
</div>
<jsp:include page="footer.html"/>