package com.learn.coding.collections.map;

import java.util.TreeMap;

public class OrderedMapMain {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(1,2);
        treeMap.put(3,5);
        treeMap.put(-1, 6);

        System.out.println(treeMap);
    }
}
