import java.util.Scanner;

public class EmployeeSalaryMergeSort {

    // Merge Sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge function
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge temp arrays back into original array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of employees
        int n = sc.nextInt();

        int[] salaries = new int[n];

        // Input salaries
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        // Sort using Merge Sort
        mergeSort(salaries, 0, n - 1);

        // Output sorted salaries
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(salaries[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
