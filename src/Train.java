import java.util.Date;
public class Train extends LandTransportation {
    public Train(double cost, double averageSpeed, String purchaseType,
                 int numPassengers, String location, Date reservationTime){
        super("Train", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }
    public Train(double cost, double averageSpeed, String purchaseType, int numPassengers, String location){
        super("Train", cost, averageSpeed, purchaseType, numPassengers, location);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}
