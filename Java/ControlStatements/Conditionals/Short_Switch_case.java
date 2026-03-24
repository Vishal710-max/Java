package ControlStatements.Conditionals;

import java.util.Scanner;

public class Short_Switch_case {
    public static void main(String[] args) {
        System.out.print("Enter day number (1-7): ");

        switch (new Scanner(System.in).nextInt()) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid input");
        }
    }
}
