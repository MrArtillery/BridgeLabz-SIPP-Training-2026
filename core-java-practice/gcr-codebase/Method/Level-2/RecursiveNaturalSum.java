import java.util.Scanner;

public class RecursiveNaturalSum {

    static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum1 = recursiveSum(n);
        int sum2 = formulaSum(n);

        System.out.println("Recursive Sum = " + sum1);
        System.out.println("Formula Sum = " + sum2);

        if (sum1 == sum2)
            System.out.println("Both Results Match");
    }
}
