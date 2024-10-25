import java.util.Date;
public class LandTransportation extends Transportation {

    public LandTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int numPassengers, Date reservationTime){
        super("Land", transportationName, cost, averageSpeed, purchaseType,
                numPassengers, reservationTime);
    }

    public LandTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int numPassengers){
        super("Land", transportationName, cost, averageSpeed, purchaseType, numPassengers);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}
