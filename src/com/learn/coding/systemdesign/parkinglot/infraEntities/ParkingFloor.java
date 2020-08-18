package com.learn.coding.systemdesign.parkinglot.infraEntities;

import com.learn.coding.systemdesign.parkinglot.enums.ParkingSpotType;
import com.learn.coding.systemdesign.restraunts.entities.Customer;

import java.util.HashMap;

public class ParkingFloor {

    private String name;
    private HashMap<String, ParkingSpot> handicappedSpotHashMap;
    private HashMap<String, ParkingSpot> compactSpotHashMap;
    private HashMap<String, ParkingSpot> largeSpotHashMap;
    private HashMap<String, ParkingSpot> motorBikeSpotHashMap;
    private HashMap<String, ParkingSpot> electricSpotHashMap;
    private HashMap<String, Customer> stringCustomerHashMap;
    private ParkingDisplayBoard displayBoard;

    public ParkingFloor(String name) {
        this.name = name;
    }

    public void addParkingSpot(ParkingSpot spot) {

    }

    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {

    }

    private void updateDisplayBoardForHandicapped(ParkingSpot spot) {

    }

    public void freeSpot(ParkingSpot spot) {

    }

    public boolean isFull(){
        return false;
    }
}
