package com.ns.mytravel.api.controllers;

import com.ns.mytravel.api.dtos.FlightOffer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ns.mytravel.expedia.services.ExpediaApi;
import com.ns.mytravel.expedia.entities.Leg;
import com.ns.mytravel.expedia.entities.Segment;
import com.ns.mytravel.expedia.responses.SearchFlightResponse;

import com.ns.mytravel.api.dtos.Offer;


@RestController
public class SearchFlightController {

    private static Logger logger = LoggerFactory.getLogger(SearchFlightController.class);

    @CrossOrigin
    @RequestMapping("/api/flight/search/{from}/{to}")
    public FlightOffer search(@PathVariable("from") String from, @PathVariable("to") String to ) {



        logger.info(">> Params: from:" + from + " to: " + to);
        SearchFlightResponse responseExpedia = ExpediaApi.searchFlight("LAX", "PHX", "2016-07-01");

        FlightOffer offerResponse = new FlightOffer();
        offerResponse.setTitle( responseExpedia.getSearchCities().stream().map( (c) -> c.toString() ).collect(Collectors.joining(" / ")) )  ;

        Map<String, Leg> expediaLegs;// = new HashMap<>();
        expediaLegs = responseExpedia.getLegs().stream().collect(
                Collectors.toMap( Leg::getLegId, (l) -> l)
        );

        for ( Leg leg : responseExpedia.getLegs() ) {

            //logger.info( "Leg: " +  leg );
            //logger.info( "   Segments: " + leg.getSegments().size() );

            if ( leg.getSegments().size() > 0 ) {

                for (Segment seg : leg.getSegments()) {
                  //  logger.info( "         - Arriving at:" + seg.getArrivalAirportCode() );
                }

            }

        }


         return offerResponse;
    }

}
