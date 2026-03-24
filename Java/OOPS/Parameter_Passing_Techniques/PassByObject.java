package OOPS.Parameter_Passing_Techniques;

class emp {
    int id;
    emp(int id) {
        this.id = id;
    }
}

class swap {
    void doSwap(emp a, emp b) {
        int temp = a.id;  // Swap the 'id' values
        a.id = b.id;
        b.id = temp;
    }
}
public class PassByObject {
    public static void main(String[] args) {
        emp x = new emp(10);
        emp y = new emp(20);
        swap p = new swap();

        System.out.println("Before swapping IDs: " + x.id + " " + y.id); // 10 20
        p.doSwap(x, y);
        System.out.println("After swapping IDs: " + x.id + " " + y.id);  // 20 10
    }
}
