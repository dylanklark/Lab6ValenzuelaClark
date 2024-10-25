import java.util.Date;
public class Bike extends LandTransportation {
    public Bike(double cost, double averageSpeed, String purchaseType,
                 int numPassengers, String location, Date reservationTime){
        super("Bike", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }
    public Bike(double cost, double averageSpeed, String purchaseType, int numPassengers, String location){
        super("Bike", cost, averageSpeed, purchaseType, numPassengers, location);
    }
    public String tableFormat() {return super.tableFormat();}
    @Override
    public String toString() {return super.toString();}
}
