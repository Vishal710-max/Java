// Simple Java program demonstrating basic structure and syntax

/*
 * import statements:
 * java.lang package is automatically imported in every Java program,
 * so this import statement is redundant but shown for demonstration
 */
import java.lang.*;

/*
 * Class Declaration:
 * public - Access modifier making this class visible to all other classes
 * class - Keyword to declare a class
 * First - Class name (should start with capital letter by convention)
 * {} - Braces enclose the class body
 */
public class First {
    /*
     * main() method:
     * The JVM starts execution from this method
     *
     * public - Access modifier making it accessible everywhere
     * static - Can be called without creating an instance of the class
     * void - Return type (returns nothing)
     * main - Method name (special name recognized by JVM)
     * String[] args - Parameter: an array of String objects containing command-line arguments
     */
    public static void main(String[] args) {
        /*
         * System.out.println():
         * System - Final class in java.lang package
         * out - Static PrintStream object in System class representing standard output
         * println() - Method to print a line to the output stream
         *
         * This statement prints "Hello, world!" followed by a newline
         */
        System.out.println("Hello, world!");
    }
}