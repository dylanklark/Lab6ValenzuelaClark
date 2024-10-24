import java.util.Date;

public class WaterTransportation extends Transportation{

    public WaterTransportation(String transportationType, double cost, double averageSpeed,
                               String purchaseType, int numPassengers, Date reservationTime) {
        super(transportationType, cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
}
