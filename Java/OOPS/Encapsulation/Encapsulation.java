package OOPS.Encapsulation;

/*
# OOPS.Encapsulation is a fundamental concept in Object-Oriented Programming (OOP) that means bundling data (variables) and methods (functions) together inside a class and restricting direct access to some of the object’s components.

# Key Idea:
  - Hide internal data (make fields private).
  - Control access using getter and setter methods (public methods to read/modify data).
  - Add validation to prevent invalid data.

# Why Use OOPS.Encapsulation?
  - Security – Prevents unauthorized access to sensitive data.
  - Control – You can add rules (like validation) before allowing changes.
  - Flexibility – You can change how data is stored internally without breaking other code.
  - Maintainability – Easier to debug and modify code.

*/

class Person {
    private String name;  // Private (hidden)
    private int age;      // Private (hidden)

    // Getter (to read name)
    public String getName() {
        return name;
    }

    // Setter (to modify name)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Getter (to read age)
    public int getAge() {
        return age;
    }

    // Setter (to modify age with validation)
    public void setAge(int age) {
        if (age >= 0 && age <= 120) {  // Age must be realistic
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("ABC");  // Correct
        person.setAge(25);        // Correct
        person.setAge(-5);        // Error: "Invalid age!"

        System.out.println(person.getName());  // Output: ABC
        System.out.println(person.getAge());   // Output: 25
    }
}
