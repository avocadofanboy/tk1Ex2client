
package booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flightModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="day1" type="{http://Booking/}daySchedule" minOccurs="0"/>
 *         &lt;element name="day2" type="{http://Booking/}daySchedule" minOccurs="0"/>
 *         &lt;element name="day3" type="{http://Booking/}daySchedule" minOccurs="0"/>
 *         &lt;element name="day4" type="{http://Booking/}daySchedule" minOccurs="0"/>
 *         &lt;element name="day5" type="{http://Booking/}daySchedule" minOccurs="0"/>
 *         &lt;element name="day6" type="{http://Booking/}daySchedule" minOccurs="0"/>
 *         &lt;element name="day7" type="{http://Booking/}daySchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightModel", propOrder = {
    "day1",
    "day2",
    "day3",
    "day4",
    "day5",
    "day6",
    "day7"
})
public class FlightModel {

    protected DaySchedule day1;
    protected DaySchedule day2;
    protected DaySchedule day3;
    protected DaySchedule day4;
    protected DaySchedule day5;
    protected DaySchedule day6;
    protected DaySchedule day7;

    /**
     * Gets the value of the day1 property.
     * 
     * @return
     *     possible object is
     *     {@link DaySchedule }
     *     
     */
    public DaySchedule getDay1() {
        return day1;
    }

    /**
     * Sets the value of the day1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaySchedule }
     *     
     */
    public void setDay1(DaySchedule value) {
        this.day1 = value;
    }

    /**
     * Gets the value of the day2 property.
     * 
     * @return
     *     possible object is
     *     {@link DaySchedule }
     *     
     */
    public DaySchedule getDay2() {
        return day2;
    }

    /**
     * Sets the value of the day2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaySchedule }
     *     
     */
    public void setDay2(DaySchedule value) {
        this.day2 = value;
    }

    /**
     * Gets the value of the day3 property.
     * 
     * @return
     *     possible object is
     *     {@link DaySchedule }
     *     
     */
    public DaySchedule getDay3() {
        return day3;
    }

    /**
     * Sets the value of the day3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaySchedule }
     *     
     */
    public void setDay3(DaySchedule value) {
        this.day3 = value;
    }

    /**
     * Gets the value of the day4 property.
     * 
     * @return
     *     possible object is
     *     {@link DaySchedule }
     *     
     */
    public DaySchedule getDay4() {
        return day4;
    }

    /**
     * Sets the value of the day4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaySchedule }
     *     
     */
    public void setDay4(DaySchedule value) {
        this.day4 = value;
    }

    /**
     * Gets the value of the day5 property.
     * 
     * @return
     *     possible object is
     *     {@link DaySchedule }
     *     
     */
    public DaySchedule getDay5() {
        return day5;
    }

    /**
     * Sets the value of the day5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaySchedule }
     *     
     */
    public void setDay5(DaySchedule value) {
        this.day5 = value;
    }

    /**
     * Gets the value of the day6 property.
     * 
     * @return
     *     possible object is
     *     {@link DaySchedule }
     *     
     */
    public DaySchedule getDay6() {
        return day6;
    }

    /**
     * Sets the value of the day6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaySchedule }
     *     
     */
    public void setDay6(DaySchedule value) {
        this.day6 = value;
    }

    /**
     * Gets the value of the day7 property.
     * 
     * @return
     *     possible object is
     *     {@link DaySchedule }
     *     
     */
    public DaySchedule getDay7() {
        return day7;
    }

    /**
     * Sets the value of the day7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaySchedule }
     *     
     */
    public void setDay7(DaySchedule value) {
        this.day7 = value;
    }

}
