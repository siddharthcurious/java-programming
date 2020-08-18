package com.learn.coding.generics;

class Gen<T>{
    T ob;

    Gen(){}

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    public void setOb(T ob){
        this.ob = ob;
    }

    public void showType(){
        System.out.println("Type of T is "+ob.getClass().getName());
    }
}

public class General {
    public static void main(String[] args) {

        Gen<Integer> genInt = new Gen<>();
        genInt.setOb(90);
        genInt.showType();

        Gen<String> genString = new Gen<>();
        genString.setOb("Siddharth");
        genString.showType();
    }
}
