import java.util.Scanner;

public class FlightTicketQuickSort {

    // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];   // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] prices = new int[n];

        // Input ticket prices
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Sort using Quick Sort
        quickSort(prices, 0, n - 1);

        // Print sorted prices
        for (int i = 0; i < n; i++) {
            System.out.print(prices[i] + " ");
        }

        sc.close();
    }
}
