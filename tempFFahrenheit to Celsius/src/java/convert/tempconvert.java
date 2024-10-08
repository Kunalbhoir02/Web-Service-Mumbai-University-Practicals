/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kunal
 */
@WebService(serviceName = "tempconvert")
public class tempconvert {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "f_to_c")
    public Double f_to_c(@WebParam(name = "f") double f) {
        //TODO write your implementation code here:
        Double c=(f-32)*0.6;
        return c;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "c_to_f")
    public double c_to_f(@WebParam(name = "c") double c) {
        //TODO write your implementation code here:
        Double f = (c*1.8)+32; 
        return f;

    }
}
