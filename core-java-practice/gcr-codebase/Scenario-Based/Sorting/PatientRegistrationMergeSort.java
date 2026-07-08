import java.util.Scanner;

public class PatientRegistrationMergeSort {

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

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

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

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] ids = new int[n];

        // Input patient IDs
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        // Sort using Merge Sort
        mergeSort(ids, 0, n - 1);

        // Print sorted IDs
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(ids[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
