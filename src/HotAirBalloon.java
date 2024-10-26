import java.util.Date;

/**
 * Represents a typical hot air balloon, extends Dirigible with no private variables.
 */
public class HotAirBalloon extends Dirigible {

    /**
     * Initializes a HotairBalloon object.
     * @param cost double; cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; the time of reservation.
     */
    //Polymorphism is used in the constructors when different values are given
    public HotAirBalloon(double cost, double averageSpeed,
                         String purchaseType, int maxPassengers, Date reservationTime) {
        super(cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializs a HotAirBaloon. Provides data for "hotAirBalloon" attribute which corresponds to
     * transportationName of AirTransportation.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public HotAirBalloon(double cost, double averageSpeed, String purchaseType, int maxPassengers) {
        super("Hot Air Balloon", cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Provides a table format for HotAirBalloon, calls the super implimentation from Dirigible.
     * @return String; a table format.
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Provides a String representation of HotAirBalloon.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
