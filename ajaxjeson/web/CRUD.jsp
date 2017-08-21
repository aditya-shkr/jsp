<%-- 
    Document   : CRUD
    Created on : Mar 23, 2017, 11:50:29 PM
    Author     : MY
--%>
<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<%@page contentType="text/json" pageEncoding="UTF-8"%>
<%@include file="db.jsp"%>
<%
    
String act=request.getParameter("act");

if(act.equals("viewall"))
{
    int count=0;
    int counter=0;
    Statement st1=con.createStatement();
    ResultSet rs1=st1.executeQuery("select count(*) as count from student");
    while(rs1.next())
    {
        counter=rs1.getInt("count");
    }
    Statement st=con.createStatement();
    ResultSet  rs=st.executeQuery("select id,name,mobile,email,gender from student");
    out.print("[");
    while(rs.next())
    {
        count=count+1;
        out.print("{\"id\":\""+rs.getInt("id")+"\",\"name\":\""+rs.getString("name")+"\""+",\"mobile\":\""+rs.getString("mobile")+"\",\"email\":\""+rs.getString("email")+"\","+"\"gender\":\""+rs.getString("gender")+"\"}");
    if(count==counter)
    {
        out.print("");
        
    }
    
    else
    {
        out.print(",");
        
    }
    
    
    
    }
    out.print("]");
}

else if(act.equals("add"))
        {
            String name=request.getParameter("name");
         String mobile=request.getParameter("mobile");
          String email=request.getParameter("email");
           String gender=request.getParameter("gender");
           //int mobile;
           //mobile=Integer.parseInt(request.getParameter("mobile"));
           
           try
           {
               String query="insert into student(name,mobile,email,gender)"+"values(?,?,?,?)";
           
           PreparedStatement ps=con.prepareStatement(query);
           ps.setString(1,name);
            ps.setString(2,mobile); 
            ps.setString(3,email);
               ps.setString(4,gender);
               ps.executeUpdate();
               con.close();
               ps.close();
               out.println("{\"success\":\"inserted Successfully\"}");
        }
catch(Exception ex)
        {
        out.println(ex.getMessage());
        out.println("{\"error\":\"Can not inserteed Record\"}");
        
            
           
            
        }
        }
else if(act.equals("delete"))
{
    int id;
    id=Integer.parseInt(request.getParameter("id"));
    try{
        String query="delete from student where id="+id;
        
                   PreparedStatement ps=con.prepareStatement(query);
           ps.executeUpdate();
           con.close();
           ps.close();
           out.println("{\"success\":\"deleted Successfully\"}");
    }
    catch(Exception ex)
    {
        out.println(ex.getMessage());
        out.println("{\" error\":\"can not deleted Record\"}");
    }
}
else if( act.equals("show"))
{
    int id;
    id=Integer.parseInt(request.getParameter("id"));
    Statement  st=con.createStatement();
    ResultSet rs=st.executeQuery("select id name,email,mobile,gender from student where id="+id);
    if(rs.next())
    {
        out.print("{\"id\":\""+rs.getInt("id")+"\",\"name\":\""+rs.getString("name")+"\""+",\" mobile\":\""+rs.getString("mobile")+"\",\"email\":\""+rs.getString("email")+"\","+"\"gender\":\""+rs.getString("gender")+"\"}");
       
    }
    else{
                out.println("{\"error\":\"Student id not found!\"}");
                
                }
        
    rs.close();
    st.close();
    con.close();
    }


else if(act.equals("update"))
{
    String name=request.getParameter("name");
    String mobile=request.getParameter("mobile");
    String email=request.getParameter("email");String gender=request.getParameter("gender");
    int id;
    id=Integer.parseInt(request.getParameter("#id"));
    try{
        String query="update student set name=?,mobile=?,email=?,gender=?"+"where id="+id;
        PreparedStatement ps=con.prepareStatement(query);
        ps.setString(1,name);
        ps.setString(2,mobile);
        ps.setString(3,email);
        ps.setString(4,gender);
        ps.executeUpdate();
        con.close();
        ps.close();
        out.println("{\"success\":\"updated successfully\"}");
    }
    catch(Exception ex)
    {
        out.println(ex.getMessage());
        out.println("{\"error\":\"can not updated record\"}");
        
    }
    
}


%>