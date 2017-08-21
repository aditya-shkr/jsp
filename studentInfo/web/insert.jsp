<%-- 
    Document   : insert
    Created on : 9 Mar, 2017, 5:18:25 PM
    Author     : Aditya
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat,java.util.*,java.util.Date"%>
<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@include file="conn.jsp"%>
<% 
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String address=request.getParameter("address");
    long mobile = Long.parseLong(request.getParameter("mobile"));
    long phone = Long.parseLong(request.getParameter("phone"));
    String gen=request.getParameter("gen");
    String maritalStatus=request.getParameter("maritalStatus");
    String dob=request.getParameter("dob");
    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Date myDate =formatter.parse(dob);
   java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
    String cl=request.getParameter("class");
    try
    {
        String query="insert into student(name,email,address,mobile,phone,gender,maritalstatus,dob,class)"+"values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, address);
        ps.setLong(4, mobile);
        ps.setLong(5, phone);
        ps.setString(6, gen);
        ps.setString(7, maritalStatus);
        ps.setDate(8, sqlDate);
        ps.setString(9, cl);
        ps.executeUpdate();
        %>
        <jsp:forward page="list.jsp"/>
        <%            
        con.close();
        ps.close();       
    }  
    catch(Exception e)
            {
                out.print(e);
            }
%>