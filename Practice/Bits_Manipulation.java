import java.util.Arrays;

public class Bits_Manipulation {

    static void odd_even(int n) {
        if ((n & 1) == 1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }

    static void getBit(int n, int pos) {
        int bitmask = 1 << pos;
        System.out.println((n & bitmask) != 0 ? 1 : 0);
    }

    static void setBit(int n, int pos) {
        int bitmask = 1 << pos;
        System.out.println(n | bitmask);
    }

    static void clearBit(int n, int pos) {
        int bitmask = ~(1 << pos);

        System.out.println(~n & bitmask);
    }

    static void updateBit(int n, int pos, int bit) {
        int bitmask = 1 << pos;
        if (bit == 1) {
            System.out.println(n | bitmask);
        } else {
            System.out.println(n & ~bitmask);
        }
    }

    static void clearLast(int n, int pos) {
        int bitmask = -1 << pos;
        System.out.println(n & bitmask);
    }

    static void clearRangeBits(int n, int from, int to) {
        int a = ~0 << to + 1;
        int b = (1 << from) - 1;
        int bitmask = a | b;
        System.out.println(n & bitmask);
    }

    static void power_of_two(int n) {
        System.out.println((n & (n - 1)) == 0);
    }

    static void count_set_bits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("Set bits count: " + count);
    }

    static void minimum_flip(int a, int b) {
        int min = 0;
        while (a > 0 && b > 0) {
            if (!(((a & 1) == 1) == ((b & 1) == 1) || ((a & 0) == 0) == ((b & 0) == 0))) {
                min++;
            }
            a = a >> 1;
            b = b >> 1;

        }
        System.out.println(min);
    }

    static void non_repeating_element(int arr[]) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

        int lsb = xor & -xor;

        int num1 = 0, num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & lsb) != 0) {
                num1 ^= arr[i];
            } else {
                num2 ^= arr[i];
            }
        }

        System.out.println("The two non-repeating elements are: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 1, 9, 9 };
        non_repeating_element(arr);
    }
}
