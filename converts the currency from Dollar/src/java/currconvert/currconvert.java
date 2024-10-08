/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currconvert;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kunal
 */
@WebService(serviceName = "currconvert")
public class currconvert {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "d_to_r")
    public double d_to_r(@WebParam(name = "d") double d) {
        //TODO write your implementation code here:
        double r = (d * 83.46); 
        return r;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "r_to_d")
    public double r_to_d(@WebParam(name = "r") double r) {
        //TODO write your implementation code here:
        double d = (r / 83.46); 
          return d;

    }
}
