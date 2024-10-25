import java.util.Date;

public class Bus extends Automobile {

    public Bus(double cost, double averageSpeed,
                         String purchaseType, int numPassengers, Date reservationTime) {
        super("Bus", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }

    public Bus(double cost, double averageSpeed, String purchaseType, int numPassengers) {
        super("Bus", cost, averageSpeed, purchaseType, numPassengers);    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
