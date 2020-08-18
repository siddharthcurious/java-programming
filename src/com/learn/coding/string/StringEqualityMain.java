package com.learn.coding.string;

public class StringEqualityMain {
    public static void main(String[] args) {

        String A = "Hey, there";
        String B = "Hey, there";

        boolean b = A==B;
        System.out.println(b);

        if(A == B){
            System.out.println("String references are equal");
        }

        if(A.equals(B)){
            System.out.println("Value of the String are equal");
        }
    }
}
