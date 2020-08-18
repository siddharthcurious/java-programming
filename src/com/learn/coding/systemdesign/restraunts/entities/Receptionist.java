package com.learn.coding.systemdesign.restraunts.entities;

import java.util.ArrayList;
import java.util.List;

public class Receptionist extends Employee {
    public boolean createReservation() {
        return true;
    }
    public List<Customer> searchCustomer(String name){
        List<Customer> customers = new ArrayList<>();
        return customers;
    }
}
