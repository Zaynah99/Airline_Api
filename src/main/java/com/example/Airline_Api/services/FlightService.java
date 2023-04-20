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
    PassengerRepository passengerRepository;


////    SAVING FLIGHT
//    public void saveFlight(Flight flight){
//        flightRepository.save(flight);
//    }

//    FIND FLIGHT
    public Flight findFlight(Long id){
        return flightRepository.findById(id).get();
    }

//    FIND ALL FLIGHTS
    public List<Flight> findAllFlights(){
        return flightRepository.findAll();
    }

//    DELETE FLIGHTS

//    public void deleteFlight(Long id) {
//        Flight flight = flightRepository.findById(id).get();
//        for (Passenger passenger : flight.getPassengers()){
//            passenger.removeFlight(flight);
//            PassengerRepository.save(passenger);
//        }
//        flightRepository.deleteById(id);
//    }


//    public Passenger savePassenger (FlightDTO flightDTO) {
////     CREATE PASSENGER OBJECT FROM DTO
//        Passenger passenger = new Passenger(FlightDTO.getName(), FlightDTO.getPhoneNumber());
//    }


}
