package com.learn.coding.designpatterns.creational.singleton;

public class SingletonLazyLoading {

    private static SingletonLazyLoading instance = null;

    private SingletonLazyLoading() {};

    public static SingletonLazyLoading getInstance(){
        if(instance == null){
            instance = new SingletonLazyLoading();
        }
        return instance;
    }
}
