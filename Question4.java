import java.util.Scanner;

/**
 * program to check the URL is valid or not.
 * @author geonkim
 */
public class Question4{

    /**
     *
     * @param args
     */
    public static void main(String[] args){
            
        // Prompt the user for a URL
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String address = kb.nextLine();
        int count = 0;
            
        for(int i = 0; i<address.length(); i++){
            if(address.charAt(i) != 0)
                count++;
        }
        
        System.out.println("Verifying an URL with " + count + " characters");
        int space = address.length();
        String str = "";
        String address2 = address.substring(0,8);
        
        if (address2.equals("https://")) {
            System.out.println("Is this a valid and secure URL?: True");
        }
        else
        {
            System.out.println("Is this a valid and secure URL?: False");
        }                    
    }
}
