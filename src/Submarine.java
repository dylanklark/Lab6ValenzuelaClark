import java.util.Date;

/**
 * Represents a submarine, extends WaterTransportation.
 */
public class Submarine extends WaterTransportation {
    /**
     * Initializes a Submarine object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether pruchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; time of reservation
     */
    public Submarine(double cost, double averageSpeed,
                     String purchaseType, int maxPassengers, Date reservationTime) {
        super("Submarine", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes a Submarine object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether pruchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public Submarine(double cost, double averageSpeed, String purchaseType, int maxPassengers) {
        super("Submarine", cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Provides a table format for Submarine.
     * @return String; a table format
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Provides a string representation of Submarine.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
