import java.util.Date;

/**
 * Represents an automobile, extends LandTransportation with no private variables.
 */
public class Automobile extends LandTransportation {

    /**
     * Initializes and Automobile object. Provides data for transportationName.
     *
     * @param bus
     * @param cost            double; the cost
     * @param averageSpeed    double; average speed
     * @param purchaseType    String; whether purchase is rental or ticket
     * @param maxPassengers   int; max number of passengers
     * @param reservationTime Date; time of reservation
     */
    //Polymorphism is used in the constructors when different values are given
    public Automobile(String bus, double cost, double averageSpeed,
                      String purchaseType, int maxPassengers, Date reservationTime) {
        super("Automobile", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes an Automobile object. Provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether the purchase is a rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public Automobile(double cost, double averageSpeed, String purchaseType, int maxPassengers) {
        super("Automobile", cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Initializes an Automobile object.
     * @param bus String; corresponds to transportationName
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public Automobile(String bus, double cost, double averageSpeed, String purchaseType, int maxPassengers) {
        super(bus, cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Provides a table format for Automobile.
     * @return String; a table format
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Provides a String representation for Automobile.
     * @return String.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
