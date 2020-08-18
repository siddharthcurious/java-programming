package com.learn.coding.identifier;

class ChildThread_1 extends Thread {

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("I am lazy thread");
            //Thread.sleep(2000);
        }
    }
}

public class InterruptThreadDemo {
    public static void main(String[] args) {
        ChildThread_1 childThread_1 = new ChildThread_1();
        childThread_1.start();
        childThread_1.interrupt();

        System.out.println("End of Main");
    }
}
