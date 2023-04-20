package com.example.Airline_Api.services;

import com.example.Airline_Api.models.Flight;
import com.example.Airline_Api.models.FlightDTO;
import com.example.Airline_Api.models.Passenger;
import com.example.Airline_Api.repositories.FlightRepository;
import com.example.Airline_Api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService{

    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightRepository flightRepository;

//    SAVE PASSENGER
    public void savePassenger(Passenger passenger){
        passengerRepository.save(passenger);
    }

//    FIND PASSENGER
    public Passenger findPassenger(Long id){
        return passengerRepository.findById(id).get();
    }

//    FIND ALL PASSENGERS
    public List<Passenger> findAllPassengers(){
        return passengerRepository.findAll();
    }

//    DELETING PASSENGERS
    public void deletePassenger(Long id){
        Passenger passenger = passengerRepository.findById(id).get();
        for (Flight flight : passenger.getFlights()){
            flight.removePassenger(passenger);
            flightRepository.save(flight);
        }
        passengerRepository.deleteById(id);
    }





}
