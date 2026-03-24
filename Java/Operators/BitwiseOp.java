package Operators;

public class BitwiseOp {
    public static void main(String[] args) {
        System.out.println(5 & 3); // Output: 1
        System.out.println(5 | 3); // Output: 7
        System.out.println(5 ^ 3); // Output: 6
        System.out.println(~5); // Output: -6
        System.out.println(5 << 1); // Output: 10
        System.out.println(-8 >> 1); // Output: -4
        System.out.println(-8 >>> 1); // Output: 2147483644 (for int)
    }
}
