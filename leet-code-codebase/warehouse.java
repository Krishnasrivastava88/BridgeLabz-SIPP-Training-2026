//A warehouse stores item quantities in an array. Find the max, min,
//total stock, and detect duplicates. Extend: rotate the stock array by
//k positions (simulate daily shift handover), and transpose a 2D shelf
//grid.
public class warehouse {

    public static void findMaxMinTotal(int[] stock) {

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int i = 0; i < stock.length; i++) {

            if (stock[i] > max) {
                max = stock[i];
            }

            if (stock[i] < min) {
                min = stock[i];
            }

            total += stock[i];
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Total = " + total);
    }

    public static void findDuplicates(int[] stock) {

        System.out.print("Duplicates: ");

        for (int i = 0; i < stock.length; i++) {

            for (int j = i + 1; j < stock.length; j++) {

                if (stock[i] == stock[j]) {
                    System.out.print(stock[i] + " ");
                    break;
                }
            }
        }

        System.out.println();
    }
    public static void rotateStock(int[] stock, int k) {
        int rotated[] = new int[stock.length];
        for(int i=0;i<stock.length;i++){
            rotated[i]=stock[(i+k)%stock.length];
        }
        for(int i=0;i<rotated.length;i++){
            System.out.print(rotated[i] + " ");
        }
        System.out.println();
    }
    public static void transposeShelf(int[][] shelf) {
        int transposed[][] = new int[shelf[0].length][shelf.length];
        System.out.println("Transpose Matrix:");
        for(int j = 0; j < shelf[0].length; j++) {
            for(int i = 0; i < shelf.length; i++) {
                System.out.print(shelf[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] stock = {10, 20, 30, 40, 50, 20};

        findMaxMinTotal(stock);
        findDuplicates(stock);
        rotateStock(stock, 2);
        transposeShelf(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}