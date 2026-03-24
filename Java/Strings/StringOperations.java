package Strings;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = new String("Hello");

        // length()
        System.out.println("Length of string: " + str1.length());     // Length of string: 5

        // concat()
        System.out.println("Concat: " + str1.concat(" World"));     // Concat: Hello World

        // charAt()
        System.out.println("Character at index 2: " + str1.charAt(2) );    // Character at index 2: l

        // equals()
        System.out.println("equals: " + str1.equals("Hello"));    // equals: true

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase("hello"));   // equalsIgnoreCase: true

        // compareTo()
        System.out.println("compareTo: " + str1.compareTo("Hello"));    // compareTo: 0
        System.out.println("compareTo: " + str1.compareTo("hello"));    // compareTo: -32
        System.out.println("compareTo: " + str1.compareTo("HELLO"));    // compareTo: 32

        //  compareToIgnoreCase()
        System.out.println("compareToIgnoreCase: " + str1.compareToIgnoreCase("Hello"));    // compareToIgnoreCase: 0
        System.out.println("compareToIgnoreCase: " + str1.compareToIgnoreCase("hello"));    // compareToIgnoreCase: 0
        System.out.println("compareToIgnoreCase: " + str1.compareToIgnoreCase("HELLO"));    // compareToIgnoreCase: 0

        // startsWith()
        System.out.println("startsWith: " + str1.startsWith("H"));   // startsWith: true  (It can not applied on char)

        // endsWith()
        System.out.println("endsWith: " + str1.endsWith("lo"));     // endsWith: true

        //indexOf()
        String str2 = "Box is Heavy and box is full";

        System.out.println("indexOf: " + str2.indexOf("is"));   // indexOf: 4

        // lastIndexOf()
        System.out.println("lastIndexOf: " + str2.lastIndexOf("is"));   //  lastIndexOf: 21

        // replace()
        System.out.println("replcace: " + str1.replace("ll", "tt"));   // replcace: Hetto

        // subString()
        System.out.println("subString: " + str2.substring(4)); // subString: is Heavy and box is full
        System.out.println("subString: " + str2.substring(4, 7));     // subString: is

        // toLowerCase()
        System.out.println("toLowerCase: " + str1.toLowerCase() );   // subString: is

        // toUpperCase()
        System.out.println("toUpperCase: " + str1.toUpperCase());    // toUpperCase: HELLO
    }
}
