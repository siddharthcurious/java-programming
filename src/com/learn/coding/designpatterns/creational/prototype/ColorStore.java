package com.learn.coding.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

    public static Map<String, Color> colorMap = new HashMap<String, Color>();

    static {
        colorMap.put("blue", new BlueColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColor(String colorName) {
        return (Color) colorMap.get(colorName).clone();
    }
}
