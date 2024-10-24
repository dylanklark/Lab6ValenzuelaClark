import java.util.Date;

public class Helicopter extends AirTransportation {

    public Helicopter(double cost, double averageSpeed, String purchaseType,
                      int numPassengers, Date reservationTime) {
        super("Helicopter", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }

    public Helicopter(int cost, int averageSpeed, String purchaseType, int numPassengers) {
        super("Helicopter", cost, averageSpeed, purchaseType, numPassengers);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
