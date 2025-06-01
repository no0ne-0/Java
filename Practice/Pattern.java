package Practice;

public class Pattern {
    // Normal Star Pattern
    /*
     * 
     * *
     * * *
     * * * *
     * * * * *
     */
    public static void normalStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowSquare(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_stars(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 1; j <= col - i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int row, int col) {
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void zero_one(int row, int col) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {

            }

        }
    }

    public static void main(String[] args) {
        zero_one(5, 4);
    }

}
