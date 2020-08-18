package com.learn.coding.output;

public class ThreadTest implements Runnable
{
    public void run()
    {
        System.out.printf("%d",3);
    }
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread = new Thread(new ThreadTest());
        thread.start();
        System.out.printf("%d",1);
        thread.join();
        System.out.printf("%d",2);
    }

}

