<%-- 
    Document   : calculation
    Created on : 23 Mar, 2017, 5:16:03 PM
    Author     : Aditya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int num1=Integer.parseInt(request.getParameter("num1"));
  int num2=Integer.parseInt(request.getParameter("num2"));
    out.print(num1+num2);
//  String x=request.getParameter("cal");
//  
//  
//if(x.equals("+"))
//{
//    int sum=(num1+num2);
//    out.print(sum); 
//}
// 
//if(x.equals("/"))
//{
//   int sum=num1/num2;
//    out.print(sum);
//}
//if(x.equals("-"))
//{
//  int sum=num1-num2;
//    out.print(sum);
//}
//if(x.equals("*"))
//{
//   int sum=num1*num2;
//  out.print("sum");
//}
%>
