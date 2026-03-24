package Strings;

/*
Strings are one of the most fundamental and commonly used data types in Java.
They represent sequences of characters and are used to store and manipulate text.

What is a String in Java?
In Java, a String is:
    - An object that represents a sequence of characters
    - Immutable (cannot be changed after creation)
    - Implemented using the java.lang.String class
    - Stored in the String Pool (a special memory area in the heap)

Creating Strings
There are two main ways to create strings:

1. String Literal (stored in String Pool)
    String s1 = "Hello";
    String s2 = "Hello";  // Reuses the same object from String Pool
2. Using new Keyword (creates new object in heap memory)
    String s3 = new String("Hello");
    String s4 = new String("Hello");  // Creates separate objects

String Immutability
Strings in Java are immutable, meaning:
- Once created, their value cannot be changed
- Any operation that modifies a string actually creates a new string
- This provides security, thread safety, and allows caching in String Pool
*/
public class String1 {
    public static void main(String[] args) {
        // Creating a string using Literal
        String str = "Hello";
        System.out.print(str);   // Hello

        // Creating a string using new keyword
        String str1 = new String(" World");
        System.out.println(str1);  // World

        // Creating a string by converting char array
        char[] c1 = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(c1);
        System.out.println(str2);   // Hello
    }
}
