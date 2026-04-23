package OOPS.Constructor;

/*
1. Definition
A constructor in Java is a special method that:
     - Has the same name as its class
     - Is automatically called when an object is created (new keyword)
     - Used to initialize object state (set initial values)
     - Has no return type (not even void)

2. Key Characteristics

✔ Name must match class name
✔ No return type specified
✔ Can be overloaded (multiple constructors)
✔ Automatically invoked during object creation
✔ If not defined, Java provides a default constructor

3. Types of Constructors

(1) Default Constructor
- Provided by Java if no constructor is defined
- Takes no parameters
- Initializes fields to default values (0, null, false)

Syntax =>
class className {
    datatype varName;

    className() {
      // Body of Constructor (Default)
    }
}

*/
public class Constructor_Default {
    Constructor_Default() {
        System.out.println("Default Constructor..");
    }

    public static void main(String[] args) {
        Constructor_Default obj = new Constructor_Default();     // Default Constructor call
        // Output =>
        // Default Constructor..
    }
}
