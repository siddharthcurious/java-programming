package com.learn.coding.generics;

class TwoGen<T, V> {
    T obj1;
    V obj2;

    TwoGen(T obj1, V obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    T getObj1(){
        return obj1;
    }

    V getObj2(){
        return obj2;
    }

    public void showType(){
        System.out.println("obj1 "+obj1.getClass().getName());
        System.out.println("obj2 "+obj2.getClass().getName());
    }
}

public class TwoGenMain {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(10, "Siddharth");
        twoGen.showType();
    }
}
