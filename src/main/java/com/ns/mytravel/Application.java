package com.ns.mytravel;

import com.ns.mytravel.tasks.InitAirportCodesTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;



@SpringBootApplication
@RestController
@EnableScheduling
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        InitAirportCodesTask.checkData();

    }

}
