import java.util.Date;

public class Helicopter extends AirTransportation {

    public Helicopter(Date departureTime, String transportationType, double cost,
                      double averageSpeed, String purchaseType, int numPassengers) {
        super(departureTime, transportationType, cost, averageSpeed, purchaseType, numPassengers);
    }
}
