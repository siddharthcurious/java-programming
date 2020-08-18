package com.learn.coding.oops.Inhetance;


// Arg constructor class extended, then
// super is mandtory

class A {
    public A(String s) {
        System.out.print("A");
    }
}

class B extends A {

    public B(String s) {
        super(s);
        System.out.print("B");
    }

}

public class ArgConstrrctor {
    public static void main(String[] args) {
        B b = new B("Hare Krishna");
    }
}
