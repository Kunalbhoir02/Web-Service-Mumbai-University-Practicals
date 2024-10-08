<%-- 
    Document   : addserv
    Created on : 04-Oct-2024, 22:16:08
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
        String s1=request.getParameter("t1");
        String s2=request.getParameter("t2");
       

        %>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	addition.Arithmetic_Service service = new addition.Arithmetic_Service();
	addition.Arithmetic port = service.getArithmeticPort();
	 // TODO initialize WS operation arguments here
	float a = Float.parseFloat(s1);
        float b = Float.parseFloat(s2);

	// TODO process result here
	float result = port.addition(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
