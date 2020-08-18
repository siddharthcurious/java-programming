package com.learn.coding.enums;

enum BeerEnum {
    KF, RC, BD
}

public class EnumComparision {

    public static void main(String [] args){

        if(BeerEnum.KF == BeerEnum.RC){
            System.out.println(true);
        }

        if(BeerEnum.KF.equals(BeerEnum.KF)){
            System.out.println("equals");
        }

        if(BeerEnum.KF.ordinal() > BeerEnum.BD.ordinal()){
            System.out.println("Data");
        }

        if(BeerEnum.KF.hashCode() == BeerEnum.BD.hashCode()){
            System.out.println("Hash Code Equal");
        }
    }
}
