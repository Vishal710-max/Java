package ControlStatements.JumpingStatement;

public class Return_Statement {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            if (i == 5) return; // Return can stop the program Execution here
            i++;
        }
        System.out.println("Hello");
    }
}

// Output =>
// 0
// 1
// 2
// 3
// 4
// 5