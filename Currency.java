import java.util.Scanner;

public class Currency {

public static void main(String[] args){
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Initial currency is ");
        double cad = kb.nextDouble();

	// USD
	double usd = 1.32 * cad;

	// EUR
	double eur = 1.46 * cad;

	// Convert USD to CAD
	System.out.printf("Currency of USD to CAD is " + "$%.2f\n", usd);

	// Convert EUR to CAD
	System.out.printf("Currency of EUR to CAD is " + "$%.2f\n", eur);
	}
}
