import java.util.Scanner;

public class computeaverage{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter three numbers

        System.out.println("Enter three numbers:");
        double number1= input.nextDouble();
        double number2= input.nextDouble();
        double number3= input.nextDouble();

        // Computer average
        double average=(number1+number2+number3)/3;

        //Display results
        System.out.println("The average of"+number1+""+
                            number3+"is"+average);

    }
    
}