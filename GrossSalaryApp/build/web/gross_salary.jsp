<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="grosssalary.SalaryCalculator"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gross Salary Calculation</title>
</head>
<body>
    <h1>Gross Salary is:</h1><br>
    <%
    try {
        SalaryCalculator service = new SalaryCalculator();
        String s = request.getParameter("Salary");

        if (s != null && !s.isEmpty()) {
            int salary = Integer.parseInt(s);
            double da = service.CalculateDA(salary);
            double hra = service.CalculateHRA(salary);
            double result = service.CalculateGross(salary, da, hra);
            out.println("Result = " + result);
        } else {
            out.println("Please enter a valid salary.");
        }
    } catch (NumberFormatException e) {
        out.println("Error: Please enter a numeric value for salary.");
    } catch (Exception ex) {
        out.println("Error: " + ex.getMessage());
    }
    %>
    <hr/>
</body>
</html>
