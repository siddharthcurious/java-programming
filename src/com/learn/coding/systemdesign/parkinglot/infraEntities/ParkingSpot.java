package com.learn.coding.systemdesign.parkinglot.infraEntities;

import com.learn.coding.systemdesign.parkinglot.enums.ParkingSpotType;

public class ParkingSpot {

    private String number;
    private ParkingSpotType type;

    public ParkingSpot(ParkingSpotType type){
        this.type = type;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public void setType(ParkingSpotType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isFree(){
        return true;
    }
}
