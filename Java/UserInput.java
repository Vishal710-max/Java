import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int take = sc.nextInt();
        sc.nextLine();  // Consume leftover newline
        System.out.println("This is number: " + take);
        // Enter any number: 100
        // This is number: 100

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("This is your name: " + name);
        // Enter your name: Shreyash
        // This is your name: Shreyash
    }
}
