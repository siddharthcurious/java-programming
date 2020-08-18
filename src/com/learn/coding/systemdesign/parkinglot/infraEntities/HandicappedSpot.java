package com.learn.coding.systemdesign.parkinglot.infraEntities;

import com.learn.coding.systemdesign.parkinglot.enums.ParkingSpotType;

public class HandicappedSpot extends ParkingSpot {

    public HandicappedSpot(){
        super(ParkingSpotType.HANDICAPPED);
    }
}
