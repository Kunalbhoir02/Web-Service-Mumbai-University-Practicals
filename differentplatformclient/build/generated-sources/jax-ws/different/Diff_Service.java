
package different;

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
@WebServiceClient(name = "diff", targetNamespace = "http://different/", wsdlLocation = "http://localhost:8080/different_platform/diff?wsdl")
public class Diff_Service
    extends Service
{

    private final static URL DIFF_WSDL_LOCATION;
    private final static WebServiceException DIFF_EXCEPTION;
    private final static QName DIFF_QNAME = new QName("http://different/", "diff");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/different_platform/diff?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DIFF_WSDL_LOCATION = url;
        DIFF_EXCEPTION = e;
    }

    public Diff_Service() {
        super(__getWsdlLocation(), DIFF_QNAME);
    }

    public Diff_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DIFF_QNAME, features);
    }

    public Diff_Service(URL wsdlLocation) {
        super(wsdlLocation, DIFF_QNAME);
    }

    public Diff_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DIFF_QNAME, features);
    }

    public Diff_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Diff_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Diff
     */
    @WebEndpoint(name = "diffPort")
    public Diff getDiffPort() {
        return super.getPort(new QName("http://different/", "diffPort"), Diff.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Diff
     */
    @WebEndpoint(name = "diffPort")
    public Diff getDiffPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://different/", "diffPort"), Diff.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DIFF_EXCEPTION!= null) {
            throw DIFF_EXCEPTION;
        }
        return DIFF_WSDL_LOCATION;
    }

}
