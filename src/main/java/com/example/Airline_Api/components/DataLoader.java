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

        Passenger passenger1 = new Passenger("Zaynah", 1234567919);
        passengerRepository.save(passenger1);

        Flight Australia = new Flight("Australia", 350, "17/03/23", "9am");
        flightRepository.save(Australia);

        Flight Indonesia = new Flight("Indonesia", 900, "21/05/25", "10pm");
        flightRepository.save(Indonesia);


        Passenger passenger2 = new Passenger("Anna", 1234567919);
        passengerRepository.save(passenger2);

        Flight dubaiFlight = new Flight("Tuvalu", 120, "19/09/23", "7pm");
        flightRepository.save(dubaiFlight);

        Flight franceFlight = new Flight("Brazil", 700, "10/08/25", "10am");
        flightRepository.save(franceFlight);


        Passenger passenger3 = new Passenger("Zsolt", 1234567919);
        passengerRepository.save(passenger3);

        Flight Las_Vegas = new Flight("Las Vegas", 780, "10/10/23", "1pm");
        flightRepository.save(Las_Vegas);

        Australia.addPassenger(passenger1);
        Las_Vegas.addPassenger(passenger1);
        Indonesia.addPassenger(passenger2);
        Indonesia.addPassenger(passenger3);
        Las_Vegas.addPassenger(passenger2);

        flightRepository.save(Indonesia);
        flightRepository.save(Australia);
        flightRepository.save(Indonesia);
    }

}

