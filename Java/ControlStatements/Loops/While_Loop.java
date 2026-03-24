package ControlStatements.Loops;

// Syntax
/*
  while (condition) {
        // Code to repeat
  }
*/
public class While_Loop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Count: " + i);
            i++;
        }
    }
}

// Output =>
// Count: 1
// Count: 2
// Count: 3
// Count: 4
// Count: 5