import java.util.Scanner;

public class Question4{

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        // Prompts the user to enter the temperature of past 3 days.
        System.out.print("The temperature of past 3 days is ");
        double d1 = kb.nextDouble();
            
        // Prompts the user to enter the temperature of past 2 days.
        System.out.print("The temperature of past 2 days is ");
        double d2 = kb.nextDouble();

        // Prompts the user to enter the temperature of past 1 day.
        System.out.print("The temperature of past 1 days is ");
        double d3 = kb.nextDouble();

        // To calculates the average.
        double average = ((d1+d2+d3)/3);

        // Prints the average of temperature
        System.out.printf("The average of temperature is %.2f C\n", average);
    }
}