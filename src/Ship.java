import java.util.Date;

public class Ship extends WaterTransportation {
    public Ship(double cost, double averageSpeed,
                 String purchaseType, int numPassengers, Date reservationTime) {
        super("Plane", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
    public Ship(double cost, double averageSpeed, String purchaseType, int numPassengers) {
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
