import java.util.Scanner;

public class Search_in_array {

    public static void binary_search(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == arr[mid]) {
                System.out.println("Your key is at index: " + mid);
                return;
            }

            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Key not found using binary search.");
    }

    public static void linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Your key is at index: " + i);
                return;
            }
        }
        System.out.println("Key not found using linear search.");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Enter number you want to search:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        System.out.println("Searching using Binary Search:");
        binary_search(arr, key);

        System.out.println("Searching using Linear Search:");
        linear_search(arr, key);

        sc.close();
    }
}
