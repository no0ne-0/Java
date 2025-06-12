import java.util.Arrays;
import java.util.*;

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
        boolean isAscending = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = true;
                break;
            }
        }
        if (isAscending) {
            System.out.println("Array not sorted");
        } else {
            System.out.println("Array Is  Sorted");
        }

    }

    public static void buy_sell_stocks(int arr[]) {
        int bestBuy = arr[0];
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (maxProfit < arr[i] - bestBuy) {
                maxProfit = arr[i] - bestBuy;
            }
            if (bestBuy > arr[i]) {
                bestBuy = arr[i];
            }

        }
        System.out.println(maxProfit);

    }

    public static void max_water_level(int arr[]) {
        int maxHold = 0;
        // Brute Force
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // int width = j - i;
        // int height = Math.min(arr[i], arr[j]);
        // int waterHold = width * height;
        // maxHold = Math.max(maxHold, waterHold);

        // }
        // }
        // System.out.println(maxHold);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int waterHold = width * height;
            maxHold = Math.max(maxHold, waterHold);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }

        }

        System.out.println(maxHold);

    }

    public static void max_subArray_sum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    sum += arr[k];
                    if (k < j)
                        System.out.print(",");
                }
                System.out.print("] ");
                maxSum = Math.max(maxSum, sum);
            }
            System.out.println();
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void max_subArray_sum_kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cs = cs + arr[i];
            if (arr[i] < 0) {
                cs = 0;
            }
            maxSum = Math.max(cs, maxSum);

        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 10, 2, 3, 0, 10 };
        max_subArray_sum_kadanes(arr);
    }
}
