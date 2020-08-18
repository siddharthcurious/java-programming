package com.learn.coding.arrays;

import java.util.*;

public class ArrayBinarySearch {

    public static void main(String[] args) {

        String[] sa = {"This", "Is", "cow", "THERE", "was", "A", "nice", "main", "a", "hello", "mr.", "Siddharth" };

        Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);

        System.out.println(Arrays.toString(sa));

        int index = Arrays.binarySearch(sa, "a", String.CASE_INSENSITIVE_ORDER);

        System.out.println("Index: "+ index + "\n"+ sa[index]);
    }
}