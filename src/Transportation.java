import java.util.Date;

/**
 * Top level class in the inheritance. Defines the commonalities of all transportation types.
 * Includes tranportation type, cost, average speed, purchase type, and number of passengers.
 */
public class Transportation {
    private String transportationType;
    private String transportationName;
    private double cost;
    private double averageSpeed;
    private String purchaseType;
    private int numPassengers;
    private Date reservationTime;

    /**
     * Constructor for Tranportation class.
     * @param transportationType String; the transportation type.
     * @param transportationName String; the name of the transportation.
     * @param cost Double; the cost of the transportation.
     * @param averageSpeed Double; the average speed of the transportation.
     * @param purchaseType String; purchase type (rental or ticket)
     * @param numPassengers Int; the number of passengers the transportation can support.
     * @param reservationTime Date; the date and time od the reservation (for either a rental or ticket)
     */
    public Transportation(String transportationType, String transportationName, double cost, double averageSpeed,
                          String purchaseType, int numPassengers, Date reservationTime) {
        this.transportationType = transportationType;
        this.transportationName = transportationName;
        this.cost = cost;
        this.averageSpeed = averageSpeed;
        this.purchaseType = purchaseType;
        this.numPassengers = numPassengers;
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
                          String purchaseType, int numPassengers) {
        this.transportationType = transportationType;
        this.transportationName = transportationName;
        this.cost = cost;
        this.averageSpeed = averageSpeed;
        this.purchaseType = purchaseType;
        this.numPassengers = numPassengers;
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
    public int getNumPassengers() {return numPassengers;}

    /**
     * Gets the reservation time for the transportation.
     * @return
     */
    public Date getReservationTime() {return reservationTime;}


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
     * @param numPassengers int; number of passengers that can be supported.
     */
    public void setNumPassengers(int numPassengers) {this.numPassengers = numPassengers;}

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
                this.numPassengers);

    }
    @Override
    public String toString() {
        return String.format("%s%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%s",
                "Type: ", this.transportationType,
                "Name: ", this.transportationName,
                "Cost: ", this.cost,
                "Average speed: ", this.averageSpeed,
                "Purchase type: ", this.purchaseType,
                "Max passengers: ", this.numPassengers);

    }
}


