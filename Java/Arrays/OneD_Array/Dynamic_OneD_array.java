package Arrays.OneD_Array;
import java.util.Scanner;

public class Dynamic_OneD_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter " + size + " Elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = input.nextInt();

        // Print array element
        System.out.print("Array Elements: ");
        for (int j : arr) {
            System.out.print("\t" + j);
        }
    }
}

// Output =>
// Enter the size of array: 5
// Enter 5 Elements: 10 20 30 40 50
// Array Elements: 	10	20	30	40	50
