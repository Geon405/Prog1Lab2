import java.util.Scanner;

public class Question4{

	public static void main(String[] args){
            
            // Prompt the user for a URL
            System.out.print("Enter an email address: ");

            Scanner in = new Scanner(System.in);
            String email_address = in.nextLine();
            
            System.out.println("Verifying an URL with X characters");
            
            // To find the position of "@"
            int position = email_address.indexOf("@");

            // To output the username
            String user_name = email_address.substring(0, position);
	    System.out.println("Username   : " + user_name);

            // To output the domain name
            String domain_name = email_address.substring(position+1);
            System.out.println("Domain name: " + domain_name);
	}
}