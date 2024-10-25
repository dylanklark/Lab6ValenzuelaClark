import java.util.Date;

public class Dirigible extends AirTransportation {

    public Dirigible(String hotAirBaloon, double cost, double averageSpeed,
                     String purchaseType, int numPassengers, String location, Date reservationTime) {
        super("Dirigible", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }

    public Dirigible(double cost, int averageSpeed, String purchaseType, int numPassengers, String location) {
        super("Dirigible", cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public Dirigible(String hotAirBaloon, double cost, double averageSpeed, String purchaseType, int numPassengers,
                     String location) {
        super(hotAirBaloon, cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
