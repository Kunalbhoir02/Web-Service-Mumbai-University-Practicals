
package addition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addition", propOrder = {
    "a",
    "b"
})
public class Addition {

    protected float a;
    protected float b;

    /**
     * Gets the value of the a property.
     * 
     */
    public float getA() {
        return a;
    }

    /**
     * Sets the value of the a property.
     * 
     */
    public void setA(float value) {
        this.a = value;
    }

    /**
     * Gets the value of the b property.
     * 
     */
    public float getB() {
        return b;
    }

    /**
     * Sets the value of the b property.
     * 
     */
    public void setB(float value) {
        this.b = value;
    }

}
