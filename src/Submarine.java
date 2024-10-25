import java.util.Date;

public class Submarine extends WaterTransportation {
    public Submarine(double cost, double averageSpeed,
                 String purchaseType, int numPassengers, Date reservationTime) {
        super("Submarine", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
    public Submarine(double cost, double averageSpeed, String purchaseType, int numPassengers) {
        super("Submarine", cost, averageSpeed, purchaseType, numPassengers);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
