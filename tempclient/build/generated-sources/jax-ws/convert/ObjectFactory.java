
package convert;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the convert package. 
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

    private final static QName _FToCResponse_QNAME = new QName("http://convert/", "f_to_cResponse");
    private final static QName _FToC_QNAME = new QName("http://convert/", "f_to_c");
    private final static QName _CToFResponse_QNAME = new QName("http://convert/", "c_to_fResponse");
    private final static QName _CToF_QNAME = new QName("http://convert/", "c_to_f");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: convert
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CToFResponse }
     * 
     */
    public CToFResponse createCToFResponse() {
        return new CToFResponse();
    }

    /**
     * Create an instance of {@link CToF }
     * 
     */
    public CToF createCToF() {
        return new CToF();
    }

    /**
     * Create an instance of {@link FToCResponse }
     * 
     */
    public FToCResponse createFToCResponse() {
        return new FToCResponse();
    }

    /**
     * Create an instance of {@link FToC }
     * 
     */
    public FToC createFToC() {
        return new FToC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FToCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://convert/", name = "f_to_cResponse")
    public JAXBElement<FToCResponse> createFToCResponse(FToCResponse value) {
        return new JAXBElement<FToCResponse>(_FToCResponse_QNAME, FToCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FToC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://convert/", name = "f_to_c")
    public JAXBElement<FToC> createFToC(FToC value) {
        return new JAXBElement<FToC>(_FToC_QNAME, FToC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CToFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://convert/", name = "c_to_fResponse")
    public JAXBElement<CToFResponse> createCToFResponse(CToFResponse value) {
        return new JAXBElement<CToFResponse>(_CToFResponse_QNAME, CToFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CToF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://convert/", name = "c_to_f")
    public JAXBElement<CToF> createCToF(CToF value) {
        return new JAXBElement<CToF>(_CToF_QNAME, CToF.class, null, value);
    }

}
