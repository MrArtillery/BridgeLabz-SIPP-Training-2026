public class MathWizard {

    // Instance variable
    int instanceVar = 100;

    boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Overloaded method
    double factorial(double n) {
        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    void fibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println();
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    void showScope() {
        // Local variable
        int localVar = 50;

        System.out.println("Instance Variable = " + instanceVar);
        System.out.println("Local Variable = " + localVar);
    }

    public static void main(String[] args) {

        MathWizard mw = new MathWizard();

        System.out.println("Prime Check: " + mw.isPrime(17));

        System.out.println("Factorial (int): " + mw.factorial(5));

        System.out.println("Factorial (double): " + mw.factorial(5.0));

        mw.fibonacci(10);

        System.out.println("GCD = " + mw.gcd(12, 18));

        System.out.println("LCM = " + mw.lcm(12, 18));

        System.out.println("Power = " + mw.power(2, 5));

        mw.showScope();
    }
}