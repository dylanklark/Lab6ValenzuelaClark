import java.util.Scanner;
import java.util.Date;

/*
Main driver file for the program
Polymorphism is used here where the displayTable and selectOption takes in different parameters.
 */
public class WTCValenzuelaClark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("You can choose a type of transportation you prefer.\nPlease enter either" +
                " Air, Water, or Land: ");
        String transportType = input.nextLine(); // Users chooses Air, Land, or Water

        // If user chooses Air
        if (transportType.equalsIgnoreCase("AIR")) {
            Transportation transportOption;
            while (true) {
                // Initialize all AirTransportation objects
                Plane planeTicket = new Plane(300, 550, "Ticket", 160);
                Plane planeRental = new Plane(500, 550, "Rental", 160);
                Helicopter helicopterTicket = new Helicopter(450, 125, "Ticket", 6);
                Helicopter helicopterRental = new Helicopter(1000, 125, "Rental", 6);
                Dirigible dirgibleTicket = new Dirigible(400, 35, "Ticket", 15);
                Dirigible dirgibleRental = new Dirigible(10000, 35, "Rental", 15);
                HotAirBalloon airBalloonTicket = new HotAirBalloon(250, 10, "Ticket",
                        10);
                HotAirBalloon airBalloonRental = new HotAirBalloon(500, 10, "Rental",
                        10);
                displayTable(planeTicket, planeRental, helicopterTicket, helicopterRental, dirgibleTicket,
                        dirgibleRental, airBalloonTicket, airBalloonRental);
                // Prompts and stores users' selected transportation option
                transportOption = selectOption(planeTicket, planeRental, helicopterTicket,helicopterRental,
                        dirgibleTicket, dirgibleRental, airBalloonTicket, airBalloonRental);
                System.out.printf("%n%nYou selected '%s'%n" +
                        "Enter 'yes' to continue or 'no' to change your preferred transportation method. ",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.equalsIgnoreCase("yes")) {break;}
            }
            // Prints travel information
            travelInfo(transportOption, input);
        }

        // If user chooses Land
        if (transportType.equalsIgnoreCase("LAND")) {
            Transportation transportOption;
            while (true) {
                // Initialize all LandTransportation objects
                Train trainTicket = new Train(20, 50, "Ticket", 1000);
                Train trainRental = new Train(400, 50, "Rental", 1000);
                Bike bikeTicket = new Bike(10, 13, "Ticket", 2);
                Bike bikeRental = new Bike(100, 13, "Rental", 2);
                Automobile automobileTicket = new Automobile(40, 60, "Ticket", 5);
                Automobile automobileRental = new Automobile(100, 60, "Rental", 5);
                Bus busTicket = new Bus(7, 45, "Ticket", 40);
                Bus busRental = new Bus (500, 45, "Rental", 40);
                displayTable(trainTicket, trainRental, bikeTicket, bikeRental, automobileTicket,
                        automobileRental, busTicket, busRental);
                // Prompts and stores users' selected transportation option
                transportOption = selectOption(trainTicket, trainRental, bikeTicket, bikeRental, automobileTicket,
                        automobileRental, busTicket, busRental);
                System.out.printf("%n%nYou selected '%s'%n" +
                                "Enter 'yes' to continue or 'no' to change your preferred transportation method. ",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.equalsIgnoreCase("yes")) {break;}
            }
            // Prints travel information
            travelInfo(transportOption, input);
        }

        // If user chooses Water
        if (transportType.equalsIgnoreCase("WATER")){
            Transportation transportOption;
            while(true){
                // Initialize all WaterTransportation objects
                Boat boatTicket = new Boat(20, 25, "Ticket", 10);
                Boat boatRental = new Boat(200, 25, "Rental", 10);
                Ship shipTicket = new Ship(20, 25, "Ticket", 1000);
                Ship shipRental = new Ship(200000, 25, "Rental", 1000);
                Submarine submarineTicket = new Submarine(50, 35, "Ticket", 20);
                Submarine submarineRental = new Submarine(50000, 35, "Rental", 20);
                displayTable(boatTicket, boatRental, shipTicket, shipRental, submarineTicket, submarineRental);
                // Prompts and stores users' selected transportation option
                transportOption = selectOption(boatTicket, boatRental, shipTicket, shipRental, submarineTicket,
                        submarineRental);
                System.out.printf("%n%nYou selected '%s'%n" +
                                "Enter 'yes' to continue or 'no' to change your preferred transportation method. ",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.equalsIgnoreCase("yes")) {break;}
            }
            // Prints travel information
            travelInfo(transportOption, input);
        }
    }

    /**
     * Displays table for AirTransportation objects.
     * @param planeTicket Plane; a plane ticket
     * @param planeRental Plane; a plane rental
     * @param helicopterTicket Helicopter; a heli ticket
     * @param helicopterRental Helicopter; a heli rental
     * @param dirigibleTicket Dirigible; a dirigible ticket
     * @param dirigibleRental Dirigible; a dirigible rental
     * @param airBalloonTicket HotAirBalloon; an air balloon ticket
     * @param airBalloonRental HotAirBalloon; an air balloon rental
     */
    public static void displayTable(Plane planeTicket, Plane planeRental, Helicopter helicopterTicket,
                                    Helicopter helicopterRental, Dirigible dirigibleTicket, Dirigible dirigibleRental,
                                    HotAirBalloon airBalloonTicket, HotAirBalloon airBalloonRental) {
        System.out.print("\nYour air transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.printf("%s%s%s%s%s%s%s%s", planeTicket.tableFormat(), planeRental.tableFormat(),
                helicopterTicket.tableFormat(), helicopterRental.tableFormat(), dirigibleTicket.tableFormat(),
        dirigibleRental.tableFormat(), airBalloonTicket.tableFormat(), airBalloonRental.tableFormat());
    }

    /**
     * Displayes table for LandTransportation objects.
     * @param trainTicket Train; a train ticket
     * @param trainRental Train; a train rental
     * @param bikeTicket Bike; a bike ticket
     * @param bikeRental Bike; a bike rental
     * @param automobileTicket Automobile; an auto ticket
     * @param automobileRental Automobile; an auto rental
     * @param busTicket Bus; a bus ticket
     * @param busRental Bus; a bus rental
     */
    public static void displayTable(Train trainTicket, Train trainRental, Bike bikeTicket, Bike bikeRental,
                                    Automobile automobileTicket, Automobile automobileRental,
                                    Bus busTicket, Bus busRental) {
        System.out.print("\nYour land transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.printf("%s%s%s%s%s%s%s%s", trainTicket.tableFormat(), trainRental.tableFormat(),
                bikeTicket.tableFormat(), bikeRental.tableFormat(), automobileTicket.tableFormat(),
                automobileRental.tableFormat(), busTicket.tableFormat(), busRental.tableFormat());
    }

    /**
     * Displays table for WaterTransportation objects.
     * @param boatTicket Boat; a boat ticket
     * @param boatRental Boat; a boat rental
     * @param shipTicket Ship; a ship ticket
     * @param shipRental Ship; a ship rental
     * @param submarineTicket Submarine; a sub ticket
     * @param submarineRental Submarine; a sub rental
     */
    public static void displayTable (Boat boatTicket, Boat boatRental, Ship shipTicket, Ship shipRental,
                                     Submarine submarineTicket, Submarine submarineRental){
        System.out.print("\nYour water transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.printf("%s%s%s%s%s%s", boatTicket.tableFormat(), boatRental.tableFormat(),
                shipTicket.tableFormat(), shipRental.tableFormat(), submarineTicket.tableFormat(),
                submarineRental.tableFormat());
    }

    /**
     * Allows user to select their option for rental or ticket for AirTransportation.
     * @param planeTicket Plane; a plane ticket
     * @param planeRental Plane; a plane rental
     * @param helicopterTicket Helicopter; a heli ticket
     * @param helicopterRental Helicopter; a heli rental
     * @param dirigibleTicket Dirigible; a dirigible ticket
     * @param dirigibleRental Dirigible; a dirigible rental
     * @param airBalloonTicket HotAirBalloon; an air balloon ticket
     * @param airBalloonRental HotAirBalloon; an air balloon rental
     * @return Transportation; the user's selected option
     */
    public static Transportation selectOption(Plane planeTicket, Plane planeRental, Helicopter helicopterTicket,
                                              Helicopter helicopterRental, Dirigible dirigibleTicket,
                                              Dirigible dirigibleRental, HotAirBalloon airBalloonTicket,
                                              HotAirBalloon airBalloonRental) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich transportation option would you like to use? Enter choice from " +
                "options column: ");
        String transportOption = input.nextLine();
        System.out.print("\nIs this for a rental or a ticket? Enter 'rental' or 'ticket':  ");
        String puchaseOption = input.nextLine();
        switch (transportOption.toUpperCase()) {
            case "PLANE":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(planeRental);
                    return planeRental;
                }
                else {System.out.print(planeTicket); return planeTicket;}
            case "HELICOPTER":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(helicopterRental);
                    return helicopterRental;
                }
                else {System.out.print(helicopterTicket); return helicopterTicket;}
            case "DIRIGIBLE":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(dirigibleRental);
                    return dirigibleRental;
                }
                else {System.out.print(dirigibleTicket); return dirigibleTicket;}
            case "HOT AIR BALLOON":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(airBalloonRental);
                    return airBalloonRental;
                }
                else {System.out.print(airBalloonTicket); return airBalloonTicket;}
            default:
                return null;
        }
    }

    /**
     * Allows user to select their option for rental or ticket for LandTransportation.
     * @param trainTicket Train; a train ticket
     * @param trainRental Train; a train rental
     * @param bikeTicket Bike; a bike ticket
     * @param bikeRental Bike; a bike rental
     * @param automobileTicket Automobile; an auto ticket
     * @param automobileRental Automobile; an auto rental
     * @param busTicket Bus; a bus ticket
     * @param busRental Bus; a bus rental
     * @return Transportation; the user's selected option
     */
    public static Transportation selectOption(Train trainTicket, Train trainRental, Bike bikeTicket, Bike bikeRental,
                                              Automobile automobileTicket, Automobile automobileRental,
                                              Bus busTicket, Bus busRental) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich transportation option would you like to use? Enter choice from " +
                "options column: ");
        String transportOption = input.nextLine();
        System.out.print("\nIs this for a rental or a ticket? Enter 'rental' or 'ticket':  ");
        String puchaseOption = input.nextLine();
        switch (transportOption.toUpperCase()) {
            case "TRAIN":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(trainRental);
                    return trainRental;
                }
                else {System.out.print(trainTicket); return trainTicket;}
            case "BIKE":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(bikeRental);
                    return bikeRental;
                }
                else {System.out.print(bikeTicket); return bikeTicket;}
            case "AUTOMOBILE":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(automobileRental);
                    return automobileRental;
                }
                else {System.out.print(automobileTicket); return automobileTicket;}
            case "BUS":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(busRental);
                    return busRental;
                }
                else {System.out.print(busTicket); return busTicket;}
            default:
                return null;
        }
    }

    /**
     * Allows user to select their option for rental or ticket for WaterTransportation.
     *@param boatTicket Boat; a boat ticket
     * @param boatRental Boat; a boat rental
     * @param shipTicket Ship; a ship ticket
     * @param shipRental Ship; a ship rental
     * @param submarineTicket Submarine; a sub ticket
     * @param submarineRental Submarine; a sub rental
     * @return Transportation; the user's selected option
     */
    public static Transportation selectOption(Boat boatTicket, Boat boatRental, Ship shipTicket, Ship shipRental,
                                              Submarine submarineTicket, Submarine submarineRental){
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich transportation option would you like to use? Enter choice from " +
                "options column: ");
        String transportOption = input.nextLine();
        System.out.print("\nIs this for a rental or a ticket? Enter 'rental' or 'ticket':  ");
        String puchaseOption = input.nextLine();
        switch (transportOption.toUpperCase()){
            case "BOAT":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(boatRental);
                    return boatRental;
                }
                else {System.out.print(boatTicket); return boatTicket;}
            case "SHIP":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(shipRental);
                    return shipRental;
                }
                else {System.out.print(shipTicket); return shipTicket;}
            case "SUBMARINE":
                if (puchaseOption.equalsIgnoreCase("RENTAL")) {
                    System.out.print(submarineRental);
                    return submarineRental;
                }
                else {System.out.print(submarineTicket); return submarineTicket;}
            default:
                return null;
        }
    }

    /**
     * Prompts user for number of passengers and duration (if rental) and displays travel instructions,
     * as well as either a boarding or pickup time.
     * @param transportOption Transportation; the transportation method user selected
     * @param input Scanner; allows the continued use of Scanner object earlier in program.
     */
    public static void travelInfo(Transportation transportOption, Scanner input) {
        if (transportOption.getPurchaseType().equals("Rental")) {
            System.out.print("How many passengers will be travelling with you? ");
            int passengerNum = input.nextInt();
            // Ensures max capacity is not exceeded
            if (passengerNum > transportOption.getMaxPassengers()) {
                while (true) {
                    System.out.printf("Passengers exceed maximum capacity, please enter a value" +
                            " less than or equal to %s: ", transportOption.getMaxPassengers());
                    passengerNum = input.nextInt();
                    if (passengerNum <= transportOption.getMaxPassengers()) {break;}
                }
            }
            System.out.print("Duration of your rental? ");
            int rentalDuration = input.nextInt();
            int totalCost = (int) (passengerNum * transportOption.getCost() * rentalDuration);
            System.out.printf("%nYour total cost is: %d dollars.", totalCost);
            System.out.printf("%nPlease head to '%s' at %s to pickup your rental.",
                    transportOption.getLocation(), transportOption.getReservationTime());
        }
        if (transportOption.getPurchaseType().equals("Ticket")) {
            System.out.print("How many passengers will be travelling with you? ");
            int passengerNum = input.nextInt();
            // Ensures max capacity is not exceed
            if (passengerNum > transportOption.getMaxPassengers()) {
                while (true) {
                    System.out.printf("Passengers exceed maximum capacity, please enter a value" +
                            " less than or equal to %s: ", transportOption.getMaxPassengers());
                    passengerNum = input.nextInt();
                    if (passengerNum <= transportOption.getMaxPassengers()) {break;}
                }
            }
            int totalCost = (int) (passengerNum * transportOption.getCost());
            System.out.printf("%nYour total cost is: %d dollars.", totalCost);
            System.out.printf("%nPlease head to '%s' at %s to board your scheduled transportation.",
                    transportOption.getLocation(), transportOption.getReservationTime());
        }
    }

}
