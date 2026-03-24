package OOPS.this_Keyword;

/*
# The this Keyword
   - The this keyword is a reference variable in Java that refers to the current object of a class. It's used to resolve ambiguity between instance variables and parameters,
     to invoke current class methods/constructors, and to pass the current object as an argument.

# 6 Key Uses of this Keyword
   1. Resolving Variable Shadowing
   2. Invoking Current Class Method
   3. Invoking Current Class Constructor (Constructor Chaining)
   4. Passing Current Object as Argument
   5. Returning Current Object (Method Chaining)
   6. In Event Handling (Anonymous Classes)

Simple Ex. =>
*/

// 1. Resolving Variable Shadowing

class Take {
    String name;

    void show(String name) {
        this.name = name;
        System.out.println("Name is: " + this.name);
    }
}
public class This {
    public static void main(String[] args) {
        Take obj = new Take();
        obj.show("ABC");   // Output: Name is: ABC
    }
}
