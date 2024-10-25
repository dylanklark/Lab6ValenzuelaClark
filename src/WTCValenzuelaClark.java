import java.util.Scanner;

/*
Main driver file for the program
 */
public class WTCValenzuelaClark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("You can choose a type of transportation you prefer.\nPlease enter either" +
                " Air, Water, or Land: ");
        String transportType = input.nextLine();


        if (transportType.equalsIgnoreCase("AIR")) {
            Transportation transportOption;
            while (true) {
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
                transportOption = selectOption(planeTicket, planeRental, helicopterTicket,helicopterRental,
                        dirgibleTicket, dirgibleRental, airBalloonTicket, airBalloonRental);
                assert transportOption != null;
                System.out.printf("%n%nYou selected '%s'%n" +
                        "Enter 'yes' to continue or 'no' to change your preferred transportation method. ",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.equalsIgnoreCase("yes")) {break;}
            }
            travelInfo(transportOption, input);
        }


        if (transportType.equalsIgnoreCase("LAND")) {
            Transportation transportOption;
            while (true) {
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
                transportOption = selectOption(trainTicket, trainRental, bikeTicket, bikeRental, automobileTicket,
                        automobileRental, busTicket, busRental);
                assert transportOption != null;
                System.out.printf("%n%nYou selected '%s'%n" +
                                "Enter 'yes' to continue or 'no' to change your preferred transportation method. ",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.equalsIgnoreCase("yes")) {break;}
            }
            travelInfo(transportOption, input);
        }


        if (transportType.equalsIgnoreCase("WATER")){
            Transportation transportOption;
            while(true){
                Boat boatTicket = new Boat(20, 25, "Ticket", 10);
                Boat boatRental = new Boat(200, 25, "Rental", 10);
                Ship shipTicket = new Ship(20, 25, "Ticket", 1000);
                Ship shipRental = new Ship(200000, 25, "Rental", 1000);
                Submarine submarineTicket = new Submarine(50, 35, "Ticket", 20);
                Submarine submarineRental = new Submarine(50000, 35, "Rental", 20);
                displayTable(boatTicket, boatRental, shipTicket, shipRental, submarineTicket, submarineRental);
                transportOption = selectOption(boatTicket, boatRental, shipTicket, shipRental, submarineTicket,
                        submarineRental);
                assert transportOption != null;
                System.out.printf("%n%nYou selected '%s'%n" +
                                "Enter 'yes' to continue or 'no' to change your preferred transportation method. ",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.equalsIgnoreCase("yes")) {break;}
            }
            travelInfo(transportOption, input);
        }
    }


    public static void displayTable(Plane planeTicket, Plane planeRental, Helicopter helicopterTicket,
                                    Helicopter helicopterRental, Dirigible dirgibleTicket, Dirigible dirgibleRental,
                                    HotAirBalloon airBalloonTicket, HotAirBalloon airBalloonRental) {
        System.out.print("\nYour air transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.print(planeTicket.tableFormat());
        System.out.print(planeRental.tableFormat());
        System.out.print(helicopterTicket.tableFormat());
        System.out.print(helicopterRental.tableFormat());
        System.out.print(dirgibleTicket.tableFormat());
        System.out.print(dirgibleRental.tableFormat());
        System.out.print(airBalloonTicket.tableFormat());
        System.out.print(airBalloonRental.tableFormat());
    }

    public static void displayTable(Train trainTicket, Train trainRental, Bike bikeTicket, Bike bikeRental,
                                    Automobile automobileTicket, Automobile automobileRental,
                                    Bus busTicket, Bus busRental) {
        System.out.print("\nYour land transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.print(trainTicket.tableFormat());
        System.out.print(trainRental.tableFormat());
        System.out.print(bikeTicket.tableFormat());
        System.out.print(bikeRental.tableFormat());
        System.out.print(automobileTicket.tableFormat());
        System.out.print(automobileRental.tableFormat());
        System.out.print(busTicket.tableFormat());
        System.out.print(busRental.tableFormat());
    }

    public static void displayTable (Boat boatTicket, Boat boatRental, Ship shipTicket, Ship shipRental,
                                     Submarine submarineTicket, Submarine submarineRental){
        System.out.print("\nYour water transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.print(boatTicket.tableFormat());
        System.out.print(boatRental.tableFormat());
        System.out.print(shipTicket.tableFormat());
        System.out.print(shipRental.tableFormat());
        System.out.print(submarineTicket.tableFormat());
        System.out.print(submarineRental.tableFormat());
    }

    public static Transportation selectOption(Plane planeTicket, Plane planeRental, Helicopter helicopterTicket,
                                              Helicopter helicopterRental, Dirigible dirgibleTicket,
                                              Dirigible dirgibleRental, HotAirBalloon airBalloonTicket,
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
                    System.out.print(dirgibleRental);
                    return dirgibleRental;
                }
                else {System.out.print(dirgibleTicket); return dirgibleTicket;}
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

    public static void travelInfo(Transportation transportOption, Scanner input) {
        if (transportOption.getPurchaseType().equals("Rental")) {
            System.out.print("How many passengers will be travelling with you? ");
            int passengerNum = input.nextInt();
            System.out.print("Duration of your rental? ");
            int rentalDuration = input.nextInt();
            int totalCost = (int) (passengerNum * transportOption.getCost() * rentalDuration);
            System.out.printf("%nYour total cost is: %d dollars.", totalCost);
            System.out.printf("%nPlease head to '%s' {at some time} to pickup your rental.",
                    transportOption.getLocation());
        }
        if (transportOption.getPurchaseType().equals("Ticket")) {
            System.out.print("How many passengers will be travelling with you? ");
            int passengerNum = input.nextInt();
            int totalCost = (int) (passengerNum * transportOption.getCost());
            System.out.printf("%nYour total cost is: %d dollars.", totalCost);
            System.out.printf("%nPlease head to '%s' {at some time} to board your scheduled transportation.",
                    transportOption.getLocation());
        }
    }

}
