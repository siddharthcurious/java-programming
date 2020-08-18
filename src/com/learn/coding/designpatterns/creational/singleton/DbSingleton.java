package com.learn.coding.designpatterns.creational.singleton;

public class DbSingleton {

    private static final DbSingleton dbSingleton = new DbSingleton();

    private DbSingleton() {
        System.out.println("Private constructor ensure only one object");
    }

    public static DbSingleton getInstance(){
        return dbSingleton;
    }
}
