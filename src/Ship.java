import java.util.Date;

/**
 * Represents a ship, extends WaterTransportation.
 */
public class Ship extends WaterTransportation {
    /**
     * Initializes a Ship object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether pruchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; time of reservation
     */
    public Ship(double cost, double averageSpeed,
                String purchaseType, int maxPassengers, Date reservationTime) {
        super("Plane", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes a Ship object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether pruchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public Ship(double cost, double averageSpeed, String purchaseType, int maxPassengers) {
        super("Plane", cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Provides a table format for Ship.
     * @return String; a table format
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Provides a string representation for Ship.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
