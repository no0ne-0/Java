package Practice;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a);
        System.out.print(b);
        int c;
        for (int i = 1; i <= num - 2; i++) {

            c = a + b;
            System.out.print(c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
