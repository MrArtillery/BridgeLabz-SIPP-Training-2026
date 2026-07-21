import java.util.Scanner;

public class StarBrightnessSearch {

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    // Search in Rotated Sorted Array
    public static int searchRotated(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[low] <= arr[mid]) {

                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;

            } else {

                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    // First Occurrence
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return ans;
    }

    // Last Occurrence
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return ans;
    }

    // Find Minimum in Rotated Array
    public static int findMinimum(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        return arr[low];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of brightness values: ");
        int n = sc.nextInt();

        int[] brightness = new int[n];

        System.out.println("Enter sorted brightness values:");
        for (int i = 0; i < n; i++) {
            brightness[i] = sc.nextInt();
        }

        System.out.print("Enter target brightness: ");
        int target = sc.nextInt();

        int index = binarySearch(brightness, target);

        if (index != -1)
            System.out.println("Binary Search Index = " + index);
        else
            System.out.println("Brightness not found.");

        System.out.println("First Occurrence = "
                + firstOccurrence(brightness, target));

        System.out.println("Last Occurrence = "
                + lastOccurrence(brightness, target));

        // Example rotated array
        int[] rotated = {40, 50, 60, 70, 10, 20, 30};

        System.out.println("Search in Rotated Array = "
                + searchRotated(rotated, 20));

        System.out.println("Minimum Element = "
                + findMinimum(rotated));

        sc.close();
    }
}
