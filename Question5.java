import java.util.Scanner;

public class Question5 {

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

       	int min = 0;
        int max = 100;
        int rand_int = (int)(Math.random()*(max-min+1)+min);

        System.out.print("Enter random number between 0 and 100: ");
        int number = kb.nextInt();

        // power of 2
        int power1 = (int)Math.pow(number,2);
        System.out.println("Powers of 2 is " + power1);

        // power of 3
        int power2 = (int)Math.pow(number,2);
        System.out.println("Powers of 2 is " + power2);

        // square root
        System.out.println("Square root of input is " + Math.sqrt(number));

        // natural logarithm
	System.out.println("Natural logarithm of input is " + Math.log(number));

	// base 10 logarithm
	System.out.println("Base 10 logarithm of input is " + Math.log10(number));
    }
}
