package com.example.Airline_Api.components;

import com.example.Airline_Api.repositories.FlightRepository;
import com.example.Airline_Api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public DataLoader(){
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//
//
//
//    }


}
