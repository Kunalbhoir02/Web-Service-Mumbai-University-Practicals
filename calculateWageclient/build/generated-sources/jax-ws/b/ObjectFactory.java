
package b;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the b package. 
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

    private final static QName _CalculateWage_QNAME = new QName("http://b/", "calculateWage");
    private final static QName _CalculateWageResponse_QNAME = new QName("http://b/", "calculateWageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: b
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateWageResponse }
     * 
     */
    public CalculateWageResponse createCalculateWageResponse() {
        return new CalculateWageResponse();
    }

    /**
     * Create an instance of {@link CalculateWage }
     * 
     */
    public CalculateWage createCalculateWage() {
        return new CalculateWage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateWage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b/", name = "calculateWage")
    public JAXBElement<CalculateWage> createCalculateWage(CalculateWage value) {
        return new JAXBElement<CalculateWage>(_CalculateWage_QNAME, CalculateWage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateWageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://b/", name = "calculateWageResponse")
    public JAXBElement<CalculateWageResponse> createCalculateWageResponse(CalculateWageResponse value) {
        return new JAXBElement<CalculateWageResponse>(_CalculateWageResponse_QNAME, CalculateWageResponse.class, null, value);
    }

}
