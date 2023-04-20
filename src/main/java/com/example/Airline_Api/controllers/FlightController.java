package com.example.Airline_Api.controllers;

import com.example.Airline_Api.models.Flight;
import com.example.Airline_Api.models.FlightDTO;
import com.example.Airline_Api.models.Passenger;
import com.example.Airline_Api.repositories.FlightRepository;
import com.example.Airline_Api.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping
public class FlightController {

    @Autowired
    FlightService flightService;

    @Autowired
    FlightRepository flightRepository;

    //    GET ALL FLIGHTS
    @GetMapping
    public ResponseEntity<List<Flight>> getAllPassengers() {
        return new ResponseEntity(flightRepository.findAll(), HttpStatus.OK);
    }

    //    GET FLIGHTS BY ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Flight>> getPassenger(@PathVariable Long id) {
        return new ResponseEntity<>(flightRepository.findById(id), HttpStatus.CREATED);
    }

    //    SAVE FLIGHT
    @PostMapping
    public ResponseEntity<List<Flight>> saveFlight(@RequestBody Flight flight) {
        flightRepository.save(flight);
        return new ResponseEntity(flightRepository.findAll(), HttpStatus.CREATED);
    }


    //    CANCEL FLIGHT
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Long> deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

//    //    BOOK PASSENGERS ON FLIGHT
//    @PostMapping
//    public ResponseEntity<Flight>bookPassengerFlight(@RequestBody FlightDTO flightDTO){
//        Flight flight = flightService.saveFlight(flightDTO);
//        return new ResponseEntity(flight, HttpStatus.CREATED);
//    }
    
}
