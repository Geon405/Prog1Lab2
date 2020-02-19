import java.util.Scanner;

public class JavaAreaAndPerimeterOfRectangle {

public static void main (String[] args)
{
	int length;
	int width;
	int area;
	int perimeter;

	Scanner in = new Scanner(System.in);
	System.out.print("Enter length of Rectangle: ");
	length = in.nextInt();
	System.out.print("Enter width of Rectangle: ");
	width = in.nextInt();
	// Area of rectangle = length X width
	area = length * width;
	// Perimeter of rectangle = 2 X (length X width)
	perimeter = 2 * (length + width);
	System.out.println("Area of Rectangle : " + area);
	System.out.println("Rectangle of Rectangle : " + perimeter);
	}

}

