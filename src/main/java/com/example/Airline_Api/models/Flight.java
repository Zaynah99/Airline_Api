package com.example.Airline_Api.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "flights") //creates table
public class Flight { //POJO



//    PROPERTIES
    @Id // creates unique identifier
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String destination;

    @Column
    private int capacity;

    @Column (name = "departure_date")
    private double departureDate;

    @Column (name = "departure_time")
    private double departureTime;


    @JsonIgnoreProperties({"flights"})
    @ManyToMany
    @JoinTable(
            name = "passengers_flights",
            joinColumns = @JoinColumn(name = "passengers_id"),
            inverseJoinColumns = @JoinColumn( name = "flight_id")
    )
    private List<Passenger> passengers;



//    CONSTRUCTOR
    public Flight (String destination, int capacity, double departureDate, double departureTime){
        this.destination = destination;
        this.capacity = capacity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
    }

//    DEFAULT CONSTRUCTOR
    public Flight(){

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
}
