package com.learn.coding.output;

class Test {
    interface myInterface{
        void demo();
    }
}
public class InnerInterfaceDemo2 implements Test.myInterface {

    public void demo(){
        System.out.println("Hello welcome to tutorialspoint");
    }

    public static void main(String []args){
        InnerInterfaceDemo2 obj = new InnerInterfaceDemo2();
        obj.demo();
    }
}