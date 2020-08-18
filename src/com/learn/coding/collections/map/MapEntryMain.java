package com.learn.coding.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapEntryMain {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ram");
        map.put("roll", "12345");
        map.put("village", "hata");
        map.put("district", "gopalganj");

        for(Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
