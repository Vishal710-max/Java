package ControlStatements.Loops;

/*
for (vaiable : collection) {
    // code to be execute
}
*/
public class For_Each_Loop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        for (int v : arr) {
            System.out.println(v);
        }

        var arr1 = new int[]{10, 20, 30, 40}; // No size needed, Java infers it

        for (int v : arr1) {
            System.out.println(v);
        }
    }
}

// Output =>
// 10
// 20
// 30
// 40