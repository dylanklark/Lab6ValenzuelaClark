import java.util.Date;

public class Helicopter extends AirTransportation {

    public Helicopter(String transportationType, double cost,
                      double averageSpeed, String purchaseType, int numPassengers, Date reservationTime) {
        super(transportationType, cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
}
