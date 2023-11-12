import java.util.Arrays;

public class Menu {
    public static void showMenu() {
        int[] arr = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array pré-ordenado: " + Arrays.toString(arr));

        // Bubble Sort
        int[] bubbleSortArr = Arrays.copyOf(arr, arr.length);
        BubbleSort.sort(bubbleSortArr);

        // Insertion Sort
        int[] insertionSortArr = Arrays.copyOf(arr, arr.length);
        InsertionSort.sort(insertionSortArr);

        // Quick Sort
        int[] quickSortArr = Arrays.copyOf(arr, arr.length);
        QuickSort.sort(quickSortArr, 0, quickSortArr.length - 1);
        System.out.println("Resultado final do Quick Sort: " + Arrays.toString(quickSortArr));
    }
}
