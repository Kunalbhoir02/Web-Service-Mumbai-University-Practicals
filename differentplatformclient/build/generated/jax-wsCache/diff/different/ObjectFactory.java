
package different;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the different package. 
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

    private final static QName _IntroDollar_QNAME = new QName("http://different/", "introDollar");
    private final static QName _IntroDollarResponse_QNAME = new QName("http://different/", "introDollarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: different
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntroDollarResponse }
     * 
     */
    public IntroDollarResponse createIntroDollarResponse() {
        return new IntroDollarResponse();
    }

    /**
     * Create an instance of {@link IntroDollar }
     * 
     */
    public IntroDollar createIntroDollar() {
        return new IntroDollar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntroDollar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://different/", name = "introDollar")
    public JAXBElement<IntroDollar> createIntroDollar(IntroDollar value) {
        return new JAXBElement<IntroDollar>(_IntroDollar_QNAME, IntroDollar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntroDollarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://different/", name = "introDollarResponse")
    public JAXBElement<IntroDollarResponse> createIntroDollarResponse(IntroDollarResponse value) {
        return new JAXBElement<IntroDollarResponse>(_IntroDollarResponse_QNAME, IntroDollarResponse.class, null, value);
    }

}
