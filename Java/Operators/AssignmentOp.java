package Operators;

public class AssignmentOp {
    public static void main(String[] args) {
        int a = 10;
        a += 5;  // a = 15 (10 + 5)
        a -= 3;  // a = 12 (15 - 3)
        a *= 2;  // a = 24 (12 * 2)
        System.out.println(a); // 24

        // Multiple assignment
        int x, y, z;
        x = y = z = 100;  // All variables get value 100
        System.out.println(x);   // 100
        System.out.println(y);   // 100
        System.out.println(z);   // 100
    }
}
