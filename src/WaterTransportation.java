import java.util.Date;
public class WaterTransportation extends Transportation {
    public WaterTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int numPassengers, String location, Date reservationTime){
        super("Water", transportationName, cost, averageSpeed, purchaseType,
                numPassengers,location, reservationTime);
    }
    public WaterTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int numPassengers, String location){
        super("Water", transportationName, cost, averageSpeed, purchaseType, numPassengers,
                location);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}

