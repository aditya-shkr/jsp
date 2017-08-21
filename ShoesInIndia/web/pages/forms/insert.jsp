<%-- 
    Document   : insert
    Created on : 2 May, 2017, 3:22:21 PM
    Author     : Aditya
--%>

<%@ page import="java.io.*"%>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="java.util.*" %>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat,java.util.*,java.util.Date"%>
<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@include file="../../db.jsp"%>
<% 
    
    MultipartRequest mrequest = new MultipartRequest(request,"C:/Users/Aditya/OneDrive/Documents/NetBeansProjects/shoesInIndia/web/images");
        
        String name = mrequest.getParameter("name");
        String desc = mrequest.getParameter("desc");
        String price = mrequest.getParameter("price");
        String qty = mrequest.getParameter("qty");
        String brand = mrequest.getParameter("brand");
        String catg = mrequest.getParameter("catg");
        String gender = mrequest.getParameter("gender");
        String size = mrequest.getParameter("size");
        String type = mrequest.getParameter("type");
        String cdate = mrequest.getParameter("cdate");
//    String name=request.getParameter("name");
//    String email=request.getParameter("desc");
//    String address=request.getParameter("price");
//    long mobile = Long.parseLong(request.getParameter("qty"));
//    long phone = Long.parseLong(request.getParameter("brand"));
//    String catg=request.getParameter("catg");
//    String gen=request.getParameter("gender");
//    long size = Long.parseLong(request.getParameter("size"));
//    String type=request.getParameter("type");
//    String maritalStatus=request.getParameter("maritalStatus");
//    String dob=request.getParameter("dob");
//    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//    Date myDate =formatter.parse(dob);
//   java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
//    String cl=request.getParameter("class");
    try
    {
        String query="insert into product(name,descr,price,maincat,brand,gender,size,color,qty,shoetype,cdate)"+"values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, name);
        ps.setString(2, desc);
        ps.setString(3, price);
        ps.setString(4, catg);
        ps.setString(5, brand);
        ps.setString(6, gender);
        ps.setString(7, size);
        ps.setString(8, color);
        ps.setString(9, qty);
        ps.setString(10, type);
        ps.setString(11, cdate);
        ps.executeUpdate();        
        con.close();
        ps.close();       
    }  
    catch(Exception e)
            {
                out.print(e);
            }
%>