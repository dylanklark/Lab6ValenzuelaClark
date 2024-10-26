import java.util.Date;

/**
 * Represents land transportation, extendes Transportation.
 */
public class LandTransportation extends Transportation {

    /**
     * Initializes LandTransportation, provides data for transportationType and location.
     * @param transportationName String; name of the transportation
     * @param cost double; cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; time of reservation
     */
    public LandTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int maxPassengers, Date reservationTime){
        super("Land", transportationName, cost, averageSpeed, purchaseType,
                maxPassengers, "38.57157° N, 80.71940° W", reservationTime);
    }

    /**
     * Initializes LandTransportation, provides data for transportationType and location.
     * @param transportationName String; name of the transportation
     * @param cost double; cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public LandTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int maxPassengers){
        super("Land", transportationName, cost, averageSpeed, purchaseType, maxPassengers,
                "38.57157° N, 80.71940° W");
    }

    /**
     * Provides a table forat for LandTransportation.
     * @return String; a table format.
     */
    public String tableFormat() {return super.tableFormat();}

    /**
     * Provides a String representation for LandTransportation.
     * @return String
     */
    @Override
    public String toString() {return super.toString();}
}
