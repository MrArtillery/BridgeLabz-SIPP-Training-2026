public class RandomNumberStatistics {

    static int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }

        return arr;
    }

    static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {

            sum += num;

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return new double[]{
                (double) sum / numbers.length,
                min,
                max
        };
    }

    public static void main(String[] args) {

        int[] arr = generate4DigitRandomArray(5);

        for (int num : arr)
            System.out.print(num + " ");

        System.out.println();

        double[] result = findAverageMinMax(arr);

        System.out.println("Average = " + result[0]);
        System.out.println("Min = " + (int) result[1]);
        System.out.println("Max = " + (int) result[2]);
    }
}
