
package addition;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "arithmetic", targetNamespace = "http://addition/", wsdlLocation = "http://localhost:8080/arithmetic_operation/arithmetic?wsdl")
public class Arithmetic_Service
    extends Service
{

    private final static URL ARITHMETIC_WSDL_LOCATION;
    private final static WebServiceException ARITHMETIC_EXCEPTION;
    private final static QName ARITHMETIC_QNAME = new QName("http://addition/", "arithmetic");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/arithmetic_operation/arithmetic?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ARITHMETIC_WSDL_LOCATION = url;
        ARITHMETIC_EXCEPTION = e;
    }

    public Arithmetic_Service() {
        super(__getWsdlLocation(), ARITHMETIC_QNAME);
    }

    public Arithmetic_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ARITHMETIC_QNAME, features);
    }

    public Arithmetic_Service(URL wsdlLocation) {
        super(wsdlLocation, ARITHMETIC_QNAME);
    }

    public Arithmetic_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ARITHMETIC_QNAME, features);
    }

    public Arithmetic_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Arithmetic_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Arithmetic
     */
    @WebEndpoint(name = "arithmeticPort")
    public Arithmetic getArithmeticPort() {
        return super.getPort(new QName("http://addition/", "arithmeticPort"), Arithmetic.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Arithmetic
     */
    @WebEndpoint(name = "arithmeticPort")
    public Arithmetic getArithmeticPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://addition/", "arithmeticPort"), Arithmetic.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ARITHMETIC_EXCEPTION!= null) {
            throw ARITHMETIC_EXCEPTION;
        }
        return ARITHMETIC_WSDL_LOCATION;
    }

}
