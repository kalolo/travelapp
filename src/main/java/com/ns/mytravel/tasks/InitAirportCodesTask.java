package com.ns.mytravel.tasks;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitAirportCodesTask {

    public static void checkData() {

        System.out.println( InitAirportCodesTask.class + " :: " );

        try {

            ObjectMapper mapper  = new ObjectMapper();
            Airport[] airports   = mapper.readValue(new ClassPathXmlApplicationContext().getResource("classpath:airports.json").getInputStream(), Airport[].class);

            for ( Airport airport : airports ) {

                System.out.println(">> Airport: " + airport);

            }

            System.out.println( "Airports found: " + airports.length );

        } catch (Exception e){

            System.out.println(e.getMessage());
        }


    }


}
