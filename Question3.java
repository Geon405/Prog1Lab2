import java.util.Scanner;

public class Question3{

public static void main(String[] args){

	Scanner kb = new Scanner(System.in);

	System.out.print("Enter the amount of seconds: ");
	int second = kb.nextInt();

        // To convert second to minute.
	int minutes = second/60;
        
	int remainingSeconds = second % 60;

        // Prints the output of time in minutes.
	System.out.println("Convert seconds to minutes: " + minutes + ":" + remainingSeconds + " min");
	}
}

