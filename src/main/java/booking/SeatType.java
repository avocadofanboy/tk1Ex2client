
package booking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="seatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FirstClass"/>
 *     &lt;enumeration value="EconomyPlusClass"/>
 *     &lt;enumeration value="EconomyClass"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "seatType")
@XmlEnum
public enum SeatType {

    @XmlEnumValue("FirstClass")
    FIRST_CLASS("FirstClass"),
    @XmlEnumValue("EconomyPlusClass")
    ECONOMY_PLUS_CLASS("EconomyPlusClass"),
    @XmlEnumValue("EconomyClass")
    ECONOMY_CLASS("EconomyClass"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    SeatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeatType fromValue(String v) {
        for (SeatType c: SeatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
