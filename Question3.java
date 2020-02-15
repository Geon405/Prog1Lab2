import java.util.Scanner;

/**
 * program the sum of the digits of integer.
 * @author geonkim
 */
public class Question3 {

    /**
     * 
     * @param args
     */
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 3 digits of integer
        System.out.print("Enter the 3 digits of integer: ");
        String number = input.nextLine();
        
        char first = number.charAt(0);
        
        char second = number.charAt(1);
        
        char third = number.charAt(2);
        
        // Sum of the 3 digits
        System.out.println("Sum of 3 digits are " + ((first + second + third)-144));        
    }
}
