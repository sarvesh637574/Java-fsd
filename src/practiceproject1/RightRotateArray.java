package practiceproject1;

public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        int steps = 5;

        System.out.println("Original Array: " + java.util.Arrays.toString(x));

        rightRotateArray(x, steps);

        System.out.println("Array after right rotation: " + java.util.Arrays.toString(x));
    }

    private static void rightRotateArray(int[] arr, int steps) {
        int n = arr.length;
        steps = steps % n; // in case steps is greater than array length
        int[] temp = new int[steps];
        System.arraycopy(arr, n - steps, temp, 0, steps);
        System.arraycopy(arr, 0, arr, steps, n - steps);
        System.arraycopy(temp, 0, arr, 0, steps);

	}

}
