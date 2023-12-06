package practiceproject3;

public class ExponentialSearch {
	public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0; // Target found at the first element
        }

        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i *= 2; // Double the index

            if (i >= arr.length) {
                i = arr.length - 1;
            }
        }

        return binarySearch(arr, target, i / 2, Math.min(i, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Adjust the search range to the right half
            } else {
                right = mid - 1; // Adjust the search range to the left half
            }
        }

        return -1; // Target not found
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetValue = 3;

        int result = exponentialSearch(sortedArray, targetValue);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

	}

}
