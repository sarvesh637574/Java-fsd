package practiceproject4;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();

        // Input elements for the first matrix
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements for matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();
        
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements for matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible. Number of columns in A must be equal to the number of rows in B.");
            return;
        }
        
        int[][] resultMatrix = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

	}

}
