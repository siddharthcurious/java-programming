package com.learn.coding.string;

import java.util.LinkedList;
import java.util.List;

public class JoinMain {
    public static void main(String[] args) {

        List<String> data = new LinkedList<>();
        data.add("Hare");
        data.add("Krishna");
        data.add("Hare");
        data.add("Rama");

        String message = String.join(":", data);

        System.out.println(message);

    }
}
