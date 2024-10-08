
package currconvert;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the currconvert package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DToR_QNAME = new QName("http://currconvert/", "d_to_r");
    private final static QName _RToDResponse_QNAME = new QName("http://currconvert/", "r_to_dResponse");
    private final static QName _DToRResponse_QNAME = new QName("http://currconvert/", "d_to_rResponse");
    private final static QName _RToD_QNAME = new QName("http://currconvert/", "r_to_d");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: currconvert
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RToDResponse }
     * 
     */
    public RToDResponse createRToDResponse() {
        return new RToDResponse();
    }

    /**
     * Create an instance of {@link DToR }
     * 
     */
    public DToR createDToR() {
        return new DToR();
    }

    /**
     * Create an instance of {@link RToD }
     * 
     */
    public RToD createRToD() {
        return new RToD();
    }

    /**
     * Create an instance of {@link DToRResponse }
     * 
     */
    public DToRResponse createDToRResponse() {
        return new DToRResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DToR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://currconvert/", name = "d_to_r")
    public JAXBElement<DToR> createDToR(DToR value) {
        return new JAXBElement<DToR>(_DToR_QNAME, DToR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RToDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://currconvert/", name = "r_to_dResponse")
    public JAXBElement<RToDResponse> createRToDResponse(RToDResponse value) {
        return new JAXBElement<RToDResponse>(_RToDResponse_QNAME, RToDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DToRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://currconvert/", name = "d_to_rResponse")
    public JAXBElement<DToRResponse> createDToRResponse(DToRResponse value) {
        return new JAXBElement<DToRResponse>(_DToRResponse_QNAME, DToRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RToD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://currconvert/", name = "r_to_d")
    public JAXBElement<RToD> createRToD(RToD value) {
        return new JAXBElement<RToD>(_RToD_QNAME, RToD.class, null, value);
    }

}
