import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        System.out.println("INSERTION SORT:\n");
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println("Iteração do Insertion Sort " + i + ": " + Arrays.toString(arr));
        }
        System.out.println("\nResultado final do Insertion Sort: " + Arrays.toString(arr) + "\n");
    }
}
