package com.example.Airline_Api.controllers;
import com.example.Airline_Api.models.Passenger;
import com.example.Airline_Api.repositories.FlightRepository;
import com.example.Airline_Api.repositories.PassengerRepository;
import com.example.Airline_Api.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("passengers")
public class PassengerController {

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerService passengerService;

//    GET ALL PASSENGERS
    @GetMapping
    public ResponseEntity<List<Passenger>> getAllPassengers(){
        return new ResponseEntity(passengerRepository.findAll(), HttpStatus.OK);
    }

//    GET PASSENGERS BY ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Passenger>>getPassenger(@PathVariable Long id){
        return new ResponseEntity<>(passengerRepository.findById(id),HttpStatus.CREATED);
    }

//    SAVE PASSENGERS
    @PostMapping
    public ResponseEntity<List<Passenger>> postPassengers(@RequestBody Passenger passenger){
        passengerRepository.save(passenger);
        return new ResponseEntity(passengerRepository.findAll(), HttpStatus.CREATED);
    }


}
