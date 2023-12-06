package practiceproject6;
import java.util.Arrays;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {64, 34, 25, 12, 22, 11, 90};

	        System.out.println("Original array: " + Arrays.toString(array));

	        insertionSort(array);

	        System.out.println("Sorted array: " + Arrays.toString(array));
	    }

	    static void insertionSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;

	            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }

	}

}
