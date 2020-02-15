import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the price of a product in CAD: ");
        double Price = kb.nextDouble();

        double TPS = Price * 0.09975;
        double TVQ = Price * 0.05;
        System.out.println("The values of sales tax in Quebec is " + '$' + (TPS + TVQ));

        double tip = Price * 0.15;
        System.out.println("The tips of 15% is " + '$' + tip);

        System.out.println("The total amount that should be paid: " + '$' + (Price + TPS + TVQ + tip));
    }
}
