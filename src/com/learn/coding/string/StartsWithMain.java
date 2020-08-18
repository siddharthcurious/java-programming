package com.learn.coding.string;

public class StartsWithMain {
    public static void main(String[] args) {
        String str = "This is my laptop";

        System.out.println(str.startsWith("This"));

        System.out.println(str.startsWith("is", 5));
    }
}

