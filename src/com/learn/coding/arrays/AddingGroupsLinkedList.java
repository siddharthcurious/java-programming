package com.learn.coding.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class AddingGroupsLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.addAll(Arrays.asList(6,7,8,9));

        System.out.println(numbers);
    }
}
