import java.util.Scanner;

public class Question5_redo{

	public static void main(String[] args){

	Scanner kb = new Scanner(System.in);

	System.out.print("Enter your name (last, first): ");

	String fullname = kb.nextLine();
	int index = fullname.indexOf(',');

	String last = fullname.substring(0, index);
	String first = fullname.substring(index + 2);

	first = (first.substring(0,1)).toUpperCase() + first.substring(1);
	last = last.substring(0,1).toUpperCase() + last.substring(1);

	System.out.println("Formatted name: " + first + " " + last);
	}
}