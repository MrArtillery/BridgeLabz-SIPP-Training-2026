import java.util.Scanner;

public class KingdomTaxSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Single Citizen
        System.out.print("Enter Citizen Income: ");
        double income = sc.nextDouble();

        double tax = 0;
        String bracket = "";

        if (income < 10000) {
            tax = income * 0.05;
            bracket = "5% Tax Bracket";
        } else if (income <= 50000) {
            tax = income * 0.15;
            bracket = "15% Tax Bracket";
        } else {
            tax = income * 0.30;
            bracket = "30% Tax Bracket";
        }

        System.out.println("Tax Bracket: " + bracket);
        System.out.println("Tax Amount: " + tax);

        // Extension: 10 Citizens
        double[] incomes = {
                8000, 12000, 25000, 60000, 45000,
                9000, 70000, 30000, 15000, 55000
        };

        double totalTax = 0;

        for (double inc : incomes) {

            if (inc < 10000) {
                totalTax += inc * 0.05;
            } else if (inc <= 50000) {
                totalTax += inc * 0.15;
            } else {
                totalTax += inc * 0.30;
            }
        }

        System.out.println("\nTotal Tax Collected from 10 Citizens = " + totalTax);

        sc.close();
    }
}