import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Iteração do Bubble Sort " + (i + 1) + ": " + Arrays.toString(arr));
        }
        System.out.println("Resultado final do Bubble Sort: " + Arrays.toString(arr));
    }
}
