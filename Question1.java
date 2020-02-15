import java.util.Scanner;

public class Question1 {

    public static void main(String [] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("How many kilometers will be travelled: ");
        double totalDistance = kb.nextDouble();

        System.out.print("What is the average distance that the vehicle runs with 1"
                + " liters of gas: ");
        double Averageliter = kb.nextDouble();

        double priceGas = (totalDistance/Averageliter)*1.16;
        System.out.printf("The cost of trip is %.2f\n", priceGas);
    }
}
