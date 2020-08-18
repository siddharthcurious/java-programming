package com.learn.coding.lambdas;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {

        List names = new ArrayList<>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Radhe");
        names.add("Krishna");
        names.add("Vishnu");

        names.forEach(System.out::println);
    }
}
