package Operators;

public class LogicalOp {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // Output: false
        System.out.println(a || b); // Output: true
        System.out.println(!a);     // Output: false
        System.out.println(a & b);  // Output: false
        System.out.println(a | b);  // Output: true
        System.out.println(a ^ b);  // Output: true
    }
}
