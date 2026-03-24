package Arrays.Jagged_Arrays;
import java.util.Scanner;

public class Dynamic_Jagged_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] jagged = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter columns for row " + i + ": ");
            int cols = sc.nextInt();
            jagged[i] = new int[cols];

            System.out.print("Enter " + cols + " elements: ");
            for (int j = 0; j < cols; j++) {
                jagged[i][j] = sc.nextInt();
            }
        }

        System.out.println("Jagged array:");
        for (int[] row : jagged) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// Output =>
// Enter number of rows: 3
// Enter columns for row 0: 2
// Enter 2 elements: 10 20
// Enter columns for row 1: 2
// Enter 2 elements: 40 50
// Enter columns for row 2: 1
// Enter 1 elements: 100
// Jagged array:
// 10 20
// 40 50
// 100