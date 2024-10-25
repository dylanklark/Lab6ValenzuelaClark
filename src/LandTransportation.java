import java.util.Date;
public class LandTransportation extends Transportation {

    public LandTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int numPassengers, String location, Date reservationTime){
        super("Land", transportationName, cost, averageSpeed, purchaseType,
                numPassengers, location, reservationTime);
    }

    public LandTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int numPassengers, String location){
        super("Land", transportationName, cost, averageSpeed, purchaseType, numPassengers,
                location);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}
