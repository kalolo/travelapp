package com.ns.mytravel.api.dtos;

import java.util.List;

public class FlightOffer {


    private List<Offer> offers;
    private String title;

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
