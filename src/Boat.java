import java.util.Date;

public class Boat extends WaterTransportation {
    public Boat(double cost, double averageSpeed, String purchaseType,
                int numPassengers, String location, Date reservationTime){
        super("Boat", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }
    public Boat(double cost, double averageSpeed, String purchaseType, int numPassengers, String location){
        super("Boat", cost, averageSpeed, purchaseType, numPassengers, location);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}
