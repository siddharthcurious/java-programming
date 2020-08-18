package com.learn.coding.output;

class Gfg {
    Gfg() {
        System.out.println("Geeksforgeeks");
    }
    static Gfg a = new Gfg();
}

public class StaticObjectDemo {

    public static void main(String []args){
        Gfg b = new Gfg();
    }
}
