import java.util.Date;

/**
 * Rrepresents water transportation, extends Transportation.
 */
public class WaterTransportation extends Transportation {
    /**
     * Initializes a WaterTransportation obkect, provides data for transportationName and location.
     * @param transportationName String; name of the transportation
     * @param cost double; cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     * @param reservationTime Date; time of reservation
     */
    //Polymorphism is used in the constructors when different values are given
    public WaterTransportation(String transportationName, double cost, double averageSpeed,
                               String purchaseType, int maxPassengers, Date reservationTime){
        super("Water", transportationName, cost, averageSpeed, purchaseType,
                maxPassengers,"34.66622° N, 79.53591° W", reservationTime);
    }

    /**
     * Initializes a WaterTransportation obkect, provides data for transportationName and location.
     * @param transportationName String; name of the transportation
     * @param cost double; cost
     * @param averageSpeed double; average speed
     * @param purchaseType String; whether purchase is rental or ticket
     * @param maxPassengers int; max number of passengers
     */
    public WaterTransportation(String transportationName, double cost, double averageSpeed,
                              String purchaseType, int maxPassengers){
        super("Water", transportationName, cost, averageSpeed, purchaseType, maxPassengers,
                "34.66622° N, 79.53591° W");
    }

    /**
     * Provides a table format for WaterTransportation.
     * @return String
     */
    public String tableFormat() {return super.tableFormat();}

    /**
     * Provides a String representation for WaterTransportation.
     * @return String
     */
    @Override
    public String toString() {return super.toString();}
}

