package com.learn.coding.multithreading;

class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("This is run method");
    }
}

public class RunOverridingDemo {
    public static void main(String[] args) {

        MyThread1 myThread = new MyThread1();

        myThread.run();

        System.out.println("This is Main thread");

    }
}
