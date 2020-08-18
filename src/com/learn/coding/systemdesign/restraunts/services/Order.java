package com.learn.coding.systemdesign.restraunts.services;

import com.learn.coding.systemdesign.restraunts.InfrastructureEntities.Table;
import com.learn.coding.systemdesign.restraunts.entities.Chef;
import com.learn.coding.systemdesign.restraunts.entities.Waiter;
import com.learn.coding.systemdesign.restraunts.meal.Meal;
import com.learn.coding.systemdesign.restraunts.status.OrderStatus;

import java.util.Date;

public class Order {
    private int OrderID;
    private OrderStatus status;
    private Date creationTime;

    private Meal[] meals;
    private Table table;
    private Waiter waiter;
    private Chef chef;

    public boolean addMeal(Meal meal) {
        return false;
    }

    public boolean removeMeal(Meal meal) {
        return false;
    }

    public OrderStatus getStatus() {
        return null;
    }

    public boolean setStatus(OrderStatus status) {
        return false;
    }
}
