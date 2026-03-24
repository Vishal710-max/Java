package ToStringMethod;

/*
# toString() Method
   - The toString() method is a built-in method in Java that converts an object into a String representation


# Default Behavior: Every class in Java automatically has a toString() method because it's inherited from the Object class (the parent of all classes). By default, it returns a String containing:
   - The class name
   - The "@" symbol
   - The object's hash code (a unique number)

# Why Override It: The default version isn't very helpful, so we often override it to return more meaningful information about the object's state.
# toString() called when we printing object of class
*/

class Person1 {
    String name;
    int age;
}

class Person2 {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class tostring_Method {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        System.out.println(p1); // Automatically calls toString()
        // Output: ToStringMethod.Person@6acbcfc0 (not very useful)

        Person2 p2 = new Person2("ABC", 19);
        System.out.println(p2);
        // Output: Person{name='ABC', age=19}

    }
}
