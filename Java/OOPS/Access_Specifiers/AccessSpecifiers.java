package OOPS.Access_Specifiers;

/*
Access specifiers (also called access modifiers) in Java control the visibility and accessibility of classes, methods, and variables.
They define where a class, method, or variable can be accessed.

1. Types of Access Specifiers in Java
Java has 4 access specifiers:

Access Specifier	  Visibility Scope
public     	            Accessible everywhere (any class, any package)
private	                Accessible only within the same class
protected	            Accessible within the same package + subclasses (even in different packages)
default (no keyword)	Accessible only within the same package

Examples =>
*/

// public Example =>
class Animal {
    public String name; // Public field

    public void eat() { // Public method
        System.out.println(name + " is eating.");
    }
}

// private Example =>
class BankAccount {
    private double balance; // Private field

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Accessible (same class)
        }
    }

    public double getBalance() {
        return balance; // Accessible (same class)
    }
}

// protected Example =>
class Vehicle {
    protected String brand; // Protected field

    protected void start() { // Protected method
        System.out.println(brand + " is starting.");
    }
}
class Car extends Vehicle {
    public void display() {
        brand = "Toyota"; // Accessible (subclass)
        start(); // Accessible (subclass)
    }
}


public class AccessSpecifiers {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.name = "Dog"; // Accessible (public)
        dog.eat(); // Accessible (public)     // Dog is eating.

        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        System.out.println("Balance: " + acc.getBalance());   // Balance: 1000.0
        // acc.balance = 5000; // ERROR: Private field cannot be accessed outside class

        Car myCar = new Car();
        myCar.display();   // Toyota is starting.


    }
}
