import java.util.Scanner;

/**
 * program to calculate the cost of a road trip.
 * @author geonkim
 */
public class Question1 {

    /**
     *
     * @param args
     */
    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);

        // Prompt the user the total distance that user will travelled.
        System.out.print("How many kilometers will be travelled: ");
        double totalDistance = kb.nextDouble();

        // Prompt the user the average distance per liters of gas
        System.out.print("What is the average distance that the vehicle runs with 1"
                + " liters of gas: ");
        double Averageliter = kb.nextDouble();
        
        // Output the total price of gas
        double priceGas = (totalDistance/Averageliter)*1.16;
        System.out.printf("The cost of trip is %.2f\n", priceGas);
    }
}
