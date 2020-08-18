package com.learn.coding.tricks;


import java.util.LinkedList;
import java.util.List;

public class ObejctsMain {
    public static void main(String[] args) {
        List<Object> data = new LinkedList<>();

        data.add(1);
        data.add("Siddharth");
        data.add(false);
        data.add(123.56);
        data.add("+");
        data.add('-');
        data.add("()");

        if( data.get(0) instanceof Integer) {
            System.out.println("TRUE");
        }

        System.out.println(data);
    }
}
