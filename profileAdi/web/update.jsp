<%-- 
    Document   : upload
    Created on : 11 Apr, 2017, 11:53:10 AM
    Author     : Aditya
--%>

<%@ page import="java.io.*"%>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="java.util.*" %>
<%@include file="db.jsp" %>
<%     try {
        MultipartRequest mrequest = new MultipartRequest(request,"C:/Users/Aditya/OneDrive/Documents/NetBeansProjects/profileAdi/web/images");
        int id = Integer.parseInt(mrequest.getParameter("id"));
        String name = mrequest.getParameter("name");
        String phone = mrequest.getParameter("phone");
        String email = mrequest.getParameter("email");
        String password = mrequest.getParameter("password");
        String img1 = mrequest.getParameter("img1");
        String fname = mrequest.getParameter("imgName");//recieve filename
        

        Enumeration files = mrequest.getFileNames();

        while (files.hasMoreElements()) {
            
            String upload = (String) files.nextElement();
            String filename = mrequest.getFilesystemName(upload);   
            
            if (filename==null || filename.isEmpty()){
            String query = "update profile set name=?,phone=?,email=?,pic=?,password=?"+"where id="+id;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.setString(4, img1);
            ps.setString(5, password);
            ps.executeUpdate();
            %>
            <jsp:forward page="login.jsp"/>
            <%
        }
else {
String query = "update profile set name=?,phone=?,email=?,pic=?,password=?"+"where id="+id;
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, email);
            ps.setString(4, filename);
            ps.setString(5, password);
            ps.executeUpdate();
%>
<jsp:forward page="login.jsp"/>
            <%
}
}
    } catch (Exception ex) {
        out.print("Error creating file: " + ex);
    }
%> 