package OOPS.Constructor;

/*
 The constructor that accepts any argument or parameter as input, such constructor is
called as “parameterized Constructor”.
 Parameterized constructor is implicitly invoked by compiler when we pass some values
direct to object at the time of its creation.

Syntax =>
class class_name {
    class_name( arg1, arg2, ..) { // parameterized constructor.

    }
}

*/
public class Constructor_Parameterized {
    Constructor_Parameterized(String name) {
        System.out.println(name + " Constructor..");
    }
    public static void main(String[] args) {
        Constructor_Parameterized obj = new Constructor_Parameterized("Parameterized");  // parameterized constructor called
        // Output =>
        // Parameterized Constructor..
    }
}
