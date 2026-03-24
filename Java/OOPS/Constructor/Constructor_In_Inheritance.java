package OOPS.Constructor;

class  Parent {
    Parent() {
        System.out.println("I am Parent class");
    }
}
class  Child1 extends Parent {
    Child1() {
        System.out.println("I am Child1 class");
    }
}

class  Child2 extends Child1 {
    Child2() {
        System.out.println("I am Child2 class");
    }
}


public class Constructor_In_Inheritance {
    public static void main(String[] args) {
        Child2 obj = new Child2();
    }
}
