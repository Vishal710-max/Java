package Arrays.MultiD_Array;

/*
Multidimensional arrays are arrays of arrays, extending beyond 2D to represent complex data structures like cubes (3D), tensors (4D+), and more.

Declaration & Initialization
Syntax
datatype[][][] arrayName = new datatype[depth][rows][cols];

Example: 2x3x4 array (depth=2, rows=3, cols=4)
int[][][] cube = new int[2][3][4];
*/
public class MultiD_array {
    public static void main(String[] args) {
        int[][][] cube = {
                {
                    {1, 2},
                    {3, 4}
                },    // Depth 0
                {
                    {5, 6},
                    {7, 8}
                }     // Depth 1
        };
        System.out.println(cube[0][1][0]);  // 3 (depth=0, row=1, col=0)
        cube[1][0][1] = 10;  // Modify element

        // Print all elements
        System.out.println("3D array elements");
        for (int[][] i : cube ) {
            for (int [] j : i) {
                for (int ele : j)
                    System.out.print(ele + "  ");
                System.out.println();
            }
            System.out.println();
        }
        // Output =>
        // 3D array elements
        // 1  2
        // 3  4

        // 5  10
        // 7  8

        // Length of array
        System.out.println("Length of array: " + cube.length * cube[0].length * cube[0][0].length);
    }
}
