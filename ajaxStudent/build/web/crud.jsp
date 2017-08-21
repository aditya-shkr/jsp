<%-- 
    Document   : crud
    Created on : 24 Mar, 2017, 2:45:50 PM
    Author     : Aditya
--%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat,java.util.*,java.util.Date"%>
<%@page contentType="text/json" import="java.sql.*" %>
<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");

    String act = request.getParameter("act");

    if (act.equals("viewall")) {
        int count = 0;
        int counter = 0;
        Statement st1 = con.createStatement();
        ResultSet rs1 = st1.executeQuery("select count(*) as count from student");
        while (rs1.next()) {
            counter = rs1.getInt("count");
        }
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select id,name,email,mobile,gender from student");
        out.print("[");
        while (rs.next()) {
            count = count + 1;
            out.print("{\"id\":\"" + rs.getInt("id") + "\",\"name\":\"" + rs.getString("name") + "\"" + ",\"mobile\":\"" + rs.getString("mobile") + "\",\"email\":\"" + rs.getString("email") + "\"," + "\"gender\":\"" + rs.getString("gender") + "\"}");
            if (count == counter) {
                out.print("");

            } else {
                out.print(",");

            }

        }
        out.print("]");
    } else if (act.equals("add")) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        long mobile = Long.parseLong(request.getParameter("mobile"));
        long phone = Long.parseLong(request.getParameter("phone"));
        String gen = request.getParameter("gender");
        String maritalStatus = request.getParameter("maritalStatus");
        String dob = request.getParameter("dob");
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
        String cl = request.getParameter("class");
//        out.print(name);
        try {
            String query = "insert into student(name,email,address,mobile,phone,gender,maritalstatus,dob,class)" + "values(?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);
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
            con.close();
            ps.close();
            out.println("{\"success\":\"inserted Successfully\"}");
        } catch (Exception ex) {
            out.println(ex.getMessage());
            out.println("{\"error\":\"Can not inserteed Record\"}");

        }
    } else if (act.equals("delete")) {
        int id;
        id = Integer.parseInt(request.getParameter("id"));
        try {
            String query = "delete from student where id=" + id;

            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();
            con.close();
            ps.close();
            out.println("{\"success\":\"deleted Successfully\"}");
        } catch (Exception ex) {
            out.println(ex.getMessage());
            out.println("{\" error\":\"can not deleted Record\"}");
        }
    } else if (act.equals("show")) {
        int id;
        id = Integer.parseInt(request.getParameter("id"));
       
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student where id=" + id);
        if (rs.next()) {
            out.print("{\"id\":\"" + rs.getInt("id") + "\",\"name\":\"" + rs.getString("name") + "\"" + ",\"mobile\":\"" + rs.getString("mobile") + "\",\"email\":\"" + rs.getString("email") + "\"," + "\"gender\":\"" + rs.getString("gender") + "\",\"phone\":\"" + rs.getString("phone")+ "\",\"maritalStatus\":\"" + rs.getString("maritalStatus")+ "\",\"class\":\"" + rs.getString("class")+ "\",\"dob\":\"" + rs.getString("dob")+ "\",\"address\":\"" + rs.getString("address")+ "\"}");

        } else {
            out.println("{\"error\":\"Student id not found!\"}");

        }

        rs.close();
        st.close();
        con.close();
    } else if (act.equals("update")) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        long mobile = Long.parseLong(request.getParameter("mobile"));
        long phone = Long.parseLong(request.getParameter("phone"));
        String gen = request.getParameter("gender");
        String maritalStatus = request.getParameter("maritalStatus");
        String dob = request.getParameter("dob");
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = formatter.parse(dob);
        java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
        String cl = request.getParameter("class");
        int id;
        id = Integer.parseInt(request.getParameter("id"));
        try {
            String query = "update student set name=?,email=?,address=?,mobile=?,phone=?,gender=?,maritalstatus=?,dob=?,class=?" + "where id=" + id;
            PreparedStatement ps = con.prepareStatement(query);
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
            con.close();
            ps.close();
            out.println("{\"success\":\"updated successfully\"}");
        } catch (Exception ex) {
            out.println(ex.getMessage());
            out.println("{\"error\":\"can not updated record\"}");

        }

    }
%>
