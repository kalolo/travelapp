package com.ns.mytravel.expedia.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Offer {

    private List<String> legIds;
    private String currency;
    private String baseFare;
    private String totalFare;
    private Integer seatsRemaining;


    public List<String> getLegIds() {
        return legIds;
    }

    public void setLegIds(List<String> legIds) {
        this.legIds = legIds;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(String baseFare) {
        this.baseFare = baseFare;
    }

    public String getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(String totalFare) {
        this.totalFare = totalFare;
    }

    public Integer getSeatsRemaining() {
        return seatsRemaining;
    }

    public void setSeatsRemaining(Integer seatsRemaining) {
        this.seatsRemaining = seatsRemaining;
    }
}
