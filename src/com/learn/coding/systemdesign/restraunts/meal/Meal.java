package com.learn.coding.systemdesign.restraunts.meal;

import com.learn.coding.systemdesign.restraunts.InfrastructureEntities.TableSeat;
import com.learn.coding.systemdesign.restraunts.menu.MenuItem;

import java.util.List;

public class Meal {
    private int mealID;
    private TableSeat seat;
    private List<MenuItem> menuItems;

    public boolean addMealItem(MealItem mealItem){
        return true;
    }
}
