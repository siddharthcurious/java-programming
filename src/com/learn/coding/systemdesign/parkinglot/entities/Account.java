package com.learn.coding.systemdesign.parkinglot.entities;

import com.learn.coding.systemdesign.parkinglot.enums.AccountStatus;

public class Account {
    private String username;
    private String password;
    private Person person;
    private AccountStatus accountStatus;

    public boolean passwordReset(){
        return false;
    }
}
