import java.util.Date;

/**
 * A class representing air transportation (planes, helicopters, etc)
 */
public class AirTransportation extends Transportation {

    /**
     * Initializes the AirTransportation class.
     */
    public AirTransportation(String transportationName, double cost, double averageSpeed,
                             String purchaseType, int numPassengers, String location, Date reservationTime) {
        super("Air", transportationName, cost, averageSpeed, purchaseType,
                numPassengers, location, reservationTime);
    }

    public AirTransportation(String transportationName,double cost, double averageSpeed,
                             String purchaseType, int numPassengers, String location) {
        super("Air", transportationName, cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
