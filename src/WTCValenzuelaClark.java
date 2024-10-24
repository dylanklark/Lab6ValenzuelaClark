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
            while (true) {
                Plane planeTicket = new Plane(100, 550, "Ticket", 160);
                Helicopter helicopterTicket = new Helicopter(500, 125, "Ticket", 6);
                Dirigible dirgibleTicket = new Dirigible(500, 35, "Ticket", 15);
                HotAirBalloon airBalloonTicket = new HotAirBalloon(250, 10, "Ticket", 10);
                System.out.print("\nYour air transportation options are: \n" + "-".repeat(70) + "\n");
                String format = String.format("%%%ds\t%%%ds\t%%%ds\t%%%ds\t%%%ds%n", -15, -5, -5, -5, -5);
                System.out.printf(format, "Option", "Cost", "Average Speed", "Rental/Ticket", "Number of Passengers");
                System.out.print(planeTicket.tableFormat());
                System.out.print(helicopterTicket.tableFormat());
                System.out.print(dirgibleTicket.tableFormat());
                System.out.print(airBalloonTicket.tableFormat());

                System.out.print("\nWhich transportation option would you like to use? ");
                String transportOption = input.nextLine();
                switch (transportOption.toUpperCase()) {
                    case "PLANE":
                        System.out.print(planeTicket);
                        break;
                    case "HELICOPTER":
                        System.out.print(helicopterTicket);
                        break;
                    case "DIRIGIBLE":
                        System.out.print(dirgibleTicket);
                        break;
                    case "HOT AIR BALLOON":
                        System.out.print(airBalloonTicket);
                        break;
                }
                System.out.printf("%nYou selected %s%n, " +
                        "Enter 'yes' to continue or 'no' to change your preferred transportation method.", transportOption);
                String userChoice = input.nextLine().trim();
                if ("yes".equals(userChoice.toLowerCase())) {continue;}
                else {break;}
            }
        }
    }
}
