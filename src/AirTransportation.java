import java.util.Date;

/**
 * A class representing air transportation (planes, helicopters, etc)
 */
public class AirTransportation extends Transportation {

    /**
     * Initializes the AirTransportation class.
     */
    public AirTransportation(String transportationName, double cost, double averageSpeed,
                             String purchaseType, int numPassengers, Date reservationTime) {
        super("Air", transportationName, cost, averageSpeed, purchaseType,
                numPassengers, reservationTime);
    }

    public AirTransportation(String transportationName,double cost, double averageSpeed,
                             String purchaseType, int numPassengers) {
        super("Air", transportationName, cost, averageSpeed, purchaseType, numPassengers);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
