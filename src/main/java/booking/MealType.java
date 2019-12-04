
package booking;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mealType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mealType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Vegetarian"/>
 *     &lt;enumeration value="Vegan"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mealType")
@XmlEnum
public enum MealType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Vegetarian")
    VEGETARIAN("Vegetarian"),
    @XmlEnumValue("Vegan")
    VEGAN("Vegan");
    private final String value;

    MealType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MealType fromValue(String v) {
        for (MealType c: MealType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
