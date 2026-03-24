package Arrays.TwoD_Array;
import java.util.Scanner;

public class Dynamic_2D_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of rows and columns: ");
        int row = input.nextInt(), col = input.nextInt();

        int[][] matrix = new int[row][col];

        System.out.print("Enter " + row * col + " Elements: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                matrix[i][j] = input.nextInt();

        System.out.println("Matrix (2D array) Elements: ");
        for (int[] i : matrix) {
            for (int j : i)
                System.out.print("  " + j);
            System.out.println();
        }
    }
}

// Output =>
// Enter the size of rows and columns: 3 3
// Enter 9 Elements: 1 2 3 4 5 6 7 8 9
// Matrix (2D array) Elements:
//        1  2  3
//        4  5  6
//        7  8  9
