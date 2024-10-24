import java.util.Date;

public class WaterTransportation extends Transportation{

    public WaterTransportation(Date departureTime, String transportationType, double cost, double averageSpeed,
                               String purchaseType, int numPassengers) {
        super(departureTime, transportationType, cost, averageSpeed, purchaseType, numPassengers);
    }
}
