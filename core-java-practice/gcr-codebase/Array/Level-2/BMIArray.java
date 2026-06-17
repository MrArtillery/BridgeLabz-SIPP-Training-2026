import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Height (cm): ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {

            double heightMeter = height[i] / 100.0;

            bmi[i] = weight[i] / (heightMeter * heightMeter);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nPerson Details");

        for (int i = 0; i < n; i++) {
            System.out.println(
                    "Height = " + height[i] +
                    " cm, Weight = " + weight[i] +
                    " kg, BMI = " + bmi[i] +
                    ", Status = " + status[i]);
        }
    }
}
