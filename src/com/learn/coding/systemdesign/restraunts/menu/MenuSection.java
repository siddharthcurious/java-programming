package com.learn.coding.systemdesign.restraunts.menu;

import java.util.List;

public class MenuSection {
    private int menuSectionID;
    private String title;
    private String description;
    private List<MenuItem> menuItems;

    public boolean addMenuItem(MenuItem menuItem){
        return true;
    }
}