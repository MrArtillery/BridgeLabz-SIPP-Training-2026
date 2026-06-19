public class ConsecutiveSensorReadings {

    static boolean isIncreasing(int[] arr, int index) {

        // Base Case
        if (index == arr.length - 1) {
            return true;
        }

        // Check current pair
        if (arr[index] >= arr[index + 1]) {
            return false;
        }

        // Recursive Call
        return isIncreasing(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] readings1 = {12, 15, 18, 22, 30};
        int[] readings2 = {12, 15, 14, 22};

        System.out.println(isIncreasing(readings1, 0));
        System.out.println(isIncreasing(readings2, 0));
    }
}
