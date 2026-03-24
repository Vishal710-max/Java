package Operators;

public class ComparisonOp {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println(a == b);  // false (10 ≠ 5)
        System.out.println(a != b);  // true (10 ≠ 5)
        System.out.println(a > b);   // true (10 > 5)
        System.out.println(a < b);   // false (10 ≮ 5)
        System.out.println(a >= 10); // true (10 ≥ 10)
        System.out.println(b <= 5);  // true (5 ≤ 5)
    }
}
