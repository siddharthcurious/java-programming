package com.learn.coding.output;

public class StaticInnerDemo {

    static class Nested_Demo {

        public void my_method() {

            System.out.println("This is my nested class");
        }
    }

    public static void main(String []args) {

        StaticInnerDemo.Nested_Demo nested = new StaticInnerDemo.Nested_Demo();
        nested.my_method();
    }
}
