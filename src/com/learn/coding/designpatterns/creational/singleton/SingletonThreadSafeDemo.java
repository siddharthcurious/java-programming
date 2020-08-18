package com.learn.coding.designpatterns.creational.singleton;

public class SingletonThreadSafeDemo {
    public static void main(String[] args) {

        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();

        System.out.println(instance1);

        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        System.out.println(instance2);

    }
}
