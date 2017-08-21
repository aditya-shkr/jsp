
<%@page language="java" import="java.util.*" contentType="text/html" pageEncoding="UTF-8"%>


<%
  int num1=Integer.parseInt(request.getParameter("text1"));
  int num2=Integer.parseInt(request.getParameter("text2"));
  String x=request.getParameter("cal");
  
  out.print(num1);
if(x.equals("+"))
{
   int rslt=num1+num2;
  out.print(rslt);
}
  

%>

   
