package ControlStatements.Conditionals;

import java.util.*;
public class If_Else_If_Ladder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();
        if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 80) {
            System.out.println("Grade: B"); // This executes (85 >= 80)
        }
        else if (marks >= 70) {
            System.out.println("Grade: C"); // Skipped
        }
        else if (marks >= 60) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }
    }
}

// Output =>
// Enter your marks: 56
// Grade: F
