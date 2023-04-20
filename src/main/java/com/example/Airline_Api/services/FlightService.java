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
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerService passengerService;



    public Flight saveFlight(FlightDTO flightDTO) {
        Flight flight = new Flight(flightDTO.getDestination(), flightDTO.getCapacity(), flightDTO.getDepartureDate(), flightDTO.getDepartureTime());
        for (Long passengerId :flightDTO.getPassengerIds()){
            Passenger passenger = passengerService.findPassenger(passengerId);
            flight.addPassenger(passenger);
        }
        return flightRepository.save(flight);
    }


    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}



