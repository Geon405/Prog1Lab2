import java.util.Scanner;

public class Question2 {

    public static void main (String [] args) {

        Scanner kb = new Scanner(System.in);

	System.out.print("Enter your weight in pound: ");

	double pound = kb.nextDouble();

	System.out.print("Enter your height in feet: ");

	double feet = kb.nextDouble();

        // To convert pound to kilograms.
	double kilograms = 0.453592 * pound;
        
        // To convert feet to meter.
	double meter = 0.3048 * feet;

        // To calculate the BMI.
	double bmi = (kilograms / Math.pow(meter, 2));

        // Prints the output of weight in kilograms.
	System.out.printf("The weight converted to kilograms is: %.2fkg", kilograms);

        // Prints the output of height in meter.
	System.out.printf("\nThe height converted to meters is %.2fm", meter);

        // Prints the output BMI.
	System.out.printf("\nThe BMI is %.2f\n", bmi);
    }
}