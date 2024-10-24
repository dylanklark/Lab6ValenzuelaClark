import java.util.Date;

public class Dirgible extends AirTransportation {

    public Dirgible(Date departureTime, String transportationType, double cost, double averageSpeed,
                    String purchaseType, int numPassengers) {
        super(departureTime, transportationType, cost, averageSpeed, purchaseType, numPassengers);
    }
}
