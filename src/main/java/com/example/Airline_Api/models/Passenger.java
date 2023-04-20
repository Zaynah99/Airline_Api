package com.example.Airline_Api.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity (name = "passengers") //creates table
public class Passenger {//POJO

//  PROPERTIES
    @Id //creates unique identifier
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int phoneNumber;

    @JsonIgnoreProperties({"passengers"})
    @ManyToMany(mappedBy = "passengers")
    private List<Flight> flights;



//    JOIN TABLE??

//    CONSTRUCTOR
    public Passenger(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.flights = new ArrayList<>();
    }


//    DEFAULT CONSTRUCTOR
    public Passenger(){

    }

//    GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
