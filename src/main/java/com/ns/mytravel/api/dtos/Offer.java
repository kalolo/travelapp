package com.ns.mytravel.api.dtos;

/**
 * Created by clopez on 6/22/16.
 */
public class Offer {

    private String legId;
    private String currency;
    private String price;

    public String getLegId() {
        return legId;
    }

    public void setLegId(String legId) {
        this.legId = legId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
