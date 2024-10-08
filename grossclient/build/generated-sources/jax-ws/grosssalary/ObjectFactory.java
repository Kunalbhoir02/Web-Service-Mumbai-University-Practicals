
package grosssalary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the grosssalary package. 
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

    private final static QName _CalculateHRA_QNAME = new QName("http://grosssalary/", "CalculateHRA");
    private final static QName _CalculateGrossResponse_QNAME = new QName("http://grosssalary/", "CalculateGrossResponse");
    private final static QName _CalculateHRAResponse_QNAME = new QName("http://grosssalary/", "CalculateHRAResponse");
    private final static QName _CalculateGross_QNAME = new QName("http://grosssalary/", "CalculateGross");
    private final static QName _CalculateDA_QNAME = new QName("http://grosssalary/", "CalculateDA");
    private final static QName _CalculateDAResponse_QNAME = new QName("http://grosssalary/", "CalculateDAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: grosssalary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateHRAResponse }
     * 
     */
    public CalculateHRAResponse createCalculateHRAResponse() {
        return new CalculateHRAResponse();
    }

    /**
     * Create an instance of {@link CalculateGrossResponse }
     * 
     */
    public CalculateGrossResponse createCalculateGrossResponse() {
        return new CalculateGrossResponse();
    }

    /**
     * Create an instance of {@link CalculateHRA }
     * 
     */
    public CalculateHRA createCalculateHRA() {
        return new CalculateHRA();
    }

    /**
     * Create an instance of {@link CalculateDA }
     * 
     */
    public CalculateDA createCalculateDA() {
        return new CalculateDA();
    }

    /**
     * Create an instance of {@link CalculateGross }
     * 
     */
    public CalculateGross createCalculateGross() {
        return new CalculateGross();
    }

    /**
     * Create an instance of {@link CalculateDAResponse }
     * 
     */
    public CalculateDAResponse createCalculateDAResponse() {
        return new CalculateDAResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateHRA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grosssalary/", name = "CalculateHRA")
    public JAXBElement<CalculateHRA> createCalculateHRA(CalculateHRA value) {
        return new JAXBElement<CalculateHRA>(_CalculateHRA_QNAME, CalculateHRA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateGrossResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grosssalary/", name = "CalculateGrossResponse")
    public JAXBElement<CalculateGrossResponse> createCalculateGrossResponse(CalculateGrossResponse value) {
        return new JAXBElement<CalculateGrossResponse>(_CalculateGrossResponse_QNAME, CalculateGrossResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateHRAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grosssalary/", name = "CalculateHRAResponse")
    public JAXBElement<CalculateHRAResponse> createCalculateHRAResponse(CalculateHRAResponse value) {
        return new JAXBElement<CalculateHRAResponse>(_CalculateHRAResponse_QNAME, CalculateHRAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateGross }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grosssalary/", name = "CalculateGross")
    public JAXBElement<CalculateGross> createCalculateGross(CalculateGross value) {
        return new JAXBElement<CalculateGross>(_CalculateGross_QNAME, CalculateGross.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grosssalary/", name = "CalculateDA")
    public JAXBElement<CalculateDA> createCalculateDA(CalculateDA value) {
        return new JAXBElement<CalculateDA>(_CalculateDA_QNAME, CalculateDA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateDAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://grosssalary/", name = "CalculateDAResponse")
    public JAXBElement<CalculateDAResponse> createCalculateDAResponse(CalculateDAResponse value) {
        return new JAXBElement<CalculateDAResponse>(_CalculateDAResponse_QNAME, CalculateDAResponse.class, null, value);
    }

}
