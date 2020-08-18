package com.learn.coding.arrays;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(collection);

        Integer [] moreInts = {7,8,9};

        collection.addAll(Arrays.asList(moreInts));

        System.out.println(collection);

        Collections.addAll(collection, 12,23,34,45,67);

        System.out.println(collection);

        Collections.addAll(collection, moreInts);

        System.out.println(collection);

        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);

        list.set(1, 99);

        System.out.println(list);

    }
}
