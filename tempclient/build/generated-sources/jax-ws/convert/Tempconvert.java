
package convert;

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
@WebService(name = "tempconvert", targetNamespace = "http://convert/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Tempconvert {


    /**
     * 
     * @param c
     * @return
     *     returns double
     */
    @WebMethod(operationName = "c_to_f")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "c_to_f", targetNamespace = "http://convert/", className = "convert.CToF")
    @ResponseWrapper(localName = "c_to_fResponse", targetNamespace = "http://convert/", className = "convert.CToFResponse")
    @Action(input = "http://convert/tempconvert/c_to_fRequest", output = "http://convert/tempconvert/c_to_fResponse")
    public double cToF(
        @WebParam(name = "c", targetNamespace = "")
        double c);

    /**
     * 
     * @param f
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "f_to_c")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "f_to_c", targetNamespace = "http://convert/", className = "convert.FToC")
    @ResponseWrapper(localName = "f_to_cResponse", targetNamespace = "http://convert/", className = "convert.FToCResponse")
    @Action(input = "http://convert/tempconvert/f_to_cRequest", output = "http://convert/tempconvert/f_to_cResponse")
    public Double fToC(
        @WebParam(name = "f", targetNamespace = "")
        double f);

}
