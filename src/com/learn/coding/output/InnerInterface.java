package com.learn.coding.output;

public class InnerInterface {
    interface myInterface{
        void demo();
    }

    class InnerClass implements myInterface{
        public void demo(){
            System.out.println("Welcome to Tutorialspoint");
        }
    }
    public static void main(String [] args){
        InnerClass obj = new InnerInterface().new InnerClass();
        obj.demo();
    }
}