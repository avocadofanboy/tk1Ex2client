
package booking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the booking package. 
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

    private final static QName _FlightModel_QNAME = new QName("http://Booking/", "flightModel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: booking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Plane }
     * 
     */
    public Plane createPlane() {
        return new Plane();
    }

    /**
     * Create an instance of {@link Plane.Seats }
     * 
     */
    public Plane.Seats createPlaneSeats() {
        return new Plane.Seats();
    }

    /**
     * Create an instance of {@link FlightModel }
     * 
     */
    public FlightModel createFlightModel() {
        return new FlightModel();
    }

    /**
     * Create an instance of {@link DaySchedule }
     * 
     */
    public DaySchedule createDaySchedule() {
        return new DaySchedule();
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link Destination }
     * 
     */
    public Destination createDestination() {
        return new Destination();
    }

    /**
     * Create an instance of {@link SeatArray }
     * 
     */
    public SeatArray createSeatArray() {
        return new SeatArray();
    }

    /**
     * Create an instance of {@link Plane.Seats.Entry }
     * 
     */
    public Plane.Seats.Entry createPlaneSeatsEntry() {
        return new Plane.Seats.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Booking/", name = "flightModel")
    public JAXBElement<FlightModel> createFlightModel(FlightModel value) {
        return new JAXBElement<FlightModel>(_FlightModel_QNAME, FlightModel.class, null, value);
    }

}
