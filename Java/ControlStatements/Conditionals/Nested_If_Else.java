package ControlStatements.Conditionals;

import java.util.Scanner;

public class Nested_If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st num: ");
        int a = input.nextInt();
        System.out.print("Enter 2nd num: ");
        int b = input.nextInt();
        System.out.print("Enter 3rd num: ");
        int c = input.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("A is largest");
            } else {
                System.out.println("C is largest");
            }
        } else {
            if (b > c) {
                System.out.println("B is largest"); // This executes (20 > 15)
            } else {
                System.out.println("C is largest");
            }
        }
    }
}

//Output =>
// Enter 1st num: 10
// Enter 2nd num: 20
// Enter 3rd num: 30
// C is largest
