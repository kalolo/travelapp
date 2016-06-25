package com.ns.mytravel.tasks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ns.mytravel.api.entities.Airport;
import com.ns.mytravel.api.respositories.AirportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

    Logger logger = LoggerFactory.getLogger(ApplicationStartup.class);

    @Autowired
    AirportRepository airportRepository;

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {

        if ( airportRepository.count() <= 0 ) {

            logger.info(" Importing airport codes!!!");


            try {

                ObjectMapper mapper = new ObjectMapper();
                Airport[] airports = mapper.readValue(new ClassPathXmlApplicationContext().getResource("classpath:airports.json").getInputStream(), Airport[].class);

                logger.info(" Importing ["+airports.length+"] ...." );

                for (Airport airport : airports) {

                    airportRepository.save(airport);

                }

            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }

        logger.info(" Airport codes: " + airportRepository.count() );
    }
}