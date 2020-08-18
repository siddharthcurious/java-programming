package com.learn.coding.output;

class OuterClass {

    class Inner {
        public void printData(){
            System.out.println("This is Non static inner class");
        }
    }
}

public class InnerNonStaticDemo {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.Inner inner = outerClass.new Inner();
        inner.printData();
    }
}
