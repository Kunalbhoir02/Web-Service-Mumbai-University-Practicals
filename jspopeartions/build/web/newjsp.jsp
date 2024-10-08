<%-- 
    Document   : newjsp
    Created on : 05-Oct-2024, 10:47:30
    Author     : Kunal
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
        operation.operations a1=new operation.operations();
        int d=a1.Add(5, 10);
        int e=a1.Mult(10, 20);
        int f=a1.Sub(30, 10);
        int g=a1.div(100, 50);
        
        out.println("Addition :" + d+"<br>");
        out.println("Multiplication :" + e+"<br>");
        out.println("Subtraction :" + f+"<br>");
        out.println("Division :" + g);
        
        %>
    </body>


</html>
