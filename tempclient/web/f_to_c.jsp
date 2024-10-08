<%-- 
    Document   : f_to_c
    Created on : 05-Oct-2024, 09:35:05
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
        
    <%-- start web service invocation --%><hr/>
    <%
        String d=request.getParameter("data");
        int dd=Integer.parseInt(d);
    try {
	convert.Tempconvert_Service service = new convert.Tempconvert_Service();
	convert.Tempconvert port = service.getTempconvertPort();
	 // TODO initialize WS operation arguments here
	double f = dd;
	// TODO process result here
	java.lang.Double result = port.fToC(f);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
