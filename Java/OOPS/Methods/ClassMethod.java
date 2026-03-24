package OOPS.Methods;

/*
2. Class Methods (Static Methods)
Definition
    - Belong to the class itself, not instances.
    - Declared with the static keyword.
    - Can be called without creating an object.
    - Can only access static variables and other static methods.

Key Features
✔ Called using class name (e.g., ClassName.method()).
✔ Cannot access instance variables/methods directly.
✔ Used for utility functions (e.g., Math.sqrt()).

Example =>
*/
public class ClassMethod {
    // Static variable
    static final double PI = 3.14159;
    int var = 100;    // Instance variable

    // Static method (can access only static members)
    static double calculateCircleArea(double radius) {
        // System.out.println(var);   // Instance variable can not accessed inside static method Error
        return PI * radius * radius;
    }
    public static void main(String[] args) {
        // Call static method without creating an object
        double area = ClassMethod.calculateCircleArea(5.0);
        System.out.println("Area: " + area); // Output: Area: 78.53975
    }
}
