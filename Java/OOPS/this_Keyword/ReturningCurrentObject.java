package OOPS.this_Keyword;

class StringBuilder {
    private String str = "";

    StringBuilder append(String s) {
        this.str += s;
        return this;  // Returns current object
    }

    void print() {
        System.out.println(str);
    }
}

public class ReturningCurrentObject {
    public static void main(String[] args) {
        new StringBuilder()
                .append("Hello")
                .append(" ")
                .append("World")
                .print();  // Output: Hello World
    }
}
