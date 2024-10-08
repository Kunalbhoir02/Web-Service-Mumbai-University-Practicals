
package grosssalary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SalaryCalculator", targetNamespace = "http://grosssalary/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SalaryCalculator {


    /**
     * 
     * @param salary
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "CalculateDA")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CalculateDA", targetNamespace = "http://grosssalary/", className = "grosssalary.CalculateDA")
    @ResponseWrapper(localName = "CalculateDAResponse", targetNamespace = "http://grosssalary/", className = "grosssalary.CalculateDAResponse")
    @Action(input = "http://grosssalary/SalaryCalculator/CalculateDARequest", output = "http://grosssalary/SalaryCalculator/CalculateDAResponse")
    public Double calculateDA(
        @WebParam(name = "Salary", targetNamespace = "")
        int salary);

    /**
     * 
     * @param salary
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "CalculateHRA")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CalculateHRA", targetNamespace = "http://grosssalary/", className = "grosssalary.CalculateHRA")
    @ResponseWrapper(localName = "CalculateHRAResponse", targetNamespace = "http://grosssalary/", className = "grosssalary.CalculateHRAResponse")
    @Action(input = "http://grosssalary/SalaryCalculator/CalculateHRARequest", output = "http://grosssalary/SalaryCalculator/CalculateHRAResponse")
    public Double calculateHRA(
        @WebParam(name = "Salary", targetNamespace = "")
        int salary);

    /**
     * 
     * @param da
     * @param salary
     * @param hra
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "CalculateGross")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CalculateGross", targetNamespace = "http://grosssalary/", className = "grosssalary.CalculateGross")
    @ResponseWrapper(localName = "CalculateGrossResponse", targetNamespace = "http://grosssalary/", className = "grosssalary.CalculateGrossResponse")
    @Action(input = "http://grosssalary/SalaryCalculator/CalculateGrossRequest", output = "http://grosssalary/SalaryCalculator/CalculateGrossResponse")
    public Double calculateGross(
        @WebParam(name = "Salary", targetNamespace = "")
        int salary,
        @WebParam(name = "DA", targetNamespace = "")
        double da,
        @WebParam(name = "HRA", targetNamespace = "")
        double hra);

}