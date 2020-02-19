import java.util.Scanner;

public class Question5{

public static void main(String[] args){

	Scanner kb = new Scanner(System.in);

	System.out.print("Enter the firstname and the last name with comma between it: ");

	String name = kb.nextLine();
        
        // To find the position where the comma(,) is.
	int position = name.indexOf(",");

        // To change first name to the upper case.
	String fName = name.substring(0, position).toUpperCase();

        // To change last name to the lower case.
	String lName = name.substring(position+1).toLowerCase();
        
        // Prints the output.
	System.out.println("Name is " + fName + lName);
	}
}

