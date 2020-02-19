import java.util.Scanner;

public class Distance {

public static void main (String [] args) {

        Scanner kb = new Scanner(System.in);
        System.out.print("Initial units of distance is ");
        double distance_m = kb.nextDouble();

	double distance_f = distance_m * 3.28;

	System.out.println("Initial units of distance is " + distance_m + 'm');

	System.out.println("Convert units from meter to feet is " + distance_f + "ft");
	}
}