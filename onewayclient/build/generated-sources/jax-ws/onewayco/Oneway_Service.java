
package onewayco;

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
@WebServiceClient(name = "oneway", targetNamespace = "http://onewayco/", wsdlLocation = "http://localhost:8080/one_way_communication/oneway?wsdl")
public class Oneway_Service
    extends Service
{

    private final static URL ONEWAY_WSDL_LOCATION;
    private final static WebServiceException ONEWAY_EXCEPTION;
    private final static QName ONEWAY_QNAME = new QName("http://onewayco/", "oneway");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/one_way_communication/oneway?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ONEWAY_WSDL_LOCATION = url;
        ONEWAY_EXCEPTION = e;
    }

    public Oneway_Service() {
        super(__getWsdlLocation(), ONEWAY_QNAME);
    }

    public Oneway_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ONEWAY_QNAME, features);
    }

    public Oneway_Service(URL wsdlLocation) {
        super(wsdlLocation, ONEWAY_QNAME);
    }

    public Oneway_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ONEWAY_QNAME, features);
    }

    public Oneway_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Oneway_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Oneway
     */
    @WebEndpoint(name = "onewayPort")
    public Oneway getOnewayPort() {
        return super.getPort(new QName("http://onewayco/", "onewayPort"), Oneway.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Oneway
     */
    @WebEndpoint(name = "onewayPort")
    public Oneway getOnewayPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://onewayco/", "onewayPort"), Oneway.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ONEWAY_EXCEPTION!= null) {
            throw ONEWAY_EXCEPTION;
        }
        return ONEWAY_WSDL_LOCATION;
    }

}