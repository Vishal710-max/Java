package OOPS.Parameter_Passing_Techniques;

public class ReturningArray {
    int[] show() {
        int x[] = {10, 20, 30, 40, 50};
        return x;
    }

    public static void main(String[] args) {
        ReturningArray p = new ReturningArray();
        int[] z = p.show();
        System.out.print("Array Ele: ");
        for(int i : z) {
            System.out.print(" " + i);
        }
    }
}

// Output =>
// Array Ele:  10 20 30 40 50