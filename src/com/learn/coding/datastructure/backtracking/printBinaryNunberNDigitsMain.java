package com.learn.coding.datastructure.backtracking;

class PrintBinaryNumber{

    public void printBinaryNunber(int digits){
        if(digits == 0){
            System.out.println();
        }
        else {
            System.out.print(0);
            printBinaryNunber(digits-1);
            System.out.print(1);
            printBinaryNunber(digits-1);
        }
    }
}

public class printBinaryNunberNDigitsMain {
    public static void main(String[] args) {

        PrintBinaryNumber printBinaryNumber = new PrintBinaryNumber();

        printBinaryNumber.printBinaryNunber(4);
    }
}
