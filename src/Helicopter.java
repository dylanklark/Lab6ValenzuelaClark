import java.util.Date;

public class Helicopter extends AirTransportation {

    public Helicopter(double cost, double averageSpeed, String purchaseType,
                      int numPassengers, String location, Date reservationTime) {
        super("Helicopter", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }

    public Helicopter(double cost, double averageSpeed, String purchaseType, int numPassengers, String location) {
        super("Helicopter", cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
