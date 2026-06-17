import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            do {
                System.out.print("Weight: ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Height(cm): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);
        }

        for (int i = 0; i < number; i++) {

            double heightMeter = personData[i][1] / 100.0;

            personData[i][2] =
                    personData[i][0] / (heightMeter * heightMeter);

            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for (int i = 0; i < number; i++) {

            System.out.println(
                    "Weight = " + personData[i][0] +
                    ", Height = " + personData[i][1] +
                    ", BMI = " + personData[i][2] +
                    ", Status = " + weightStatus[i]);
        }
    }
}
