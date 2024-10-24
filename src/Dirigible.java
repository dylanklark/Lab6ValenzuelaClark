import java.util.Date;

public class Dirigible extends AirTransportation {

    public Dirigible(String hotAirBaloon, double cost, double averageSpeed,
                     String purchaseType, int numPassengers, Date reservationTime) {
        super("Dirigible", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }

    public Dirigible(int cost, int averageSpeed, String purchaseType, int numPassengers) {
        super("Dirigible", cost, averageSpeed, purchaseType, numPassengers);
    }

    public Dirigible(String hotAirBaloon, int cost, int averageSpeed, String purchaseType, int numPassengers) {
        super(hotAirBaloon, cost, averageSpeed, purchaseType, numPassengers);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
