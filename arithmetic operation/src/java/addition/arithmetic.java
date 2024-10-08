/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kunal
 */
@WebService(serviceName = "arithmetic")
public class arithmetic {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addition")
    public float addition(@WebParam(name = "a") float a, @WebParam(name = "b") float b) {
        //TODO write your implementation code here:
        return a+b;
    }
}
