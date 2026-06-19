public class TemplePuzzle {

    static int moveCount = 0;

    // Tower of Hanoi
    static void towerOfHanoi(int n, char source, char auxiliary, char destination) {

        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    // Recursive Binary Search
    static int binarySearch(int[] arr, int low, int high, int key) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;

        if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);

        return binarySearch(arr, mid + 1, high, key);
    }

    // Sum of Digits
    static int sumOfDigits(int n) {

        if (n == 0)
            return 0;

        return n % 10 + sumOfDigits(n / 10);
    }

    // Reverse String
    static String reverseString(String str) {

        if (str.isEmpty())
            return str;

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // Balanced Parentheses Without Stack
    static boolean isBalanced(String str, int count, int index) {

        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        if (str.charAt(index) == '(')
            return isBalanced(str, count + 1, index + 1);

        if (str.charAt(index) == ')')
            return isBalanced(str, count - 1, index + 1);

        return isBalanced(str, count, index + 1);
    }

    public static void main(String[] args) {

        // Tower of Hanoi
        int n = 3;
        System.out.println("Tower of Hanoi Steps:");
        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500};
        int index = binarySearch(prices, 0, prices.length - 1, 400);
        System.out.println("\nBinary Search Result Index = " + index);

        // Sum of Digits
        System.out.println("Sum of Digits = " + sumOfDigits(1234));

        // Reverse String
        System.out.println("Reversed String = " + reverseString("Temple"));

        // Balanced Parentheses
        String exp = "((()))";
        System.out.println("Balanced Parentheses = "
                + isBalanced(exp, 0, 0));
    }
}