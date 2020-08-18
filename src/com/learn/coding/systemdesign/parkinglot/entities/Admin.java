package com.learn.coding.systemdesign.parkinglot.entities;

import com.learn.coding.systemdesign.parkinglot.infraEntities.EntrancePanel;
import com.learn.coding.systemdesign.parkinglot.infraEntities.ExitPanel;
import com.learn.coding.systemdesign.parkinglot.infraEntities.ParkingFloor;
import com.learn.coding.systemdesign.parkinglot.infraEntities.ParkingLot;

public class Admin extends Account {

    public boolean addParkingFloor(){
        return false;
    }

    public boolean addParkingLot(ParkingFloor parkingFloor, ParkingLot parkingLot){
        return false;
    }

    public boolean addEntrancePanel(EntrancePanel entrancePanel){
        return false;
    }

    public boolean addExitPanel(ExitPanel exitPanel){
        return false;
    }
}
