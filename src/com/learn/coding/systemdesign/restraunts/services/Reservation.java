package com.learn.coding.systemdesign.restraunts.services;

import com.learn.coding.systemdesign.restraunts.InfrastructureEntities.Table;
import com.learn.coding.systemdesign.restraunts.entities.Customer;
import com.learn.coding.systemdesign.restraunts.entities.Notification;
import com.learn.coding.systemdesign.restraunts.status.ReservationStatus;

import java.util.Date;
import java.util.List;

public class Reservation {
    private int reservationID;
    private Date timeOfReservation;
    private int peopleCount;
    private ReservationStatus status;
    private String notes;
    private Date checkinTime;
    private Customer customer;

    private Table[] tables;
    private List<Notification> notifications;

    public boolean updatePeopleCount(int count) { return true; }
}
