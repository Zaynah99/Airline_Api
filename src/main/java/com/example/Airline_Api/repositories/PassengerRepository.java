package com.example.Airline_Api.repositories;

import com.example.Airline_Api.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {


}
