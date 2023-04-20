package com.example.Airline_Api.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity(name = "flights") //creates table
public class Flight { //POJO

    @JsonIgnoreProperties({"flights"})
    @ManyToMany(mappedBy = "flights")

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

//    CONSTRUCTOR
    public Flight (String destination, int capacity, double departureDate, double departureTime){
        this.destination = destination;
        this.capacity = capacity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
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
