package com.ns.mytravel.expedia.services;

import com.ns.mytravel.expedia.config.ExpediaConfig;
import com.ns.mytravel.expedia.responses.SearchFlightResponse;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ExpediaApi {

    private static Logger logger = LoggerFactory.getLogger(ExpediaApi.class);

    public static SearchFlightResponse searchFlight(String from, String to, String dateStart) {

        String fromAirport = from;
        String toAirport   = to;

        RestTemplate restTemplate = new RestTemplate();

        //TODO: Catch 401 ..
        String restUri = UriComponentsBuilder.fromHttpUrl( ExpediaConfig.getApiUrl() )
                .queryParam("departureAirport", fromAirport)
                .queryParam("arrivalAirport", toAirport)
                .queryParam("departureDate", "2016-07-08")
                .queryParam("apikey", ExpediaConfig.getApiKey() )
                .build().toString();


        logger.info("Request to uri:" + restUri);

        SearchFlightResponse responseExpedia = restTemplate.getForObject(restUri, SearchFlightResponse.class);

        return responseExpedia;
    }

}
