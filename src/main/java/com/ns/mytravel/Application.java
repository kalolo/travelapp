package com.ns.mytravel;

import com.ns.mytravel.tasks.InitAirportCodesTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
public class Application {

    @Autowired
    InitAirportCodesTask airportChecks;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
