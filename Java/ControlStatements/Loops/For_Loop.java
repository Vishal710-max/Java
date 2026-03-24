package ControlStatements.Loops;

// Syntax
/*
for (initialization; condition; update) {
        // Code to repeat
}
 */
public class For_Loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}

// Output =>
// Count: 1
// Count: 2
// Count: 3
// Count: 4
// Count: 5