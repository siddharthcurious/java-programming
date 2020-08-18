package com.learn.coding.systemdesign.restraunts.menu;

import java.util.List;

public class Menu {
    private int menuID;
    private String title;
    private String description;
    private List<MenuSection> menuSections;

    public boolean addMenuSection(MenuSection menuSection){
        return true;
    }
    public boolean print() {
        return true;
    }
}