package com.learn.coding.designpatterns.creational.singleton;

public class SingletonInit {

    public static void main(String[] args) {

        Runtime instance1 = Runtime.getRuntime();
        instance1.gc();

        Runtime instance2 = Runtime.getRuntime();

        System.out.println(instance1);
        System.out.println(instance2);

    }
}
