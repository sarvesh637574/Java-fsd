package practiceprojects;
import java.util.Arrays;

public class VerifyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Test array creation and initialization
      int[] array = {1, 2, 3, 4, 5};
      // Test array access
      System.out.println("Element at index 2: " + array[2]);
      // Test array modification
      array[2] = 10;
      System.out.println("Modified element at index 2: " + array[2]);
      // Test array length
      System.out.println("Array length: " + array.length);
      // Test array copying
      int[] newArray = Arrays.copyOf(array, array.length);
      System.out.println("Copied array: " + Arrays.toString(newArray));
      // Test array sorting
      Arrays.sort(array);
      System.out.println("Sorted array: " + Arrays.toString(array));
      int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}};
      System.out.println("Element at row 1, column 2: " + twoDArray[1][2]);

	}

}
