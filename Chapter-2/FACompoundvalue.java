import java.util. Scanner; // Scanner is the java.util package

public class FACompoundvalue {
    public static void main(String[] args) {
    // Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an amount, the 
		// annual interest rate and the number of months
		System.out.print("Enter an amount : ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual interest rate : ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter the number of months : ");
		int months = input.nextInt();

		// Compute monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Compute amount in the savings account after the given month
		double compoundValue = 0; // Accumulates compount value
		for (int m = 1; m <= months; m++) {
			compoundValue = (amount + compoundValue) * (1 + monthlyInterestRate);
		}

		// Display result
		System.out.printf(
			"Amount in savings account after " + 
			months + " months: $%.2f\n", compoundValue);
	}
}