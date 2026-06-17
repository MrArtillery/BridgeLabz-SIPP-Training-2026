import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {

        int eachChild = chocolates / children;
        int remaining = chocolates % children;

        return new int[]{eachChild, remaining};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each Child Gets = " + result[0]);
        System.out.println("Remaining Chocolates = " + result[1]);
    }
}
