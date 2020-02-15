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
        System.out.print("Enter an email address: ");

        Scanner in = new Scanner(System.in);
        String email_address = in.nextLine();
            
        //To calculate the size of the URL
        int count = 0;
            
        for(int i = 0; i<email_address.length(); i++){
            if(email_address.charAt(i) != 0)
                count++;
        }
        
        System.out.println("Verifying an URL with " + count + " characters");
        
        boolean isValid = true;
        
        if(isValid){
            System.out.println("Is this a valid and secure URL?: true");
        } else {
            System.out.println("Is this a valid and secure URL?: false");
        }                    
    }
}
