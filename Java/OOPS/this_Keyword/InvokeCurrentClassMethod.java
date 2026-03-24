package OOPS.this_Keyword;


class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void calculate(int x, int y) {
        this.add(x, y);  // Using 'this' to call another method
    }
}

public class InvokeCurrentClassMethod {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate(5, 3);  // Output: Sum: 8
    }
}
