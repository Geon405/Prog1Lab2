import java.util.Scanner;

public class Question3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 3 digits of integer: ");
        String number = input.nextLine();
        
        char n1 = number.charAt(0);
        
        char n2 = number.charAt(1);
        
        char n3 = number.charAt(2);
        
        System.out.println("Sum of 3 digits are " + (n1 + n2 + n3));        
    }
}
