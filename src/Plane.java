import java.util.Date;

public class Plane extends AirTransportation {

    public Plane(Date departureTime, String transportationType, double cost, double averageSpeed,
                 String purchaseType, int numPassengers) {
        super(departureTime, transportationType, cost, averageSpeed, purchaseType, numPassengers);
    }
}
