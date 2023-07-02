import java.util. Scanner; // Scanner is the java.util package
public class Healthapplication{

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        double height= input.nextDouble();

        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}