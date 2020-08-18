package com.learn.coding.designpatterns.creational.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {

        DbSingleton dbSingleton1 = DbSingleton.getInstance();

        DbSingleton dbSingleton2 = DbSingleton.getInstance();

        System.out.println(dbSingleton1);
        System.out.println(dbSingleton2);

    }
}
