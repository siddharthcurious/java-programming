package com.learn.coding.designpatterns.creational.singleton;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance = null;

    private SingletonThreadSafe(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // it will aquire lock only if the
    public static SingletonThreadSafe getInstance(){
        if(instance == null){
            synchronized (SingletonThreadSafe.class){
                if(instance == null){
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
