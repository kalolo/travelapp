package com.ns.mytravel.api.service;

import com.ns.mytravel.api.entities.Airport;
import com.ns.mytravel.api.respositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    AirportRepository airportRepository;


    public List<Airport> findAll() {
        return airportRepository.findAll();
    }

    public long count() {
        return airportRepository.count();
    }

}
