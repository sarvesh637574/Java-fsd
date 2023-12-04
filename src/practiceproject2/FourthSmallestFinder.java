package practiceproject2;
import java.util.Arrays;

public class FourthSmallestFinder {
	 public static int findFourthSmallest(int[] array) {
	        if (array.length < 4) {
	            System.out.println("Array has less than four elements.");
	            return -1;
	        }

	        Arrays.sort(array);
	        return array[3]; 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray = {8, 3, 11, 5, 7, 2, 10, 1};
        int fourthSmallest = findFourthSmallest(unsortedArray);

        if (fourthSmallest != -1) {
            System.out.println("The fourth smallest element is: " + fourthSmallest);

	}
	}
}
