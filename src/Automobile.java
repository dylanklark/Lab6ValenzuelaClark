import java.util.Date;

public class Automobile extends LandTransportation {

    public Automobile(String transportationName, double cost, double averageSpeed,
                     String purchaseType, int numPassengers, String location, Date reservationTime) {
        super("Automobile", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }

    public Automobile(double cost, double averageSpeed, String purchaseType, int numPassengers, String location) {
        super("Automobile", cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public Automobile(String bus, double cost, double averageSpeed, String purchaseType, int numPassengers, String location) {
        super(bus, cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
