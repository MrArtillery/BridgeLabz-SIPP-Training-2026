public class WarehouseStock {

    public static void main(String[] args) {

        int[] stock = {10, 20, 15, 20, 30, 15};
        int totalStock = 0;

        int max = stock[0];
        int min = stock[0];

        // Max, Min, Total Stock
        for (int i = 0; i < stock.length; i++) {

            if (stock[i] > max)
                max = stock[i];

            if (stock[i] < min)
                min = stock[i];

            totalStock += stock[i];
        }

        System.out.println("Maximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + totalStock);

        // Detect Duplicates
        System.out.println("\nDuplicate Quantities:");

        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {

                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    break;
                }
            }
        }

        // Rotate Array by k positions
        int k = 2;
        int n = stock.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.println("\nRotated Array:");

        for (int num : rotated) {
            System.out.print(num + " ");
        }

        // 2D Shelf Grid Transpose
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n\nTranspose of Shelf Grid:");

        for (int i = 0; i < shelf[0].length; i++) {
            for (int j = 0; j < shelf.length; j++) {
                System.out.print(shelf[j][i] + " ");
            }
            System.out.println();
        }
    }
}