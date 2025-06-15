
import java.util.Scanner;

public class Practice {

    public static int product(int a, int b) {
        return a * b;
    }

    static void power_of_two(int n) {
        if (n <= 0) {
            System.out.println(false);
            return;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                System.out.println(false);
                return;
            }
            n = n / 2;
        }

        System.out.println(true);
    }

    public static void main(String[] args) {
        int number = product(10, 2);
        System.out.println(number);

    }
}