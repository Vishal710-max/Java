package OOPS.Nested_Class;

/*
1. Static Nested Class
  - Declared with static.
  - Can access only static members of the outer class.

  - Object Creation Syntax:
     OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
*/

class Outer {
    static int x = 10;

    static class Inner {
        void display() {
            System.out.println("x = " + x); // Can access only static members
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner innerObj = new Outer.Inner(); // No need for Outer object
        innerObj.display(); // Output: x = 10
    }
}
