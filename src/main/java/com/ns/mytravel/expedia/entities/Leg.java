package com.ns.mytravel.expedia.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Leg {

    private String legId;
    private String baggageFeesUrl;
    private List<Segment> segments;
    private FreeCancellationBy freeCancellationBy;

    public Leg() {

    }

    public Leg(String legid, String baggageFeesUrl, List<Segment> segments, FreeCancellationBy freeCancellationBy) {
        this.legId = legid;
        this.baggageFeesUrl = baggageFeesUrl;
        this.segments = segments;
        this.freeCancellationBy = freeCancellationBy;
    }


    public String getLegId() {
        return legId;
    }

    public void setLegId(String legId) {
        this.legId = legId;
    }

    public String getBaggageFeesUrl() {
        return baggageFeesUrl;
    }

    public void setBaggageFeesUrl(String baggageFeesUrl) {
        this.baggageFeesUrl = baggageFeesUrl;
    }

    public FreeCancellationBy getFreeCancellationBy() {
        return freeCancellationBy;
    }

    public void setFreeCancellationBy(FreeCancellationBy freeCancellationBy) {
        this.freeCancellationBy = freeCancellationBy;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }


    @Override
    public String toString() {
        return this.legId + " " + this.baggageFeesUrl;
    }



}


