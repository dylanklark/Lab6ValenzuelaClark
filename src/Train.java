import java.util.Date;

/**
 * Represents a train, extends LandTransportation.
 */
public class Train extends LandTransportation {
    /**
     * Initializes a Train object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether pruchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; time of reservation
     */
    public Train(double cost, double averageSpeed, String purchaseType,
                 int maxPassengers, Date reservationTime){
        super("Train", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes a Submarine object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether pruchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public Train(double cost, double averageSpeed, String purchaseType, int maxPassengers){
        super("Train", cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Provides a table format for Train.
     * @return String; a table format
     */
    public String tableFormat() {return super.tableFormat();}

    /**
     * Provides a string representation for Train.
     * @return String
     */
    @Override
    public String toString() {return super.toString();}
}
