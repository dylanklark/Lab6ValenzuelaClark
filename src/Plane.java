import java.util.Date;

public class Plane extends AirTransportation {

    public Plane(String transportationType, double cost, double averageSpeed,
                 String purchaseType, int numPassengers, Date reservationTime) {
        super(transportationType, cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
}
