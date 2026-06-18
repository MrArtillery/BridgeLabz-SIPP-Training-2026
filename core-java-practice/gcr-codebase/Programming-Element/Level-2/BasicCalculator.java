import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        System.out.println("The addition is " + (number1 + number2));
        System.out.println("The subtraction is " + (number1 - number2));
        System.out.println("The multiplication is " + (number1 * number2));
        System.out.println("The division is " + (number1 / number2));
    }
}
