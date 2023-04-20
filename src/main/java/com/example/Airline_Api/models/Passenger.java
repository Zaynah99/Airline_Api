package com.example.Airline_Api.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity (name = "passengers") //creates table
public class Passenger {//POJO

    @ManyToMany
    @JsonIgnoreProperties({"passengers"})
    @JoinTable(
            name = "passengers_flights",
            joinColumns = @JoinColumn(name = "passengers_id"),
            inverseJoinColumns = @JoinColumn (name = "flights_id")

    )

//  PROPERTIES
    @Id //creates unique identifier
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String name;

    @Column
    private int phoneNumber;

//    JOIN TABLE??

//    CONSTRUCTOR
    public Passenger(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
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
