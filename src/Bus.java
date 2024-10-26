import java.util.Date;

/**
 * Represents a Bus object, extends Automobile.
 */
public class Bus extends Automobile {

    /**
     * Initializes a Bus object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max passengers
     * @param reservationTime Date; time of reservation
     */
    public Bus(double cost, double averageSpeed,
               String purchaseType, int maxPassengers, Date reservationTime) {
        super("Bus", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes a boat object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max passengers
     */
    public Bus(double cost, double averageSpeed, String purchaseType, int maxPassengers) {
        super("Bus", cost, averageSpeed, purchaseType, maxPassengers);    }

    /**
     * Provides a table format for Bus.
     * @return String; a table format
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Provides a String representatino for Bus.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
