package OOPS.Classes_Objects;

public class Variables {
    int instanceVar = 100;   // Instance Variable
    static int staticVar = 500;  // Static Variable
    final double PI = 13.14;   // Constant variable

    void show() {
        int local = 100;    // Local Variable
        System.out.println("Local variable: " + local);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Constant variable: " + PI);
    }
    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.show();
    }
}


// Output =>
// Local variable: 100
// Instance variable: 100
// Static variable: 500
// Constant variable: 13.14