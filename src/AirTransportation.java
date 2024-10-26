import java.util.Date;

/**
 * A class representing air transportation (planes, helicopters, etc). Extends the Transportation
 * class and contains no private variables of its own.
 */
public class AirTransportation extends Transportation {

    /**
     * Initializes an AirTransportation object, calls super from Transportation and provides data for
     * transportationType and location.
     * @param transportationName String; the name
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether puchase is a rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; the date of reservation
     */
    //Polymorphism is used in the constructors when different values are given
    public AirTransportation(String transportationName, double cost, double averageSpeed,
                             String purchaseType, int maxPassengers, Date reservationTime) {
        super("Air", transportationName, cost, averageSpeed, purchaseType,
                maxPassengers, "37.87874° N, 78.89665° W", reservationTime);
    }

    /**
     * Initializes an AirTransportation object, calls super from Transportation and provides data for
     * transportationType and location.
     * @param transportationName String; the name
     * @param cost double; the cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is a rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public AirTransportation(String transportationName,double cost, double averageSpeed,
                             String purchaseType, int maxPassengers) {
        super("Air", transportationName, cost, averageSpeed, purchaseType, maxPassengers,
                "37.87874° N, 78.89665° W");
    }

    /**
     * A table format, utilizes the superclass Transportation's tableFormat method.
     * @return String of AirTransportation in a table format.
     */
    public String tableFormat() {
        return super.tableFormat();
    }

    /**
     * Provides a String representation of the AirTransportation class.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
