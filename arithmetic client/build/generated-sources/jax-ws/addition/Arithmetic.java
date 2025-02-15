
package addition;

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
@WebService(name = "arithmetic", targetNamespace = "http://addition/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Arithmetic {


    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addition", targetNamespace = "http://addition/", className = "addition.Addition")
    @ResponseWrapper(localName = "additionResponse", targetNamespace = "http://addition/", className = "addition.AdditionResponse")
    @Action(input = "http://addition/arithmetic/additionRequest", output = "http://addition/arithmetic/additionResponse")
    public float addition(
        @WebParam(name = "a", targetNamespace = "")
        float a,
        @WebParam(name = "b", targetNamespace = "")
        float b);

}
