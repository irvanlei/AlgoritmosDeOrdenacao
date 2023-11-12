import java.util.Arrays;

public class QuickSort {
    private static int iterationCount = 1;

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            //A escolha do pivô é feita escolhendo o elemento mais a direita da sub-lista que está sendo ordenada a cada iteração.

            System.out.println("Iteração do Quick Sort " + iterationCount + " - Pivô: " + arr[pi] + ": " + Arrays.toString(arr));

            iterationCount++;

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
