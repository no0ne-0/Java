public class Conversion {
    // Decimal => Binary
    public static void decimal_to_binary(int n) {
        int[] binary = new int[32];
        int index = 0;

        if (n == 0) {
            System.out.println("0");
            return;
        }

        while (n > 0) {
            binary[index++] = n % 2;
            n = n / 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }

    // Binary => Decimal
    public static void binary_to_decimal(int n) {
        int decimal = 0;
        int pow = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid binary number.");
                return;
            }
            decimal += lastDigit * Math.pow(2, pow);
            pow++;
            n /= 10;
        }

        System.out.println(decimal);
    }

    public static void main(String[] args) {
        decimal_to_binary(2);
    }
}