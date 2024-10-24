import java.util.Date;

public class HotAirBaloon extends Dirgible{

    public HotAirBaloon(String transportationType, double cost, double averageSpeed,
                        String purchaseType, int numPassengers, Date reservationTime) {
        super(transportationType, cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
}
