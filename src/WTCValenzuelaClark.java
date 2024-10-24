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
        if (transportType.toUpperCase() == "AIR") {
            String format = String.format("%s\t%s\t%s\t%s\t%s%n");
            System.out.printf();
        }

    }
}
