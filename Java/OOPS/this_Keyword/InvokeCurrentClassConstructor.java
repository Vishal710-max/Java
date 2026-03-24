package OOPS.this_Keyword;

class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 0);  // Calls parameterized constructor
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class InvokeCurrentClassConstructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);  // Output: Unknown
    }
}
