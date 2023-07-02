import java.util. Scanner; // Scanner is the java.util package

public class Financialapplication {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input=new Scanner(System.in);

        //Prompt the user to enter the subtotel and a gratuity rate
        System.out.println("enter the subtotel and a gratuity rate");
        double number1=input.nextDouble();
        double number2=input.nextDouble();

        // Compute the gratuity
        double gratuity=(number2/number1);

        // Compute the total
        double total=((number1+number2)/2);

        // Display the results
        System.out.println("The gratuity is $"+(number2/number1));
        System.out.println("The total is $"+(number1+number2)/2);
        
    }
}
