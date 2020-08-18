package com.learn.coding.arrays;

import java.util.Arrays;

class Data {
    public String name;
    public int roll;

    public Data(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}

public class ArrayTypeUnderstating {
    public static void main(String[] args) {

        Data data1 = new Data("Siddharth", 12);
        Data data2 = new Data("Ram", 34);
        Data data3 = new Data("Radheshyam", 67);

        Data [] data = {data1, data2, data3};

        System.out.println(Arrays.toString(data));
    }
}
