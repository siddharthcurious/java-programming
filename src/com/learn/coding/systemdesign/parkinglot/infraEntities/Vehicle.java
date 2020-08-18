package com.learn.coding.systemdesign.parkinglot.infraEntities;

import com.learn.coding.systemdesign.parkinglot.enums.VehicleType;

public abstract class Vehicle {

    private String licenseNumber;
    private final VehicleType type;
    private ParkingTicket parkingTicket;

    public Vehicle(VehicleType type){
        this.type = type;
    }

    public boolean assignTicket(ParkingTicket ticket){
        this.parkingTicket = ticket;
        return true;
    }
}
