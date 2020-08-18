package com.learn.coding.designpatterns.creational.singleton;

public class SingletonLazyDemo {
    public static void main(String[] args) {
        SingletonLazyLoading instance1 = SingletonLazyLoading.getInstance();
        SingletonLazyLoading instance2 = SingletonLazyLoading.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
