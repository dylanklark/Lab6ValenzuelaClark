import java.util.Date;

/**
 * A class representing air transportation (planes, helicopters, etc)
 */
public class AirTransportation extends Transportation {

    /**
     * Initializes the AirTransportation class.
     */
    public AirTransportation(String transportationType, double cost, double averageSpeed,
                             String purchaseType, int numPassengers, Date reservationTime) {
        super(transportationType, cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
}
