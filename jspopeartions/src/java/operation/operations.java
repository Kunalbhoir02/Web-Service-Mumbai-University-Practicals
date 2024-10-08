/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kunal
 */
@WebService(serviceName = "operations")
public class operations {

    @WebMethod(operationName = "Add")
    public int Add(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int c=a+b;
        return c;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sub")
    public int Sub(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int c=a-b;
        return c;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Mult")
    public int Mult(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int c=a*b;
        return c;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        int c=a/b;
        return c;
    }

}
