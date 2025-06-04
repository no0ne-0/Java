

public class Factorial {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 2; i--) {
            fact = fact * i;
        }
        return fact;

    }

    public static void main(String[] args) {
        System.out.print("factorial of given number is: ");
        System.out.print(factorial(5));
    }
}