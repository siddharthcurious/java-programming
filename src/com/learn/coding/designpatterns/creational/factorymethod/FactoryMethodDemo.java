package com.learn.coding.designpatterns.creational.factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        GetPlanFactory planFactory = new GetPlanFactory();

        Plan domestic = planFactory.getPlan("DOMESTIC");
        Plan commercial = planFactory.getPlan("COMMERCIAL");
        Plan institutional = planFactory.getPlan("INSTITUTIONAL");

        domestic.calculateBill(10);
        commercial.calculateBill(10);
        institutional.calculateBill(10);
    }
}
