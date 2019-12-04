
package booking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plane complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plane">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seats">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://Booking/}seatArray" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstClassBasePriceInCents" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="economyClassBasePriceInCents" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="economyPlusClassBasePriceInCents" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plane", propOrder = {
    "seats"
})
public class Plane {

    @XmlElement(required = true)
    protected Plane.Seats seats;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "firstClassBasePriceInCents", required = true)
    protected int firstClassBasePriceInCents;
    @XmlAttribute(name = "economyClassBasePriceInCents", required = true)
    protected int economyClassBasePriceInCents;
    @XmlAttribute(name = "economyPlusClassBasePriceInCents", required = true)
    protected int economyPlusClassBasePriceInCents;

    /**
     * Gets the value of the seats property.
     * 
     * @return
     *     possible object is
     *     {@link Plane.Seats }
     *     
     */
    public Plane.Seats getSeats() {
        return seats;
    }

    /**
     * Sets the value of the seats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plane.Seats }
     *     
     */
    public void setSeats(Plane.Seats value) {
        this.seats = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the firstClassBasePriceInCents property.
     * 
     */
    public int getFirstClassBasePriceInCents() {
        return firstClassBasePriceInCents;
    }

    /**
     * Sets the value of the firstClassBasePriceInCents property.
     * 
     */
    public void setFirstClassBasePriceInCents(int value) {
        this.firstClassBasePriceInCents = value;
    }

    /**
     * Gets the value of the economyClassBasePriceInCents property.
     * 
     */
    public int getEconomyClassBasePriceInCents() {
        return economyClassBasePriceInCents;
    }

    /**
     * Sets the value of the economyClassBasePriceInCents property.
     * 
     */
    public void setEconomyClassBasePriceInCents(int value) {
        this.economyClassBasePriceInCents = value;
    }

    /**
     * Gets the value of the economyPlusClassBasePriceInCents property.
     * 
     */
    public int getEconomyPlusClassBasePriceInCents() {
        return economyPlusClassBasePriceInCents;
    }

    /**
     * Sets the value of the economyPlusClassBasePriceInCents property.
     * 
     */
    public void setEconomyPlusClassBasePriceInCents(int value) {
        this.economyPlusClassBasePriceInCents = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://Booking/}seatArray" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class Seats {

        protected List<Plane.Seats.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Plane.Seats.Entry }
         * 
         * 
         */
        public List<Plane.Seats.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<Plane.Seats.Entry>();
            }
            return this.entry;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://Booking/}seatArray" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected SeatArray value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link SeatArray }
             *     
             */
            public SeatArray getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link SeatArray }
             *     
             */
            public void setValue(SeatArray value) {
                this.value = value;
            }

        }

    }

}
