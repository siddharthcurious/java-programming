package com.learn.coding.multithreading;

class ThatThread extends Thread {
    @Override
    public synchronized void start() {
        System.out.println("This is Start method");
        super.start();
    }

    @Override
    public void run() {
        System.out.println("This is Run method");
    }
}

public class OverridingStartMethod {
    public static void main(String[] args) {
        ThatThread thatThread = new ThatThread();
        thatThread.start();
        System.out.println("This is Main method");
    }
}
