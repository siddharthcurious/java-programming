package com.learn.coding.exceptions;

class Base extends Exception {}
class Derived extends Base  {}

public class ExceptionDemo {

    public static void main(String args[]) {
        try {
            // Some monitored code
            throw new Derived();
        }
        catch(Base b)     {
            System.out.println("Caught base class exception");
        }
//        catch(Derived d)  {
//            System.out.println("Caught derived class exception");
//        }
    }
}
