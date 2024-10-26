import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Top level class in the inheritance. Defines the commonalities of all transportation types.
 * Includes tranportation type, cost, average speed, purchase type, max number of passengers, a pickup/ride
 * location, and a reservation time.
 */
public class Transportation {
    private String transportationType;
    private String transportationName;
    private double cost;
    private double averageSpeed;
    private String purchaseType;
    private int maxPassengers;
    private String location;
    private Date reservationTime;

    /**
     * Constructor for Transportation class.
     * @param transportationType String; the transportation type.
     * @param transportationName String; the name of the transportation.
     * @param cost Double; the cost of the transportation.
     * @param averageSpeed Double; the average speed of the transportation.
     * @param purchaseType String; purchase type (rental or ticket)
     * @param numPassengers Int; the number of passengers the transportation can support.
     * @param location String; the coordinates of the location.
     * @param reservationTime Date; the date and time od the reservation (for either a rental or ticket)
     */
    public Transportation(String transportationType, String transportationName, double cost, double averageSpeed,
                          String purchaseType, int numPassengers, String location, Date reservationTime) {
        this.transportationType = transportationType;
        this.transportationName = transportationName;
        this.cost = cost;
        this.averageSpeed = averageSpeed;
        this.purchaseType = purchaseType;
        this.maxPassengers = numPassengers;
        this.location = location;
        this.reservationTime = reservationTime;
    }

    /**
     * Constructor for the transportation cost, primarily for the tableFormat method.
     * @param transportationType String; the transportation type.
     * @param transportationName String; the name of the transportation.
     * @param cost Double; the cost of the transportation.
     * @param averageSpeed Double; the average speed of the transportation.
     * @param purchaseType String; purchase type (rental or ticket)
     * @param numPassengers Int; the number of passengers the transportation can support.
     */
    public Transportation(String transportationType, String transportationName, double cost, double averageSpeed,
                          String purchaseType, int numPassengers, String location) {
        this.transportationType = transportationType;
        this.transportationName = transportationName;
        this.cost = cost;
        this.averageSpeed = averageSpeed;
        this.purchaseType = purchaseType;
        this.maxPassengers = numPassengers;
        this.location = location;
    }

    // Getters


    /**
     * Gets the transportation type.
     * @return String
     */
    public String getTransportationType() {return transportationType;}

    /**
     * Gets the name of the transportation.
     * @return String
     */
    public String getTransportationName() {return  transportationName;}

    /**
     * Gets the tranportation cost.
     * @return Double
     */
    public double getCost() {return cost;}

    /**
     * Gets the average speed of the transportation.
     * @return Double
     */
    public double getAverageSpeed() {return averageSpeed;}

    /**
     * Gets the purchase type of the transportation.
     * @return String
     */
    public String getPurchaseType() {return purchaseType;}

    /**
     * Gets the number of passengers the tranportation can hold.
     * @return int
     */
    public int getMaxPassengers() {return maxPassengers;}

    /**
     * Gets the location of the transportation rental.
     * @return String; the transportation's location.
     */
    public String getLocation() {return location;}

    /**
     * Gets the reservation time for the transportation, will be at 2pm within 24 hours notce.
     *
     * @return String; the time of the reservation.
     */
    public String getReservationTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance(); // Get the current date and time
        calendar.add(Calendar.DAY_OF_MONTH, 1); // Add one day to the current date
        calendar.set(Calendar.HOUR_OF_DAY, 14); // Set time to 2 PM
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date reservationDate = calendar.getTime();
        return dateFormat.format(reservationDate);}


    // Setters


    /**
     * Sets the transportation type.
     * @param transportationType String; type of transportation (air, water, land)
     */
    public void setTransportationType(String transportationType) {this.transportationType = transportationType;}

    /**
     * Sets the name of the transportation.
     * @param transportationName String; the name of the transportation.
     */
    public void setTransportationName(String transportationName) {this.transportationName = transportationName;}

    /**
     * Sets the cost of the transportation.
     * @param cost int; the transportation's cost.
     */
    public void setCost(int cost) {this.cost = cost;}

    /**
     * Sets the average speed of the transportation.
     * @param averageSpeed; Double; speed of transportation.
     */
    public void setAverageSpeed(double averageSpeed) {this.averageSpeed = averageSpeed;}

    /**
     * Sets the purchase type of the transportation.
     * @param purchaseType String; the purchase type (ticket or rental)
     */
    public void setPurchaseType(String purchaseType) {this.purchaseType = purchaseType;}

    /**
     * Sets the number of passengers the transportation can support.
     * @param maxPassengers int; number of passengers that can be supported.
     */
    public void setMaxPassengers(int maxPassengers) {this.maxPassengers = maxPassengers;}

    /**
     * Sets the location of the transportation.
     * @param location String; the location.
     */
    public void setLocation(String location) {this.location = location;}

    /**
     * Sets the reservation time of the transportation.
     * @param reservationTime Date; the time and date of the reservation.
     */
    public void setReservationTime(Date reservationTime) {this.reservationTime = reservationTime;}


    /**
     * Prints the transportation object in a table format.
     * @return String; a table format.
     */
    public String tableFormat() {
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -13, -7, -13, -14, -7);
        return String.format(format,
                this.transportationName,
                this.cost,
                this.averageSpeed,
                this.purchaseType,
                this.maxPassengers);

    }

    /**
     * String representation for the transportation class. Lists all attributes in a "list-like" format.
     * @return String; string representation.
     */
    @Override
    public String toString() {
        return String.format("%s%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%s",
                "Type: ", this.transportationType,
                "Name: ", this.transportationName,
                "Cost: ", this.cost,
                "Average speed: ", this.averageSpeed,
                "Purchase type: ", this.purchaseType,
                "Location: ", this.location,
                "Reservation date: ", this.getReservationTime(),
                "Max passengers: ", this.maxPassengers);

    }
}


