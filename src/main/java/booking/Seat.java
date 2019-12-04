
package booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="booking" type="{http://Booking/}booking" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="seatType" type="{http://Booking/}seatType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seat", propOrder = {
    "booking"
})
public class Seat {

    protected Booking booking;
    @XmlAttribute(name = "seatType")
    protected SeatType seatType;

    /**
     * Gets the value of the booking property.
     * 
     * @return
     *     possible object is
     *     {@link Booking }
     *     
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking }
     *     
     */
    public void setBooking(Booking value) {
        this.booking = value;
    }

    /**
     * Gets the value of the seatType property.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeatType() {
        return seatType;
    }

    /**
     * Sets the value of the seatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     */
    public void setSeatType(SeatType value) {
        this.seatType = value;
    }

}
