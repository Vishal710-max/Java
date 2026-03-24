package OOPS.Static;

/*
1. Definition of Static Data
In Java, static data refers to:
   - Class-level variables and methods (shared across all objects)
   - Declared using the static keyword
   - Allocated memory only once when the class loads (not per object)
   - Accessible without creating an object of the class
   - Stored in class memory area (not heap)
   - Often used for constants, counters, shared resources
   - Static data by default initialized to zero

# Syntax
    static datatype variable;
*/
public class StaticData {
    static int cnt;
    StaticData() {  // Constructor
        cnt++;
    }
    static void show( ) {
        System.out.println("Total Objects: " + cnt);
    }

    public static void main(String[] args) {
        StaticData obj1 = new StaticData();
        StaticData obj2 = new StaticData();
        StaticData obj3 = new StaticData();

        StaticData.show();    // Total Objects: 3
    }
}
