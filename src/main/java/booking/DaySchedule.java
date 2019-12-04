
package booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for daySchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="daySchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flight1" type="{http://Booking/}flight" minOccurs="0"/>
 *         &lt;element name="flight2" type="{http://Booking/}flight" minOccurs="0"/>
 *         &lt;element name="flight3" type="{http://Booking/}flight" minOccurs="0"/>
 *         &lt;element name="flight4" type="{http://Booking/}flight" minOccurs="0"/>
 *         &lt;element name="flight5" type="{http://Booking/}flight" minOccurs="0"/>
 *         &lt;element name="flight6" type="{http://Booking/}flight" minOccurs="0"/>
 *         &lt;element name="flight7" type="{http://Booking/}flight" minOccurs="0"/>
 *         &lt;element name="flight8" type="{http://Booking/}flight" minOccurs="0"/>
 *         &lt;element name="flight9" type="{http://Booking/}flight" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "daySchedule", propOrder = {
    "flight1",
    "flight2",
    "flight3",
    "flight4",
    "flight5",
    "flight6",
    "flight7",
    "flight8",
    "flight9"
})
public class DaySchedule {

    protected Flight flight1;
    protected Flight flight2;
    protected Flight flight3;
    protected Flight flight4;
    protected Flight flight5;
    protected Flight flight6;
    protected Flight flight7;
    protected Flight flight8;
    protected Flight flight9;
    @XmlAttribute(name = "date")
    protected String date;

    /**
     * Gets the value of the flight1 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight1() {
        return flight1;
    }

    /**
     * Sets the value of the flight1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight1(Flight value) {
        this.flight1 = value;
    }

    /**
     * Gets the value of the flight2 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight2() {
        return flight2;
    }

    /**
     * Sets the value of the flight2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight2(Flight value) {
        this.flight2 = value;
    }

    /**
     * Gets the value of the flight3 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight3() {
        return flight3;
    }

    /**
     * Sets the value of the flight3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight3(Flight value) {
        this.flight3 = value;
    }

    /**
     * Gets the value of the flight4 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight4() {
        return flight4;
    }

    /**
     * Sets the value of the flight4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight4(Flight value) {
        this.flight4 = value;
    }

    /**
     * Gets the value of the flight5 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight5() {
        return flight5;
    }

    /**
     * Sets the value of the flight5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight5(Flight value) {
        this.flight5 = value;
    }

    /**
     * Gets the value of the flight6 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight6() {
        return flight6;
    }

    /**
     * Sets the value of the flight6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight6(Flight value) {
        this.flight6 = value;
    }

    /**
     * Gets the value of the flight7 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight7() {
        return flight7;
    }

    /**
     * Sets the value of the flight7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight7(Flight value) {
        this.flight7 = value;
    }

    /**
     * Gets the value of the flight8 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight8() {
        return flight8;
    }

    /**
     * Sets the value of the flight8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight8(Flight value) {
        this.flight8 = value;
    }

    /**
     * Gets the value of the flight9 property.
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight9() {
        return flight9;
    }

    /**
     * Sets the value of the flight9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight9(Flight value) {
        this.flight9 = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

}
