package com.learn.coding.output;

public class TheClass {
    static {
        System.out.printf("%d", 1);
    }
    static {
        System.out.printf("%d", 2);
    }
    static {
        System.out.printf("%d", 3);
    }

    private static int myMethod() {
        return 4;
    }
    private int function() {
        return 5;
    }

    public static void main(String[] args) {
        System.out.printf("%d", (new TheClass()).function() + myMethod());
    }
}
