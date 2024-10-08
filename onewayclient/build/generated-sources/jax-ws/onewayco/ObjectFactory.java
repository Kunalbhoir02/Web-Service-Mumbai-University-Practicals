
package onewayco;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the onewayco package. 
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

    private final static QName _GetnameResponse_QNAME = new QName("http://onewayco/", "getnameResponse");
    private final static QName _Getname_QNAME = new QName("http://onewayco/", "getname");
    private final static QName _InsertResponse_QNAME = new QName("http://onewayco/", "insertResponse");
    private final static QName _Insert_QNAME = new QName("http://onewayco/", "insert");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: onewayco
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetnameResponse }
     * 
     */
    public GetnameResponse createGetnameResponse() {
        return new GetnameResponse();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link Getname }
     * 
     */
    public Getname createGetname() {
        return new Getname();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetnameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onewayco/", name = "getnameResponse")
    public JAXBElement<GetnameResponse> createGetnameResponse(GetnameResponse value) {
        return new JAXBElement<GetnameResponse>(_GetnameResponse_QNAME, GetnameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getname }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onewayco/", name = "getname")
    public JAXBElement<Getname> createGetname(Getname value) {
        return new JAXBElement<Getname>(_Getname_QNAME, Getname.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onewayco/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://onewayco/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

}
