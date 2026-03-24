package OOPS.Methods;

/*
1. Instance Methods
Definition
  - Belong to objects (instances) of a class.
  - Can access instance variables (non-static fields) and other instance methods.
  - Must be called using an object reference.

Key Features
✔ Require an object to be called.
✔ Can access both instance and static members.
✔ Represent object-specific behavior.

Example
*/
public class InstanceMethod {
    // Instance variable
    private String model;

    // Static variable
    static int var = 10;

    // Instance method (can access instance variables)
    public void displayModel() {
        System.out.println("Car model: " + model);
        System.out.println(var);    // Static var accessed inside instance method
    }

    // Another instance method
    public void setModel(String model) {
        this.model = model;
    }
    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();
        obj.setModel("BMW M4");
        obj.displayModel();   // Car model: BMW M4
                               // 10  (Static var value)

        InstanceMethod obj1 = new InstanceMethod();
        obj1.setModel("ODDI");
        obj1.displayModel();      // Car model: ODDI
                                  // 10
    }
}
