package Practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string to check for palindrome");
        String input = sc.nextLine();

        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString = reverseString + input.charAt(i);
        }
System.out.println(reverseString);
        
    }

}
