<%-- 
    Document   : home
    Created on : 24 Mar, 2017, 12:36:10 AM
    Author     : Aditya
--%>

<%@include file="header.jsp" %>
<%@include file="conn.jsp" %>
<%    String emailfrm = request.getParameter("email");
    String passwordfrm = request.getParameter("password");
    
    int count = 0;
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from customer");
    while (rs.next()) {
        String email = rs.getString("email");
        String password = rs.getString("password");
        if (emailfrm.equalsIgnoreCase(email) && passwordfrm.equalsIgnoreCase(password)) {
            
            String fname = new String(rs.getString("fname"));
            String lname = new String(rs.getString("lname"));
            session.setAttribute("email", email);
            session.setAttribute("fname", fname);
            session.setAttribute("lname", lname);
%>
<jsp:forward page="myAccount.jsp"/>
<%
        }
else{
out.print("Wrong Email or Password");
}
    }
%>
<jsp:include page="footer.jsp"></jsp:include>