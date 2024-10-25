import java.util.Date;

public class Plane extends AirTransportation {

    public Plane(double cost, double averageSpeed,
                 String purchaseType, int numPassengers, Date reservationTime) {
        super("Plane", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
    public Plane(double cost, double averageSpeed, String purchaseType, int numPassengers) {
        super("Plane", cost, averageSpeed, purchaseType, numPassengers);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
