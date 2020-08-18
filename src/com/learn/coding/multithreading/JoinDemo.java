package com.learn.coding.multithreading;

class Thread_1 extends Thread {
    @Override
    public void run() {
        System.out.println("This is thread-1");
    }
}

class Thread_2 extends Thread {
    @Override
    public void run() {
        System.out.println("This is thread-2");
    }
}

class Thread_3 extends Thread {
    @Override
    public void run() {
        System.out.println("This is thread-3");
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        Thread_1 thread_1 = new Thread_1();
        thread_1.start();

        Thread_2 thread_2 = new Thread_2();
        thread_2.start();

        Thread_3 thread_3 = new Thread_3();
        thread_3.start();
    }
}
