package com.ns.mytravel.tasks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns.mytravel.api.respositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ns.mytravel.api.entities.Airport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class InitAirportCodesTask {

    @Autowired
    private AirportRepository airportRepository;


    public void checkData() {




    }


}
