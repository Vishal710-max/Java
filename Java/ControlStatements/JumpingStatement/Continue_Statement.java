package ControlStatements.JumpingStatement;

public class Continue_Statement {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 4 || i == 5 || i == 6) {
                i ++;
                continue; // continue the block of code according to the condition
            }
            System.out.println(i);
            i++;
        }
    }
}

// Output =>
// 0
// 1
// 2
// 3
// 7
// 8
// 9