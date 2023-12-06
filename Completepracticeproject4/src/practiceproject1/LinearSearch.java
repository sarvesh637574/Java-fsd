package practiceproject1;

public class LinearSearch {
	 public static int linearSearch(int[] array, int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i; // Element found, return its index
	            }
	        }
	        return -1; // Element not found
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 8, 9, 1, 6, 4, 7, 3,2};
        int target = 7;

        int result = linearSearch(array, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}


