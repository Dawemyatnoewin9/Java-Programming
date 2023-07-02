import java.util. Scanner; // Scanner is the java.util package
public class Areaofhexagon {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the length of the side of a hexagon
		// Prompt the area of the hexagon

		System.out.print("Enter the length of the side of a hexagon : ");
		double length = input.nextDouble();

		// Compute the area of the hexagon
		double area=(((3*1.7321)/2)*((length)*(length)));

		// Display result
		System.out.println("The area of the hexagon is"+ area);
	}
}
