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

    public static void main(String[] args) {
        int arr[] = { 6, 4, 6, 1, 2, 3, 4, 6, 7, 5, 4, 3, 5, 7, 84, 3, 2 };

        normalSort(arr);
    }
}
