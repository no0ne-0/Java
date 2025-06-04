

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        int c;
        for (int i = 3; i <= num; i++) {

            c = a + b;
            System.out.print(c);
            System.out.print(" ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
