
package grosssalary;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalculateGross complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalculateGross">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Salary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="HRA" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateGross", propOrder = {
    "salary",
    "da",
    "hra"
})
public class CalculateGross {

    @XmlElement(name = "Salary")
    protected int salary;
    @XmlElement(name = "DA")
    protected double da;
    @XmlElement(name = "HRA")
    protected double hra;

    /**
     * Gets the value of the salary property.
     * 
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     */
    public void setSalary(int value) {
        this.salary = value;
    }

    /**
     * Gets the value of the da property.
     * 
     */
    public double getDA() {
        return da;
    }

    /**
     * Sets the value of the da property.
     * 
     */
    public void setDA(double value) {
        this.da = value;
    }

    /**
     * Gets the value of the hra property.
     * 
     */
    public double getHRA() {
        return hra;
    }

    /**
     * Sets the value of the hra property.
     * 
     */
    public void setHRA(double value) {
        this.hra = value;
    }

}
