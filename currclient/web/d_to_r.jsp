<%-- 
    Document   : d_to_r
    Created on : 05-Oct-2024, 09:50:03
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
        <h1>dollar To Rupees</h1>
        
    <%-- start web service invocation --%><hr/>
    <%
        String d1=request.getParameter("data");
        int d2=Integer.parseInt(d1);
    try {
	currconvert.Currconvert_Service service = new currconvert.Currconvert_Service();
	currconvert.Currconvert port = service.getCurrconvertPort();
	 // TODO initialize WS operation arguments here
	double d = d2;
	// TODO process result here
	double result = port.dToR(d);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
