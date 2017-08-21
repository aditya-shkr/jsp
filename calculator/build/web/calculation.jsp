<%-- 
    Document   : calculation
    Created on : 25 Feb, 2017, 3:05:59 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
  int num1=Integer.parseInt(request.getParameter("text1"));
  int num2=Integer.parseInt(request.getParameter("text2"));
             
  String x=request.getParameter("cal");
  
  
if(x.equals("+"))
{
    int sum=(num1+num2);
    out.print(sum);
  
}
 
if(x.equals("/"))
{
   int sum=num1/num2;
    out.print(sum);
}
if(x.equals("-"))
{
  int sum=num1-num2;
    out.print(sum);
}
if(x.equals("*"))
{
   int sum=num1*num2;
  out.print("sum");
}

%>
    </body>
</html>
