package Arrays.OneD_Array;

/*
Arrays in Java are used to store multiple values of the same type in a single variable.
 They are fixed in size (once created, size cannot be changed).

Syntax:
    datatype[] arrayName;          // Preferred way
    datatype arrayName[];

Ways to Initialize an Array:
Method	                                Example
1. Declare first, initialize later	       int[] nums;
                                           nums = new int[5];
2. Declare + Initialize (empty)	           int[] nums = new int[5];
3. Declare + Initialize (with values)	   int[] nums = {10, 20, 30, 40};
4. Using new with values	               int[] nums = new int[]{10, 20, 30, 40};

*/
public class OneD_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        // Accessing single element
        System.out.println(arr[0]);  // 10
        System.out.println(arr[3]);  // 40

        // Print all array element
        System.out.print("Array Elements: ");
        for (int i : arr) {
            System.out.print("\t" + i);
        }
        // Array Elements:  	10	20	30	40

        // Print array length
        System.out.println("\nArray length: " + arr.length); // Array length: 4


    }
}
