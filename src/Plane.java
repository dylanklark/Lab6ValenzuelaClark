import java.util.Date;

/**
 * Represents a plane object, extends AirTransportation with no private variables.
 */
public class Plane extends AirTransportation {

    /**
     * Initializes a Plane object, provides data "Plane" for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; time of reservation
     */
    public Plane(double cost, double averageSpeed,
                 String purchaseType, int maxPassengers, Date reservationTime) {
        super("Plane", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes a Plane object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public Plane(double cost, double averageSpeed, String purchaseType, int maxPassengers) {
        super("Plane", cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Provides a table format for Plane, utilizes superclass implimentation.
     * @return String; a table format
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Provdes a String representation for Plane.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
