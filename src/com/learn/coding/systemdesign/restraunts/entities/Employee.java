package com.learn.coding.systemdesign.restraunts.entities;

import java.util.Date;

public abstract class Employee extends Person {
    private int employeeID;
    private Date dateJoined;
    private Account account;
}