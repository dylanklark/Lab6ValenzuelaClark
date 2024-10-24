import java.util.Date;

public class Dirgible extends AirTransportation {

    public Dirgible(String transportationType, double cost, double averageSpeed,
                    String purchaseType, int numPassengers, Date reservationTime) {
        super(transportationType, cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
}
