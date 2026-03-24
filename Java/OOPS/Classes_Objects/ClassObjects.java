package OOPS.Classes_Objects;


/*
1. Definition

# Class
   - A class is a blueprint or template that defines the structure and behavior of objects.
It contains:
   - Fields (Variables) → Store data
   - Methods (Functions) → Define behavior
   - A class does not occupy memory until an object is created.

# Object
   - An object is an instance of a class.
   - It is a real-world entity with state (data) and behavior (methods).
   - Objects occupy memory when created using the new keyword.

2. Syntax of Class and Object
# Class Syntax

    access_modifier class ClassName {
        // Fields (Variables)
        dataType variableName;

        // Methods (Functions)
        returnType methodName(parameters) {
              // Method body
        }
     }

# Object Creation Syntax

      ClassName objectName = new ClassName(); // Constructor call

Example =>
*/

class Car {
    // Fields (Attributes)
    String color;
    String model;
    int speed;

    // Method (Behavior)
    void accelerate() {
        speed += 10;
        System.out.println("Car is accelerating. Current speed: " + speed);
    }
}
public class ClassObjects {
    public static void main(String[] args) {
        // Create an object of Car
        Car myCar = new Car();

        // Assign values to fields
        myCar.color = "Red";
        myCar.model = "Tesla Model 3";
        myCar.speed = 0;

        // Call method
        myCar.accelerate(); // Output: Car is accelerating. Current speed: 10
    }
}
