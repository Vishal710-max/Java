package Arrays.TwoD_Array;

/*
A 2D array (matrix) is an array of arrays, where each element is itself an array.
It is used to represent tables, grids, or matrices.

Syntax:
datatype[][] arrayName;          // Preferred
datatype arrayName[][];          // Also valid (C-style)

Ways to Initialize a 2D Array:
Method	                                 Example
1. Declare first, initialize later	         int[][] matrix;
                                             matrix = new int[3][4];
2. Declare + Initialize (empty)	             int[][] matrix = new int[3][4];
3. Declare + Initialize (with values)	     int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
4. Jagged Array (rows of different lengths)  int[][] jagged = new int[3][];
                                             jagged[0] = new int[2];
                                             jagged[1] = new int[3];
*/
public class TwoD_array {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[0][0]);  // 1 (First row, first column)
        System.out.println(matrix[1][2]);  // 6 (Second row, third column)
        matrix[2][1] = 10;  // Modify element
        System.out.println(matrix[2][1]);  // 10

        System.out.println("Array Elements: ");
        for (int[] i : matrix) {
            for (int j : i)
                System.out.print("  " + j);
            System.out.println();
        }
        // Output =>
        // Array Elements:
        // 1  2  3
        // 4  5  6
        // 7  10  9

        // 2D array length
        System.out.println("Length of 2D array: " + matrix.length * matrix[0].length);
        // Length of 2D array: 9
    }


}
