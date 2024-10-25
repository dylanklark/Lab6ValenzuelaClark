import java.util.Date;

public class Automobile extends LandTransportation {

    public Automobile(String transportationName, double cost, double averageSpeed,
                     String purchaseType, int numPassengers, Date reservationTime) {
        super("Automobile", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }

    public Automobile(double cost, double averageSpeed, String purchaseType, int numPassengers) {
        super("Automobile", cost, averageSpeed, purchaseType, numPassengers);
    }

    public Automobile(String bus, double cost, double averageSpeed, String purchaseType, int numPassengers) {
        super(bus, cost, averageSpeed, purchaseType, numPassengers);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
