package com.learn.coding.oops;



class Base {
    private void foo() {
        System.out.println("Base");
    }
}
class Derived extends Base {
    public void foo() {
        System.out.println("Derived");
    }
}
public class FunctionOverrdingDemo {
    public static void main(String args[]) {
        Derived d = new Derived();
        Base b = new Derived();
        Base e = new Base();
        d.foo();
    }
}
