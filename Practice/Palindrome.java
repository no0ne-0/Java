package Practice;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please input a string to check for palindrome");
        String input = sc.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("This is a palindrome sequence");
        } else {
            System.out.println("This is not a palindrome sequence");
        }
    }
}
