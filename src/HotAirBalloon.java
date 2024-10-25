import java.util.Date;

public class HotAirBalloon extends Dirigible {

    public HotAirBalloon(double cost, double averageSpeed,
                         String purchaseType, int numPassengers, Date reservationTime) {
        super("Hot Air Balloon", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }

    public HotAirBalloon(double cost, double averageSpeed, String purchaseType, int numPassengers) {
        super("Hot Air Balloon", cost, averageSpeed, purchaseType, numPassengers);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
