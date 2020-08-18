package com.learn.coding.systemdesign.restraunts.InfrastructureEntities;

import com.learn.coding.systemdesign.restraunts.status.TableStatus;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Table {
    private int tableID;
    private TableStatus status;
    private int maxCapacity;
    private int locationIdentifier;

    private List<TableSeat> seats;

    public boolean isTableFree() { return true; }
    public boolean addReservation() { return true; }

    public static List<Table> search(int capacity, Date startTime) {
        // return all tables with the given capacity and availability
        List<Table> tables = new LinkedList<>();
        return tables;
    }
}