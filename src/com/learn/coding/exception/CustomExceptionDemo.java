package com.learn.coding.exception;

class CustomeException extends Exception {

    public CustomeException(String message){
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {

        try {
            throw new CustomeException("This is Explicit throw.");
        } catch ( CustomeException cx ){
            System.out.println("Caught");
            System.out.println(cx.getMessage());
        }
    }
}
