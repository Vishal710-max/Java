package OOPS.Static;

/*
# Static Blocks
   - Static blocks are a special feature in Java that allow you to initialize static variables or perform one-time setup operations when a class is loaded into memory.
   - Static block has highest priority therefore JVM interprets this block first even before iman( )
     method also.
   - In, Java interpretation, JVM first searches for static block if it is found then JVM executes it
   - Also, Single Java program may contains multiple static blocks

# Key Characteristics of Static Blocks
    - Execution Timing: Runs when the class is first loaded by JVM (before main())
    - One-Time Execution: Runs only once per class, regardless of how many objects are created
    - Order Matters: Multiple static blocks execute in the order they appear
    - No Direct Invocation: Cannot be called explicitly like methods
    - No Return Type: Cannot return values
    - No Parameters: Cannot accept arguments

# Basic Syntax
    static {
        // Initialization code here
    }

# When to Use Static Blocks?
   ✔️ Initialize static variables with complex logic
   ✔️ Load native libraries using System.loadLibrary()
   ✔️ Perform one-time class setup operations
   ✔️ Initialize static maps/collections
   ✔️ Establish database connections (in older approaches)

# When to Avoid Static Blocks?
   ❌ When initialization is simple (use direct assignment)
   ❌ When initialization requires parameters
   ❌ When you need to re-run the initialization logic

*/
public class StaticBlock {
    // Static Variable
    static String driver;

    // Static Block
    static {
        System.out.println("Static block executed");
        driver = "com.mysql.jdbc.Driver";
    }

    // Constructor
    StaticBlock() {
        System.out.println("Constructor runs when object created");
    }

    // Instance Block
    {
        System.out.println("Instance block runs BEFORE each constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println("Driver: " + driver);
        new StaticBlock();
    }
}

// Output =>
// Static block executed
// Main method executed
// Driver: com.mysql.jdbc.Driver
// Instance block runs BEFORE each constructor
// Constructor runs when object created