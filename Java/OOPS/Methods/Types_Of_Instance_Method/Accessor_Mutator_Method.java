package OOPS.Methods.Types_Of_Instance_Method;

/*
There are two types Instance methods:
     1) Accessor Method 2) Mutator Method

1) Accessor Method
This type of instance methods are only access or read instance variables i.e. they do not modify
value of instance variable are called as “Accessor Method”

2) Mutator Method
This type of instance methods are access or read instance variables and also modify value of
instance variable are called as “Mutator Method”
*/

public class Accessor_Mutator_Method {
    int n;
    void get() { //mutator method
        n = 50;
    }
    void show() { //Accessor method
        System.out.println("Value: " + n);
    }

    public static void main(String[] args) {
        Accessor_Mutator_Method obj = new Accessor_Mutator_Method();
        obj.get();
        obj.show();
    }

}
