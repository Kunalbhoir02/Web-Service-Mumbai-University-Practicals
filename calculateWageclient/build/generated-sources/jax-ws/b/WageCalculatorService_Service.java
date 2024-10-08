
package b;

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
@WebServiceClient(name = "WageCalculatorService", targetNamespace = "http://b/", wsdlLocation = "http://localhost:8080/WageCalculator/WageCalculatorService?wsdl")
public class WageCalculatorService_Service
    extends Service
{

    private final static URL WAGECALCULATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException WAGECALCULATORSERVICE_EXCEPTION;
    private final static QName WAGECALCULATORSERVICE_QNAME = new QName("http://b/", "WageCalculatorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WageCalculator/WageCalculatorService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WAGECALCULATORSERVICE_WSDL_LOCATION = url;
        WAGECALCULATORSERVICE_EXCEPTION = e;
    }

    public WageCalculatorService_Service() {
        super(__getWsdlLocation(), WAGECALCULATORSERVICE_QNAME);
    }

    public WageCalculatorService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WAGECALCULATORSERVICE_QNAME, features);
    }

    public WageCalculatorService_Service(URL wsdlLocation) {
        super(wsdlLocation, WAGECALCULATORSERVICE_QNAME);
    }

    public WageCalculatorService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WAGECALCULATORSERVICE_QNAME, features);
    }

    public WageCalculatorService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WageCalculatorService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WageCalculatorService
     */
    @WebEndpoint(name = "WageCalculatorServicePort")
    public WageCalculatorService getWageCalculatorServicePort() {
        return super.getPort(new QName("http://b/", "WageCalculatorServicePort"), WageCalculatorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WageCalculatorService
     */
    @WebEndpoint(name = "WageCalculatorServicePort")
    public WageCalculatorService getWageCalculatorServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://b/", "WageCalculatorServicePort"), WageCalculatorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WAGECALCULATORSERVICE_EXCEPTION!= null) {
            throw WAGECALCULATORSERVICE_EXCEPTION;
        }
        return WAGECALCULATORSERVICE_WSDL_LOCATION;
    }

}
