package ControlStatements.Loops;
import java.util.Scanner;

public class Do_while_Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Invalid input! Try again.");
            }
        } while (number < 1 || number > 10);  // Repeat until valid

        System.out.println("You entered: " + number);
        scanner.close();
    }
}

// Output =>
// Enter a number between 1 and 10: 0
// Invalid input! Try again.
// Enter a number between 1 and 10: -1
// Invalid input! Try again.
// Enter a number between 1 and 10: 1
// You entered: 1