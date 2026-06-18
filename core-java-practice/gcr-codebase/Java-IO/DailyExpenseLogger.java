import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            // true = append mode
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("expenses.txt", true));

            bw.write(category + " - " + amount);
            bw.newLine();

            bw.close();

            System.out.println("Expense saved successfully.");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        sc.close();
    }
}
