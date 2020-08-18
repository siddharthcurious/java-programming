package com.learn.coding.multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("This is run method, child class");
        }
    }
}

public class SimpleThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();

        for(int i = 0; i < 5; i++){
            System.out.println("This is main thread");
        }
    }
}
