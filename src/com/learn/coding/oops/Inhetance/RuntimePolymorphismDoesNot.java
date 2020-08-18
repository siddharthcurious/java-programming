package com.learn.coding.oops.Inhetance;

class Base {
    public static void show() {
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    public static void show() {
        System.out.println("Derived::show() called");
    }
}

class RuntimePolymorphismDoesNot {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}

