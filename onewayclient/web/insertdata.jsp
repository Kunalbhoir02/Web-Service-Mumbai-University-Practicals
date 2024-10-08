<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert Data</title>
</head>
<body>
  
<%-- start web service invocation --%><hr/>
<%
    try {
        onewayco.Oneway_Service service = new onewayco.Oneway_Service();
        onewayco.Oneway port = service.getOnewayPort();
        
        int id = Integer.parseInt(request.getParameter("txt1"));
        String name = request.getParameter("txt2");
        
        String result = port.insert(id, name);
        out.println("Result = " + result);
    } catch (Exception ex) {
        out.println("Error: " + ex.getMessage());
    }
%>
<%-- end web service invocation --%><hr/>
</body>
</html>
