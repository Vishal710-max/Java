package ControlStatements.Conditionals;

import java.util.*;
public class If_Else_Statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = input.nextInt();
        if (a > 18) {
            System.out.println("Age > than 18");
        } else {
            System.out.println("Age < than 18");
        }

    }
}

// Output =>
//Enter your age: 17
//Age < than 18