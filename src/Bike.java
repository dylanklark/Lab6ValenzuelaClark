import java.util.Date;
public class Bike extends LandTransportation {
    public Bike(double cost, double averageSpeed, String purchaseType,
                 int numPassengers, Date reservationTime){
        super("Bike", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }
    public Bike(double cost, double averageSpeed, String purchaseType, int numPassengers){
        super("Bike", cost, averageSpeed, purchaseType, numPassengers);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}
