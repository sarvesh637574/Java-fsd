package practiceproject4;
import java.util.Arrays;
public class SelectionSort {
	public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort = {64, 25, 12, 22, 11};

        System.out.println("Original array: " + Arrays.toString(arrayToSort));

        selectionSort(arrayToSort);

        System.out.println("Sorted array: " + Arrays.toString(arrayToSort));

	}

}
