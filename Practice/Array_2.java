public class Array_2 {

    public static void spiral_matrix(int arr[][]) {
        boolean isAscending = false;
        int row_start = 0;
        int col_start = 0;
        int col_end = arr.length - 1;
        int row_end = arr.length - 1;

        while (row_start <= row_end) { // equal to is for odd matrix 3*
            // top boundary
            for (int i = col_start; i <= col_end; i++) {
                System.out.print(arr[row_start][i]);
                System.out.print(",");
            }
            // right boundary
            for (int i = row_start + 1; i <= row_end; i++) {
                System.out.print(arr[i][col_end]);
                System.out.print(",");
            }
            // bottom boundary
            for (int i = col_end - 1; i >= col_start; i--) {
                if (row_start == row_end) { // for 3*5 matrix
                    break;
                }
                System.out.print(arr[row_end][i]);
                System.out.print(",");
            }
            // left boundary
            for (int i = row_end - 1; i >= row_start + 1; i--) {
                if (col_start == col_end) { // for 3*5 matrix
                    break;
                }
                System.out.print(arr[i][col_start]);
                System.out.print(",");
            }
            row_start++;
            col_start++;
            row_end--;
            col_end--;
        }

    }

    public static void diagnol_sum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr.length - i - 1 == i)) {
                sum = sum + arr[i][i] + arr[i][arr.length - i - 1];
            }

        }
        System.out.println(sum);
    }

    public static void searchKey(int[][] arr, int key) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Found at (" + row + ", " + col + ")");
                return;
            }
            if (key > arr[row][col]) {
                row++;
            } else {
                col--;
            }
        }

        System.out.println("Key not found");
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
        searchKey(arr, 10);
    }
}
