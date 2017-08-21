<%-- 
    Document   : upload
    Created on : 7 Apr, 2017, 8:06:37 PM
    Author     : shriram
--%>

<%@ page import="java.io.*"%>
 <%@page import="com.oreilly.servlet.MultipartRequest" %>
 <%@ page import="java.util.*" %>
 <%@include file="db.jsp" %>
 <%
try
   {
    MultipartRequest mrequest = new MultipartRequest(request,"D:/New");
    String file_name=mrequest.getParameter("fname");//recieve fname
    String name=mrequest.getParameter("name");//recieve fname
    
    Enumeration files = mrequest.getFileNames();

    while(files.hasMoreElements() )
      {
        String upload = (String)files.nextElement();
         String filename = mrequest.getFilesystemName(upload);
         String path="D:/New"+filename;
        String query="insert into image(path,name)"+"values(?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1, path);
        ps.setString(2, name);     
        ps.executeUpdate();
    }
}
catch(Exception ex)
{
out.print("Error creating file: " + ex );
}%> 
