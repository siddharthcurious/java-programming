package com.learn.coding.designpatterns.creational.factorymethod;

public class GetPlanFactory {

    public GetPlanFactory(){}

    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }

        switch (planType) {
            case "DOMESTIC":
                return new DomesticPlan();
            case "COMMERCIAL":
                return new CommercialPlan();
            case "INSTITUTIONAL":
                return new InstitutionalPlan();
        }

        return null;
    }

}
