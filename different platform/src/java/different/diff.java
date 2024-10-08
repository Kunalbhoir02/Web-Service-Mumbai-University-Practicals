/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package different;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Kunal
 */
@WebService(serviceName = "diff")
public class diff {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "introDollar")
    public String introDollar(@WebParam(name = "a") double a) {
        //TODO write your implementation code here:
        return "The Indian rupees"+a+"in Dollars is:"+(a/83.17);
    }
}
