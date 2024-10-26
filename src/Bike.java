import java.util.Date;

/**
 * Represents a Bike object, extends LandTransportation with no private variables.
 */
public class Bike extends LandTransportation {
    /**
     * Initializes a Bike object, provides data for TransportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param numPassengers int; max number of passengers
     * @param reservationTime Date; time of the reservation
     */
    //Polymorphism is used in the constructors when different values are given
    public Bike(double cost, double averageSpeed, String purchaseType,
                 int numPassengers, Date reservationTime){
        super("Bike", cost, averageSpeed, purchaseType, numPassengers, reservationTime);
    }

    /**
     * Initializes a Bike object, provides data for TransportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param numPassengers int; max number of passengers
     */
    public Bike(double cost, double averageSpeed, String purchaseType, int numPassengers){
        super("Bike", cost, averageSpeed, purchaseType, numPassengers);
    }

    /**
     * Provides a table format for Bike.
     * @return String; a table format.
     */
    public String tableFormat() {return super.tableFormat();}

    /**
     * Provides a String representation for Bike.
     * @return String
     */
    @Override
    public String toString() {return super.toString();}
}
