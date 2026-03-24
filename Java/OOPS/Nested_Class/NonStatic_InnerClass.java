package OOPS.Nested_Class;

/*
2. Non-Static (Inner Class)
   - Regular inner class (no static keyword).
   - Can access all members (static + non-static) of the outer class.

   - Object Creation Syntax:
       OuterClass outerObj = new OuterClass();
       OuterClass.InnerClass innerObj = outerObj.new InnerClass();
*/

class Outer1 {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("x = " + x); // Can access non-static members
        }
    }
}
public class NonStatic_InnerClass {
    public static void main(String[] args) {
        Outer1 outerObj = new Outer1();
        Outer1.Inner innerObj = outerObj.new Inner(); // Needs Outer object
        innerObj.display();    // Output: x = 10
    }
}
