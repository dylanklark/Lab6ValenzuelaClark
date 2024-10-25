import java.util.Date;

public class Boat extends WaterTransportation {
    public Boat(double cost, double averageSpeed, String purchaseType,
                int numPassengers, Date reservationTime){
        super("Boat", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
    public Boat(double cost, double averageSpeed, String purchaseType, int numPassengers){
        super("Boat", cost, averageSpeed, purchaseType, numPassengers);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}

