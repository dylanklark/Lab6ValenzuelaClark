import java.util.Date;

public class Ship extends WaterTransportation{

    public Ship(String transportationType, double cost, double averageSpeed,
                               String purchaseType, int numPassengers, Date reservationTime) {
        super(transportationType, cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
}
