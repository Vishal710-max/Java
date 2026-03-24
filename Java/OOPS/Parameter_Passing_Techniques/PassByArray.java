package OOPS.Parameter_Passing_Techniques;

public class PassByArray {
    public static void modifyArray(int[] arr) {
        arr[0] = 100;  // Modifies the original array
        arr = new int[]{5, 6, 7};  // Does not affect the original reference
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println("Before: " + numbers[0]);  // 1
        modifyArray(numbers);
        System.out.println("After: " + numbers[0]);   // 100 (not 5)
    }
}
