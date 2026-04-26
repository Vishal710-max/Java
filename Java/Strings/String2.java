package Strings;

public class String2 {
    public static void main(String[] args) {
        String str1 = "pqr";
        String str2 = "pqr";
        String str3 = new String("pqr");

        // In this it gives true because str1 and str2 are referencing to same memory that's why it gives true
        System.out.println(str1 == str2);   // true

        // In this it gives false because str1 and str3 are not referencing to same memory
        //   because by using new keyword different object is created
        System.out.println(str1 == str3);   // false
    }
}
