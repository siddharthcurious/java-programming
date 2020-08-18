package com.learn.coding.output;

interface Eatable {
    void eat();
}

public class InnerClassInterface {
    public static void main(String[] args) {
        Eatable a = new Eatable() {
            @Override
            public void eat() {
                System.out.println("This is Eatable class");
            }
        };

        a.eat();
    }
}
