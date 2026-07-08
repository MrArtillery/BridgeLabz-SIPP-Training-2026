import java.util.Arrays;
import java.util.Random;

public class LibrarySortingSystem {

    // ---------------- MERGE SORT ----------------
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // O(n) merge step
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // ---------------- QUICK SORT (Lomuto Partition) ----------------
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int[] pivots = partition3Way(arr, low, high);
            quickSort(arr, low, pivots[0] - 1);
            quickSort(arr, pivots[1] + 1, high);
        }
    }

    // 3-way partition with Lomuto style idea
    public static int[] partition3Way(int[] arr, int low, int high) {
        int pivot = arr[high];
        int less = low, i = low, greater = high;

        while (i <= greater) {
            if (arr[i] < pivot) {
                swap(arr, i, less);
                i++;
                less++;
            } else if (arr[i] > pivot) {
                swap(arr, i, greater);
                greater--;
            } else {
                i++;
            }
        }
        return new int[]{less, greater};
    }

    // ---------------- COUNTING SORT ----------------
    public static void countingSort(int[] arr, int maxValue) {
        int[] count = new int[maxValue + 1];

        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = 1; i <= maxValue; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // ---------------- HELPER METHODS ----------------
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] generateRandomYears(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1900 + rand.nextInt(126); // 1900 to 2025
        }
        return arr;
    }

    public static int[] generateRandomGenres(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1 + rand.nextInt(20); // genre codes 1–20
        }
        return arr;
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        int[] sizes = {100, 1000, 10000};

        System.out.println("===== Runtime Comparison =====");

        for (int size : sizes) {
            int[] arr1 = generateRandomYears(size);
            int[] arr2 = Arrays.copyOf(arr1, arr1.length);
            int[] arr3 = generateRandomGenres(size);

            // Merge Sort
            long start = System.nanoTime();
            mergeSort(arr1, 0, arr1.length - 1);
            long end = System.nanoTime();
            long mergeTime = end - start;

            // Quick Sort
            start = System.nanoTime();
            quickSort(arr2, 0, arr2.length - 1);
            end = System.nanoTime();
            long quickTime = end - start;

            // Counting Sort
            start = System.nanoTime();
            countingSort(arr3, 20);
            end = System.nanoTime();
            long countTime = end - start;

            System.out.println("\nSize = " + size);
            System.out.println("Merge Sort Time   : " + mergeTime + " ns");
            System.out.println("Quick Sort Time   : " + quickTime + " ns");
            System.out.println("Counting Sort Time: " + countTime + " ns");
        }

        // Demo of merge step + quick sort + counting sort on sample array
        int[] sample = {2020, 1999, 2010, 2005, 2022, 1980};
        System.out.println("\nOriginal Sample (Years): " + Arrays.toString(sample));

        mergeSort(sample, 0, sample.length - 1);
        System.out.println("After Merge Sort: " + Arrays.toString(sample));

        int[] sampleQuick = {5, 3, 8, 3, 9, 1, 3, 7};
        System.out.println("\nOriginal Sample for Quick Sort: " + Arrays.toString(sampleQuick));
        quickSort(sampleQuick, 0, sampleQuick.length - 1);
        System.out.println("After Quick Sort: " + Arrays.toString(sampleQuick));

        int[] genres = {5, 2, 1, 4, 2, 5, 3, 1, 4};
        System.out.println("\nOriginal Genre Codes: " + Arrays.toString(genres));
        countingSort(genres, 20);
        System.out.println("After Counting Sort: " + Arrays.toString(genres));
    }
}

