package ControlStatements.JumpingStatement;

public class Break_Statement {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            if (i == 5) break; // Break can break the loop and jump outside the loop
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
// Hello