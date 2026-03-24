package ControlStatements.Conditionals;
import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any day:");
        int take = input.nextInt();

        switch(take) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thersday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturaday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
