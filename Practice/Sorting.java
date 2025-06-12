import java.util.Arrays;

public class Sorting {

    public static void normalSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubble_sort(int arr[]) {
        // last me dalte chalo sabse bade ko
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) { // -1 isiliye taki out of bound na ho,or -i isiliye kuki last
                                                           // me to sabse bada already pahuch gya hoga
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;   //agar aik baar bhi koi swapping nhi hui iska matlab already sorted
                    
                }
                if (!isSwap) {
                    break;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void insertion_sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void count_sort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int aux_arr[] = new int[max + 1];

        for (int i = 0; i < aux_arr.length; i++) {
            aux_arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i];
            aux_arr[idx] = aux_arr[idx] + 1;
        }
        int j = 0;
        for (int i = 0; i < aux_arr.length; i++) {
            while (aux_arr[i] > 0) {
                arr[j] = i;
                j++;
                aux_arr[i]--;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void selection_sort(int arr[]) { // smallest dhundho then usko i wale ke sath swap phir phle hojyga or
                                                   // then second sorted 2part banenge shuruaati sort then unsorted
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 6, 1, 2, 3, 4, 6, 7, 5, 4, 3, 5, 7, 84, 3, 2 };
        insertion_sort(arr);
    }
}
