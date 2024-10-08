package grosssalary;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "SalaryCalculatorService")
public class SalaryCalculator {

    @WebMethod(operationName = "CalculateDA")
    public Double CalculateDA(@WebParam(name = "Salary") int Salary) {
        return 0.4 * Salary;
    }

    @WebMethod(operationName = "CalculateHRA")
    public Double CalculateHRA(@WebParam(name = "Salary") int Salary) {
        return 0.2 * Salary;
    }

    @WebMethod(operationName = "CalculateGross")
    public Double CalculateGross(@WebParam(name = "Salary") int Salary, @WebParam(name = "DA") double DA, @WebParam(name = "HRA") double HRA) {
        return Salary + DA + HRA;
    }
}
