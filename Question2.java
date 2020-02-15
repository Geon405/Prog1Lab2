import java.util.Scanner;

/**
 * program to calculate the total price included taxes and tips.
 * @author geonkim
 */
public class Question2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        // Prompt the user to enter the price of a product
        System.out.print("Enter the price of a product in CAD: ");
        double Price = kb.nextDouble();
        
        // Output values of sales tax such as TPS and TVQ
        double TPS = Price * 0.09975;
        double TVQ = Price * 0.05;
        System.out.println("The values of sales tax in Quebec is " + '$' + (TPS + TVQ));
        
        // Output the tips
        double tip = Price * 0.15;
        System.out.println("The tips of 15% is " + '$' + tip);
        
        // Output the total price included with taxes and tips
        System.out.println("The total amount that should be paid: " + '$' + (Price + TPS + TVQ + tip));
    }
}
