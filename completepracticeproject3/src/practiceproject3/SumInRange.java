package practiceproject3;
import java.util.Scanner;

public class SumInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value of L (0 <= L <= R <= n-1): ");
        int L = scanner.nextInt();
        System.out.print("Enter the value of R (0 <= L <= R <= n-1): ");
        int R = scanner.nextInt();
        if (L < 0 || R < L || R >= n) {
            System.out.println("Invalid range. Please enter a valid range.");
            return;
        }
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sum);

        scanner.close();

	}

}
