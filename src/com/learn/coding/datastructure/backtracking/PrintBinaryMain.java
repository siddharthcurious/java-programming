package com.learn.coding.datastructure.backtracking;

public class PrintBinaryMain {
    public static void main(String[] args) {

        PrintBinaryMain printBinaryMain = new PrintBinaryMain();
        printBinaryMain.printBinary(0, 6, "");

    }

    public void printBinary(int i, int length, String binary){
        if(i == length){
            System.out.println(binary);
        }
        else if(i > length){
            return;
        }

        else {
            printBinary(i+1, length, binary+0);
            printBinary(i+1, length, binary+1);
        }
    }
}
