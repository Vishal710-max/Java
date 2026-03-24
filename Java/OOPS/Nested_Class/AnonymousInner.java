package OOPS.Nested_Class;

/*
4. Anonymous Inner Class
   - A class without a name, used for interfaces/abstract classes.
   - Anonymous inner classes are a powerful feature in Java that allow you to declare and instantiate a class at the same time without giving it an explicit name.
     They are particularly useful for implementing interfaces or extending classes on the fly.

   - Object Creation Syntax:
      Interface obj = new Interface() {
           // Override methods
      };

Key Characteristics
   - No Class Name: They don't have a formal class name.
   - Single-Use: Typically used for one-time implementations.
   - Syntax: Defined and instantiated in a single expression.
   - Scope: Can access final or effectively final variables from the enclosing scope.
   - Limitation: Can't have static members or explicit constructors.

   - Syntax Structure
     InterfaceOrClass obj = new InterfaceOrClass() {
         // Implementation of methods
         @Override
         public void method() {
            // Custom implementation
         }
     };

    - When to Use Anonymous Inner Classes?
     ✔️ Implementing interfaces with few methods (e.g., Runnable, Comparator)
     ✔️ Extending abstract classes with minimal modifications
     ✔️ Event handling in Swing/AWT
     ✔️ Quick implementations without creating separate class files


*/

// Using Interface
interface Greeting {
    void greet();
}

// Abstract Class
abstract class Animal {
    abstract void sound();
}

public class AnonymousInner {
    public static void main(String[] args) {

        // Anonymous Inner Class using interface
        Greeting obj = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        obj.greet(); // Output: Hello from Anonymous Class!


        // Anonymous Inner Class using Abstract Class
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Bark!");
            }
        };
        dog.sound(); // Output: Bark!


        // Runnable Interface
        final int count = 5;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in anonymous Runnable!");
                System.out.println("Count: " + count); // OK
                // count++; // ERROR - count must be final
            }
        };
        // Thread t = new Thread(r);
        // t.start(); // Output: Running in anonymous Runnable!

        new Thread(r).start();
        // Output =>
        // Running in anonymous Runnable!
        // Count: 5
    }
}
