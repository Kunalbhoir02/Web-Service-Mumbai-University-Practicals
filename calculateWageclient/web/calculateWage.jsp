<%@ page import="javax.xml.namespace.QName" %>
<%@ page import="javax.xml.ws.Service" %>
<%@ page import="java.net.URL" %>
<%@ page import="b.WageCalculatorService" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculated Wage</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            padding: 0;
            background-color: #f4f4f4;
        }
        h1 {
            color: #333;
        }
        .result {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: auto;
        }
        .error {
            color: red;
        }
        a {
            color: #1a73e8;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>Employee Wage Calculator</h1>
    <div class="result">
        <%
            String startDateStr = request.getParameter("startDate");
            String endDateStr = request.getParameter("endDate");
            if (startDateStr != null && endDateStr != null) {
                try {
                    URL wsdlURL = new URL("http://localhost:8080/WageCalculator/WageCalculatorService?wsdl");

                    QName serviceName = new QName("http://b/", "WageCalculatorService");
                    QName portName = new QName("http://b/", "WageCalculatorServicePort");

                    Service service = Service.create(wsdlURL, serviceName);
                    WageCalculatorService port = service.getPort(portName, WageCalculatorService.class);

                    double wage = port.calculateWage(startDateStr, endDateStr);
                    out.println("<div>Calculated Wage: " + wage + "</div>");
                } catch (Exception e) {
                    out.println("<div class='error'>Error calculating wage: " + e.getMessage() + "</div>");
                }
            }
        %>
        <a href="index.html">Go back</a>
    </div>
</body>
</html>
