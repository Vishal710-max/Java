package Arrays.Jagged_Arrays;

/*
A jagged array (or ragged array) is an array of arrays where each sub-array can have a different length. Unlike rectangular multidimensional arrays, jagged arrays provide flexibility in memory usage.

1. Declaration & Initialization
Syntax
datatype[][] arrayName = new datatype[rows][];  // Columns left unspecified

Example: Creating a Jagged Array
    int[][] jagged = new int[3][];  // 3 rows, columns undefined

    jagged[0] = new int[2];  // Row 0 has 2 columns
    jagged[1] = new int[3];  // Row 1 has 3 columns
    jagged[2] = new int[1];  // Row 2 has 1 column
*/
public class Jagged_Array {
    public static void main(String[] args) {

        int[][] jagged = {
                {1, 2},       // Row 0 (2 elements)
                {3, 4, 5},    // Row 1 (3 elements)
                {6}           // Row 2 (1 element)
        };

        // 2. Accessing Elements
        // Use row and column indices (jagged[row][col]).

        // Must check bounds since each row has different lengths.

        // Example: Accessing Elements

        System.out.println(jagged[0][1]);  // 2 (Row 0, Column 1)
        System.out.println(jagged[1][2]);  // 5 (Row 1, Column 2)
        System.out.println(jagged[2][0]);  // 6 (Row 2, Column 0)

        System.out.println("Jagged array elements: ");
        for (int i = 0; i < jagged.length; i++) {          // Rows
            for (int j = 0; j < jagged[i].length; j++) {   // Columns in row i
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        // Output =>
        // Jagged array elements:
        // 1 2
        // 3 4 5
        // 6
    }
}
