import java.util.Date;

public class Automobile extends LandTransportation {

    public Automobile(String Bus, double cost, double averageSpeed,
                     String purchaseType, int numPassengers, Date reservationTime) {
        super("Automobile", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }

    public Automobile(int cost, int averageSpeed, String purchaseType, int numPassengers) {
        super("Automobile", cost, averageSpeed, purchaseType, numPassengers);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
