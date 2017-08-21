<%-- 
    Document   : arrayAssc
    Created on : 17 Feb, 2017, 4:43:34 PM
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
        <% int arr[]={2,77,4,69,2,7,68,5,78,79,80,7,61,5,75,4,8,7,6,67,5,4,4,66,5,43,5,66,62,63,80,5,7,15,45,57,32,67,45,87,34,46,43,24,9,23,
        75,3,32,78,5,54,65,76,74,34,7,75,64,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,8,5,85,83,82,81,73,23,34,56,53,72,32,63,86,46,76,54,70,43,87,53,13,58,59,60,71};
          out.println("Original Array:"); 
        for(int i=0;i<100;i++)
        {
            out.println(arr[i]+",");
        }
        
        %>
        <br>
        <br>
        <%
            out.println("After Sorting(Asscending):");
        for(int i=0;i<100;i++)
            {
                for(int j=i+1;j<100;j++)
                {
                    if(arr[i]>arr[j])
                    {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                    }
                }
            }
            for(int i=0;i<100;i++)
            {
                out.println(arr[i]+",");
            }
        %>
    </body>
</html>
