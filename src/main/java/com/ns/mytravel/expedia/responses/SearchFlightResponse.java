package com.ns.mytravel.expedia.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ns.mytravel.expedia.entities.City;
import com.ns.mytravel.expedia.entities.Leg;
import com.ns.mytravel.expedia.entities.Offer;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchFlightResponse {


    private List<Leg> legs;
    private List<Offer> offers;
    private String obFeesDetails;
    private String activityId;
    private String deepLinkUrl;
    private List<City> searchCities;


    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public String getObFeesDetails() {
        return obFeesDetails;
    }

    public void setObFeesDetails(String obFeesDetails) {
        this.obFeesDetails = obFeesDetails;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getDeepLinkUrl() {
        return deepLinkUrl;
    }

    public void setDeepLinkUrl(String deepLinkUrl) {
        this.deepLinkUrl = deepLinkUrl;
    }

    public void setSearchCities( List<City> cities) {
        this.searchCities = cities;
    }

    public List<City> getSearchCities() {
        return this.searchCities;
    }
}
