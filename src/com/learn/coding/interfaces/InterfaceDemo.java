package com.learn.coding.interfaces;

interface MyInterface {
    int getData();
}

class HelloInterface implements MyInterface {

    public int getData(){
        System.out.println("This is Interface example");
        return 1234567;
    }

    public String getString(){
        System.out.println("Jai Sree Ram");
        return "Jai Hanuman";
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        HelloInterface helloInterface = new HelloInterface();
        helloInterface.getData();
        helloInterface.getString();
    }
}
