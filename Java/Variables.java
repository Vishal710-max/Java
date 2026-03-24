public class Variables {
    int instance = 200;
    static int staticvar = 500;
    final double PI = 3.14;
    void  show () {
        int local = 100;
        System.out.println("Local variable: " + local);
        System.out.println("Instance variable: " + instance);
        System.out.println("Static variable: " + staticvar);
        System.out.println("Constant variable: " + PI);

    }
    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.show();
    }
}

//Output =>
//Local variable: 100
//Instance variable: 200
//Static variable: 500
//Constant variable: 3.14