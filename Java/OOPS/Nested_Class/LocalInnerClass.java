package OOPS.Nested_Class;

/*
3. Local Inner Class
   - Defined inside a method or block.
   - Can access only final or effectively final local variables.

   - Object Creation Syntax:
        class Outer {
            void method() {
               class LocalInner { ... }
               LocalInner obj = new LocalInner();
         }
}
*/

class Outer2 {
    void display() {
        final int y = 20; // Must be final or effectively final

        class LocalInner {
            void show() {
                System.out.println("y = " + y);
            }
        }

        LocalInner inner = new LocalInner();
        inner.show(); // Output: y = 20
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.display();
    }
}
