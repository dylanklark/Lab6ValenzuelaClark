import java.util.Date;

/**
 * Represents a dirigible object. Extends AirTransportation with no private variables.
 */
public class Dirigible extends AirTransportation {

    /**
     * Initializes a Dirigible oject. Calls super from AirTransportation and provides data for the
     * transportationName.
     *
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; time of reservation
     */
    public Dirigible(double cost, double averageSpeed,
                     String purchaseType, int maxPassengers, Date reservationTime) {
        super("Dirigible", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes a Dirigible oject. Calls super from AirTransportation and provides data for the
     * transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers Date; time of reservation
     */
    public Dirigible(double cost, int averageSpeed, String purchaseType, int maxPassengers) {
        super("Dirigible", cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Initializes a Dirigible object, calls super providing no data, allows hotAirBalloon to set transportationName.
     * @param hotAirBalloon String; name of transportation
     * @param cost double; the cost
     * @param averageSpeed double; the average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public Dirigible(String hotAirBalloon, double cost, double averageSpeed, String purchaseType, int maxPassengers) {
        super(hotAirBalloon, cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Creates a table format of Dirigible object. Utilizes the superclass  (AirTransportation) implimentation of
     * tableFormat.
     * @return String; Dirigible in table format.
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Privides a String representation of Drigible.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
