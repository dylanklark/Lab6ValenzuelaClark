/**
 * Top level class in the inheritance. Defines the commonalities of all transportation types.
 * Includes tranportation type, cost, average speed, purchase type, and number of passengers.
 */

public class Transportation {
    private String transportationType;
    private double cost;
    private double averageSpeed;
    private String purchaseType;
    private int numPassengers;

    /**
     * Constructor for Tranportation class.
     * @param transportationType String; the transportation type.
     * @param cost Double; the cost of the transportation.
     * @param averageSpeed Double; the average speed of the transportation.
     * @param purchaseType String; purchase type (rental or ticket)
     * @param numPassengers Int; the number of passengers the transportation can support.
     */
    public Transportation(String transportationType, double cost, double averageSpeed,
                          String purchaseType, int numPassengers) {
        this.transportationType = transportationType;
        this.cost = cost;
        this.averageSpeed = averageSpeed;
        this.purchaseType = purchaseType;
        this.numPassengers = numPassengers;
    }

    /**
     * Gets the transportation type.
     * @return String
     */
    public String getTransportationType() {
        return transportationType;
    }

    /**
     * Gets the tranportation cost.
     * @return Double
     */
    public double getCost() {
        return cost;
    }

    /**
     * Gets the average speed of the transportation.
     * @return Double
     */
    public double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * Gets the purchase type of the transportation.
     * @return String
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * Gets the number of passengers the tranportation can hold.
     * @return int
     */
    public int getNumPassengers() {
        return numPassengers;
    }

    /**
     * Sets the transportation type.
     * @param transportationType String; type of transportation (air, water, land)
     */
    public void setTransportationType(String transportationType) {this.transportationType = transportationType;}

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

}
