import java.util.Date;
public class Train extends LandTransportation {
    public Train(double cost, double averageSpeed, String purchaseType,
                 int numPassengers, Date reservationTime){
        super("Train", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
    public Train(double cost, double averageSpeed, String purchaseType, int numPassengers){
        super("Train", cost, averageSpeed, purchaseType, numPassengers);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}
