package com.example.Airline_Api.components;

import com.example.Airline_Api.models.Flight;
import com.example.Airline_Api.models.Passenger;
import com.example.Airline_Api.repositories.FlightRepository;
import com.example.Airline_Api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

//   DEFAULT CONSTRUCTOR
    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Passenger natashaPassenger = new Passenger("Natasha", 1234567919);
        passengerRepository.save(natashaPassenger);

        Flight englandFlight = new Flight("England", 200, "21/04/23", "12pm");
        flightRepository.save(englandFlight);

        Flight spainFlight = new Flight("Spain", 400, "09/05/23", "1pm");
        flightRepository.save(spainFlight);


        Passenger johnPassenger = new Passenger("John", 1234567919);
        passengerRepository.save(johnPassenger);

        Flight dubaiFlight = new Flight("Dubai", 1200, "26/04/23", "8am");
        flightRepository.save(dubaiFlight);

        Flight franceFlight = new Flight("France", 600, "09/06/23", "7am");
        flightRepository.save(franceFlight);


        Passenger samPassenger = new Passenger("Sam", 1234567919);
        passengerRepository.save(samPassenger);

        Flight japanFlight = new Flight("Japan", 2000, "10/09/23", "9am");
        flightRepository.save(japanFlight);

        englandFlight.addPassenger(natashaPassenger);
        japanFlight.addPassenger(natashaPassenger);
        spainFlight.addPassenger(johnPassenger);
        spainFlight.addPassenger(samPassenger);

        japanFlight.addPassenger(johnPassenger);

        flightRepository.save(englandFlight);
        flightRepository.save(spainFlight);
        flightRepository.save(japanFlight);
    }

}

