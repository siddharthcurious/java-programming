package com.learn.coding.designpatterns.creational.singleton;

public class SingletonSynchronized {

    private static SingletonSynchronized instance = null;

    private SingletonSynchronized(){}

    // Every time do lock unlock - which is time comsuming task.
    public static synchronized SingletonSynchronized getInstance(){
        if(instance == null){
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}
