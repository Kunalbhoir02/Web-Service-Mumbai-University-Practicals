<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Get Data</title>
</head>
<body>
    <h1>Hello World!</h1>
<%-- start web service invocation --%><hr/>
<%
    try {
        onewayco.Oneway_Service service = new onewayco.Oneway_Service();
        onewayco.Oneway port = service.getOnewayPort();
        
        int id = Integer.parseInt(request.getParameter("txt3"));
        
        String result = port.getname(id);
        out.println("Result = " + result);
    } catch (Exception ex) {
        out.println("Error: " + ex.getMessage());
    }
%>
<%-- end web service invocation --%><hr/>
</body>
</html>
