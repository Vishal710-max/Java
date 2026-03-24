package ControlStatements.Loops;

/*
Syntax =>
do {
   // Code to repeat
}while (condition);

 */
public class Do_While_Loop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Count " + i);
            i ++;
        } while (i < 5);
    }
}

// Output =>
// Count 0
// Count 1
// Count 2
// Count 3
// Count 4
