import java.util. Scanner; // Scanner is the java.util package
public class Monthlysavingamount {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double Monthly_Interest_Rate=0.00417;

		// Prompt the user to enter a monthly saving amount
		// the account the value after the sixth month

		System.out.print("Enter the monthly saving amount : ");
		double length = input.nextDouble();

		// Compute the first month account value
		double total=100*(1+Monthly_Interest_Rate);
		// Compute the second month account value
		total=(100+total)*(1+Monthly_Interest_Rate);
		// Compute the third month account value
		total=(100+total)*(1+Monthly_Interest_Rate);
		// Compute the fouth month account value
		total=(100+total)*(1+Monthly_Interest_Rate);
		// Compute the fifth month account value
		total=(100+total)*(1+Monthly_Interest_Rate);
		// Compute the sixth month account value
		total=(100+total)*(1+Monthly_Interest_Rate);


		// Display result
		System.out.println("After the sixth month,the account value is"+ total);
	}
}
