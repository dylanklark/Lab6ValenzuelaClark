import java.util.Date;

public class HotAirBalloon extends Dirigible {

    public HotAirBalloon(double cost, double averageSpeed,
                         String purchaseType, int numPassengers, String location, Date reservationTime) {
        super("Hot Air Balloon", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }

    public HotAirBalloon(double cost, double averageSpeed, String purchaseType, int numPassengers, String location) {
        super("Hot Air Balloon", cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
