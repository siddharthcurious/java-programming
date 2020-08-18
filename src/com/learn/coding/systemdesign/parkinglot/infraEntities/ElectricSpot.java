package com.learn.coding.systemdesign.parkinglot.infraEntities;

import com.learn.coding.systemdesign.parkinglot.enums.ParkingSpotType;

public class ElectricSpot extends ParkingSpot {

    public ElectricSpot(){
        super(ParkingSpotType.ELECTRIC);
    }
}
