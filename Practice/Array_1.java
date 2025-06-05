import java.util.Arrays;

public class Array_1 {

    public static void covert_to_anArry(int n) {
        String temp = Integer.toString(n);
        int converted_Arr[] = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            converted_Arr[i] = temp.charAt(i) - '0'; // convert char digit to int
        }

        System.out.println(Arrays.toString(converted_Arr));
    }

    public static void largest_in_array(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }

    public static void second_largest_in_array(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    public static void remove_Duplicate_from_sorted_array(int arr[]) {
        if (arr.length == 0)
            return;

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Print unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse_array(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void consecutive_pair(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.err.println();
        }
    }

    public static void printAllSubarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    if (k != j)
                        System.out.print(", ");
                }
                System.out.print("] ");
            }
        }
    }

    public static void isSorted(int arr[]) {
        boolean isAscending=false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending=true;
         
                break;
            }
        }
        if (isAscending) {
            System.out.println("Array not sorted");
        }else{
            System.out.println("Array Is  Sorted");
        }
 
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        isSorted(arr);
    }
}
