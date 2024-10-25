import java.util.Date;
public class WaterTransportation extends Transportation {
    public WaterTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int numPassengers, Date reservationTime){
        super("Water", transportationName, cost, averageSpeed, purchaseType,
                numPassengers,"34.66622° N, 79.53591° W", reservationTime);
    }
    public WaterTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int numPassengers){
        super("Water", transportationName, cost, averageSpeed, purchaseType, numPassengers,
                "34.66622° N, 79.53591° W");
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}

