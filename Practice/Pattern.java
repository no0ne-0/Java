package Practice;

public class Pattern {

    // 1. Normal Star Pattern
    /*
     * Prints:
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

    // 2. Hollow Rectangle Pattern
    /*
     * For input (row = 4, col = 5), prints:
     * *****
     * * *
     * * *
     * *****
     */
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

    // 3. Inverted Half Pyramid with Stars (Right-aligned)
    /*
     * For input (row = 4, col = 4), prints:
     * *
     * **
     * ***
     * ****
     */
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

    // 4. Inverted Half Pyramid with Numbers
    /*
     * For input (row = 4, col = 4), prints:
     * 1234
     * 123
     * 12
     * 1
     */
    public static void inverted_half_pyramid_with_numbers(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 1; j <= col - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 5. Floyd's Triangle
    /*
     * For input (row = 4), prints:
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     */
    public static void floyd_triangle(int row, int col) {
        int count = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // 6. 0-1 Triangle Pattern
    /*
     * For input (row = 5), prints:
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     */
    public static void zero_one(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // 7. Butterfly Pattern
    /*
     * For input (row = 4), prints:
     * * *
     * ** **
     * *** ***
     * ********
     * ********
     * *** ***
     * ** **
     * * *
     */
    public static void butterfly(int row, int col) {
        int spaces;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            spaces = (row - i) * 2;
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            spaces = 2 * (row - i);
            for (int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 8. Solid Rhombus
    /*
     * For input (row = 5), prints:
     * ****
     * ****
     * ****
     * ****
     * ****
     */
    public static void solidRhombus(int row, int col) {
        int spaces;
        for (int i = 1; i <= row; i++) {
            spaces = row - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 9. Hollow Rhombus
    /*
     * For input (row = 5), prints:
     * *****
     * * *
     * * *
     * * *
     * *****
     */
    public static void hollowRhombus(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) { // same as hollow rectangle
                if (i == 1 || j == 1 || j == row || i == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 10. Diamond Pattern
    /*
     * For input (row = 4), prints:
     *
     ***
     *****
     *******
     *******
     *****
     ***
     *
     */
    public static void diamondPattern(int row) {
        int stars;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            stars = (2 * i) - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            stars = (2 * i) - 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowButterfly(int row) {
        // Upper half
        for (int i = 1; i <= row; i++) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces between wings
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Lower half
        for (int i = row; i >= 1; i--) {
            // Left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Spaces between wings
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    // Main method to call all the pattern methods
    public static void main(String[] args) {
        System.out.println("1. Normal Star Pattern");
        normalStar(5);

        System.out.println("\n2. Hollow Rectangle Pattern");
        hollowSquare(4, 5);

        System.out.println("\n3. Inverted Half Pyramid (Right-aligned)");
        inverted_half_pyramid_with_stars(4, 4);

        System.out.println("\n4. Inverted Half Pyramid with Numbers");
        inverted_half_pyramid_with_numbers(4, 4);

        System.out.println("\n5. Floyd's Triangle");
        floyd_triangle(4, 0);

        System.out.println("\n6. 0-1 Triangle Pattern");
        zero_one(5, 4);

        System.out.println("\n7. Butterfly Pattern");
        butterfly(4, 4);

        System.out.println("\n8. Solid Rhombus");
        solidRhombus(5, 0);

        System.out.println("\n9. Hollow Rhombus");
        hollowRhombus(5, 0);

        System.out.println("\n10. Diamond Pattern");
        diamondPattern(4);
        System.out.println("\n10. Hollow Butterfly Pattern");
        hollowButterfly(4);
    }
}
