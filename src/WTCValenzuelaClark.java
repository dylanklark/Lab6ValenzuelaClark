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

        if (transportType.toUpperCase().equals("AIR")) {
            Transportation transportOption = null;
            while (true) {
                Plane planeTicket = new Plane(100, 550, "Ticket", 160);
                Helicopter helicopterTicket = new Helicopter(500, 125, "Ticket", 6);
                Dirigible dirgibleTicket = new Dirigible(500, 35, "Ticket", 15);
                HotAirBalloon airBalloonTicket = new HotAirBalloon(250, 10, "Ticket", 10);
                displayTable(planeTicket, helicopterTicket, dirgibleTicket, airBalloonTicket);
                transportOption = selectOption(planeTicket, helicopterTicket, dirgibleTicket, airBalloonTicket);
                System.out.printf("%n%nYou selected '%s'%n" +
                        "Enter 'yes' to continue or 'no' to change your preferred transportation method. ",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.toLowerCase().equals("yes")) {break;}
                else {continue;}
            }
            System.out.print("How many passengers will be travelling with you? ");
            int passengerNum = input.nextInt();
            int totalCost = (int) (passengerNum * transportOption.getCost());
            System.out.printf("Your total cost is: %d dollars.", totalCost);
        }
        if (transportType.toUpperCase().equals("LAND")) {
            Transportation transportOption = null;
            while (true) {
                Train trainTicket = new Train(20, 50, "Ticket", 1000);
                Train trainRental = new Train(400, 50, "Rental", 1000);
                Bike bikeTicket = new Bike(10, 13, "Ticket", 2);
                Bike bikeRental = new Bike(100, 13, "Rental", 2);
                Automobile automobileTicket = new Automobile(40, 60, "Ticket", 5);
                Automobile automobileRental = new Automobile(100, 60, "Rental", 5);
                Bus busTicket = new Bus(7, 45, "Ticket", 40);
                Bus busRental = new Bus (500, 45, "Rental", 40);
                displayTable(trainTicket, bikeTicket, automobileTicket, busTicket);
                transportOption = selectOption(trainTicket, bikeTicket, automobileTicket, busTicket);
                System.out.printf("%n%nYou selected '%s'%n" +
                                "Enter 'yes' to continue or 'no' to change your preferred transportation method. ",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.toLowerCase().equals("yes")) {break;}
                else {continue;}
            }
            System.out.print("How many passengers will be travelling with you? ");
            int passengerNum = input.nextInt();
            int totalCost = (int) (passengerNum * transportOption.getCost());
            System.out.printf("Your total cost is: %d dollars.", totalCost);
        }
        if (transportType.toUpperCase().equals("WATER")){
            Transportation trasnportOption = null;
            while(true){
                Boat boatTicket = new Boat(20, 25, "Ticket", 10);
                Boat boatRental = new Boat(200, 25, "Rental", 10);
                Ship shipTicket = new Ship(20, 25, "Ticket", 1000);
                Ship shipRental = new Ship(200000, 25, "Rental", 1000);
                Submarine submarineTicket = new Submarine(50, 35, "Ticket", 20);
                Submarine submarineRental = new Submarine(50000, 35, "Rental", 20);
                displayTable(boatTicket, shipTicket, submarineTicket);
                transportOption = selectOption(boatTicket, shipTicket, submarineTicket);
                System.out.printf("%n%nYou selected '%s'%n" + "Enter 'yes' to continue or 'no' to change you preferred transportation method.",
                        transportOption.getTransportationName());
                String userChoice = input.nextLine().trim();
                if (userChoice.toLowerCase().equals("yes")) {break;}
                else{continue;}

            }
        }
    }

    public static void displayTable(Plane planeTicket, Helicopter helicopterTicket, Dirigible dirgibleTicket,
                                       HotAirBalloon airBalloonTicket) {
        System.out.print("\nYour air transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.print(planeTicket.tableFormat());
        System.out.print(helicopterTicket.tableFormat());
        System.out.print(dirgibleTicket.tableFormat());
        System.out.print(airBalloonTicket.tableFormat());
    }
    public static void displayTable(Train trainTicket, Bike bikeTicket, Automobile automobileTicket,
                                    Bus busTicket) {
        System.out.print("\nYour land transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.print(trainTicket.tableFormat());
        System.out.print(bikeTicket.tableFormat());
        System.out.print(automobileTicket.tableFormat());
        System.out.print(busTicket.tableFormat());
    }
    public static void displayTable (Boat boatTicket, Ship shipTicket, Submarine submarineTicket){
        System.out.print("\nYour water transportation options are: \n" + "-".repeat(70) + "\n");
        String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
        System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
        System.out.print(boatTicket.tableFormat());
        System.out.print(shipTicket.tableFormat());
        System.out.print(submarineTicket.tableFormat());
    }

    public static Transportation selectOption(Plane planeTicket, Helicopter helicopterTicket, Dirigible dirgibleTicket,
                                      HotAirBalloon airBalloonTicket) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich transportation option would you like to use? ");
        String transportOption = input.nextLine();
        switch (transportOption.toUpperCase()) {
            case "PLANE":
                System.out.print(planeTicket);
                return planeTicket;
            case "HELICOPTER":
                System.out.print(helicopterTicket);
                return helicopterTicket;
            case "DIRIGIBLE":
                System.out.print(dirgibleTicket);
                return dirgibleTicket;
            case "HOT AIR BALLOON":
                System.out.print(airBalloonTicket);
                return  airBalloonTicket;
            default:
                return null;
        }
    }
    public static Transportation selectOption(Train trainTicket, Bike bikeTicket, Automobile automobileTicket,
                                              Bus busTicket) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich transportation option would you like to use? ");
        String transportOption = input.nextLine();
        switch (transportOption.toUpperCase()) {
            case "TRAIN":
                System.out.print(trainTicket);
                return trainTicket;
            case "BIKE":
                System.out.print(bikeTicket);
                return bikeTicket;
            case "AUTOMOBILE":
                System.out.print(automobileTicket);
                return automobileTicket;
            case "BUS":
                System.out.print(busTicket);
                return  busTicket;
            default:
                return null;
        }
    }
    public static Transportation selectOption(Boat boatTicket, Ship shipTicket, Submarine submarineTicket){
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich transportation option would you like to use? ");
        String transportOption = input.nextLine();
        switch (transportOption.toUpperCase()){
            case "BOAT":
                System.out.print(boatTicket);
                return boatTicket;
            case "SHIP":
                System.out.print(shipTicket);
                return shipTicket;
            case "SUBMARINE":
                System.out.print(submarineTicket);
                return submarineTicket;
        }
    }

}
