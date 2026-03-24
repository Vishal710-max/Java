package OOPS.Constructor;

public class OverloadingOfConstructor {

    // Constructor Overloading Multiple constructors are defined in same class with different task
    OverloadingOfConstructor() {
        System.out.println("Default Constructor..");
    }
    OverloadingOfConstructor(String name) {
        System.out.println(name + " Constructor..");
    }

    public static void main(String[] args) {
        OverloadingOfConstructor obj1 = new OverloadingOfConstructor(); // Default constructor call
        OverloadingOfConstructor obj2 = new OverloadingOfConstructor("Parameterized"); // Parameterized constructor call

        // Output =>
        // Default Constructor..
        // Parameterized Constructor..
    }
}
