package com.learn.coding.enums;

import java.util.Arrays;

enum Color {

    RED, GREEN, BLUE

}

public class Test {
    public static void main(String[] args) {
        Color []colors = Color.values();
        System.out.println(Arrays.toString(colors));
    }
}
