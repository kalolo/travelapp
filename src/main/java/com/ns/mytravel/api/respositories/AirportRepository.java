package com.ns.mytravel.api.respositories;

import com.ns.mytravel.api.entities.Airport;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AirportRepository extends MongoRepository<Airport, String> {

    //public List<Airport> findAll();
    public Airport findByCode(String code);

}