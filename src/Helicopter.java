import java.util.Date;

/**
 * Represents a helicopter, extends AirTransportation with no private variables.
 */
public class Helicopter extends AirTransportation {

    /**
     * Initializes a Helicopter object. Provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; wheter purchase is rental or ticket
     * @param maxPassengers int; max number of passengers.
     * @param reservationTime Date; time of reservation
     */
    public Helicopter(double cost, double averageSpeed, String purchaseType,
                      int maxPassengers, Date reservationTime) {
        super("Helicopter", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes a Helicopter object. Provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param numPassengers int; max number of passengers
     */
    public Helicopter(double cost, double averageSpeed, String purchaseType, int numPassengers) {
        super("Helicopter", cost, averageSpeed, purchaseType, numPassengers);
    }

    /**
     * Provides the table format for Helicopter. Utilizes superclass' implimentation.
     * @return String; a table format
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Provides a string representation of Helicopter.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
