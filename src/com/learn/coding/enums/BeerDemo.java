package com.learn.coding.enums;

enum Beer {
    KF, BD, KO
}

public class BeerDemo {
    public static void main(String[] args) {
        Beer b = Beer.KF;
        switch (b){
            case KF :
                System.out.println("King Fisher");break;
            case BD:
                System.out.println("Budwiser"); break;
            default:
                System.out.println("Data");
        }
    }
}
