import java.util.Date;

public class Submarine extends WaterTransportation {
    public Submarine(double cost, double averageSpeed,
                 String purchaseType, int numPassengers, String location, Date reservationTime) {
        super("Submarine", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }
    public Submarine(double cost, double averageSpeed, String purchaseType, int numPassengers, String location) {
        super("Submarine", cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
