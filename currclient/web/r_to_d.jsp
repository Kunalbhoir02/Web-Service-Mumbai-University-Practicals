<%-- 
    Document   : r_to_d
    Created on : 05-Oct-2024, 09:50:18
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
        <h1>R_to_dollar</h1>
        
    <%-- start web service invocation --%><hr/>
    <%
        String d=request.getParameter("data");
        int dd=Integer.parseInt(d);
    try {
	currconvert.Currconvert_Service service = new currconvert.Currconvert_Service();
	currconvert.Currconvert port = service.getCurrconvertPort();
	 // TODO initialize WS operation arguments here
	double r = dd;
	// TODO process result here
	double result = port.rToD(r);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
