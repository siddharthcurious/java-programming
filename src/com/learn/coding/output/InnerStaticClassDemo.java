package com.learn.coding.output;

class Outer {
    static class Inner {
        public void printData(){
            System.out.println("This is Siddharth Kumar");
        }
    }
}

public class InnerStaticClassDemo {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.printData();
    }
}
