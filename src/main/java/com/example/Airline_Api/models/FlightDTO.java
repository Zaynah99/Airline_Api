package com.example.Airline_Api.models;

import java.util.List;

//
public class FlightDTO {//POJO

//    PROPERTIES
    private String destination;
    private int capacity;
    private double departureDate;
    private double departureTime;
    private List<Long> passengerIds;

//    CONSTRUCTOR
    public FlightDTO (String destination, int capacity, double departureDate, double departureTime, List passengerIds){
        this.destination = destination;
        this.capacity = capacity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.passengerIds = passengerIds;
    }

//    DEFAULT CONSTRUCTOR
    public FlightDTO(){

    }


    //    GETTERS AND SETTERS
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(double departureDate) {
        this.departureDate = departureDate;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public List<Long> getPassengerIds() {
        return passengerIds;
    }

    public void setPassengerIds(List<Long> passengerIds) {
        this.passengerIds = passengerIds;
    }
}
