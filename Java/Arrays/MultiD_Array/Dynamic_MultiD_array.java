package Arrays.MultiD_Array;
import java.util.Scanner;

public class Dynamic_MultiD_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter depth, no. of rows and columns: ");
        int depth = input.nextInt(), row = input.nextInt(), col = input.nextInt();

        int[][][] cube = new int[depth][row][col];

        System.out.print("Enter " + depth * row * col + " Elements: ");
        for (int i = 0; i < depth; i++)
            for (int j = 0; j < row; j++)
                for (int k = 0; k < col; k++)
                    cube[i][j][k] = input.nextInt();

        System.out.println("MultiD array elements: ");
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++)
                    System.out.print(cube[i][j][k] + "  ");
                System.out.println();
            }
            System.out.println();
        }
    }
}

// Output =>
// Enter depth, no. of rows and columns: 2 2 2
// Enter 8 Elements: 1 2 3 4 5 6 7 8
// MultiD array elements:
// 1  2
// 3  4
//
// 5  6
// 7  8