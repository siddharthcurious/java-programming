package com.learn.coding.systemdesign.restraunts.entities;

import com.learn.coding.systemdesign.restraunts.status.AccountStatus;

public class Account {
    private String id;
    private String password;
    private Address address;
    private AccountStatus status;

    public boolean resetPassword(){
        return true;
    }
}
