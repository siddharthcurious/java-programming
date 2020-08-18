package com.learn.coding.systemdesign.restraunts.InfrastructureEntities;

import com.learn.coding.systemdesign.restraunts.entities.Address;

public class Branch {
    private String name;
    private Address location;
    private Kitchen kitchen;

    public Address addTableChart(){
        return location;
    }
}
