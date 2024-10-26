import java.util.Date;

/**
 * Represents a Boat object, extends WaterTransportation.
 */
public class Boat extends WaterTransportation {
    /**
     * Initializes a boat object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max passengers
     * @param reservationTime Date; time of reservation
     */
    //Polymorphism is used in the constructors when different values are given
    public Boat(double cost, double averageSpeed, String purchaseType,
                int maxPassengers, Date reservationTime){
        super("Boat", cost, averageSpeed, purchaseType, maxPassengers, reservationTime);
    }

    /**
     * Initializes a boat object, provides data for transportationName.
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max passengers
     */
    public Boat(double cost, double averageSpeed, String purchaseType, int maxPassengers){
        super("Boat", cost, averageSpeed, purchaseType, maxPassengers);
    }

    /**
     * Provides a table format for Boat.
     * @return String; a table format
     */
    public String tableFormat() {return super.tableFormat();}

    /**
     * Provides a String representation for Boat.
     * @return String
     */
    @Override
    public String toString() {return super.toString();}
}
