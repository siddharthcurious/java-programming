package com.learn.coding.identifier;

class ChildThread extends Thread {

    static Thread mt;
    public void run(){
        try {
            mt.join();
        } catch ( InterruptedException e) {
            System.out.println("Child thread exception");
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Child Thread");
        }
    }
}

public class ChildThreadWaitDemo {
    public static void main(String[] args) throws InterruptedException {

        ChildThread.mt = Thread.currentThread();

        ChildThread childThread = new ChildThread();
        childThread.start();

        for(int i = 0; i < 10; i++){
            System.out.println("Main thread");
            Thread.sleep(2000);
        }
    }
}
