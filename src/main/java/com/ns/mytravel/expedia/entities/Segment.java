package com.ns.mytravel.expedia.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Segment {

    private String departureTime;
    private Integer departureTimeEpochSeconds;
    private String departureTimeRaw;
    private Integer departureTimeZoneOffsetSeconds;
    private String arrivalTime;
    private Integer arrivalTimeEpochSeconds;
    private String arrivalTimeRaw;
    private Integer arrivalTimeZoneOffsetSeconds;
    private String arrivalAirportCode;
    private String arrivalAirportLocation;
    private AirportAddress arrivalAirportAddress;
    private String airlineName;
    private String airlineCode;
    private String externalAirlineCode;
    private String flightNumber;
    private String onTimePercentage;
    private String equipmentCode;
    private String equipmentDescription;
    private String duration;
    private int distance;
    private String distanceUnits;
    private int stops;
    private boolean hasSeatMap;

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getDepartureTimeEpochSeconds() {
        return departureTimeEpochSeconds;
    }

    public void setDepartureTimeEpochSeconds(Integer departureTimeEpochSeconds) {
        this.departureTimeEpochSeconds = departureTimeEpochSeconds;
    }

    public String getDepartureTimeRaw() {
        return departureTimeRaw;
    }

    public void setDepartureTimeRaw(String departureTimeRaw) {
        this.departureTimeRaw = departureTimeRaw;
    }

    public Integer getDepartureTimeZoneOffsetSeconds() {
        return departureTimeZoneOffsetSeconds;
    }

    public void setDepartureTimeZoneOffsetSeconds(Integer departureTimeZoneOffsetSeconds) {
        this.departureTimeZoneOffsetSeconds = departureTimeZoneOffsetSeconds;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getArrivalTimeEpochSeconds() {
        return arrivalTimeEpochSeconds;
    }

    public void setArrivalTimeEpochSeconds(Integer arrivalTimeEpochSeconds) {
        this.arrivalTimeEpochSeconds = arrivalTimeEpochSeconds;
    }

    public String getArrivalTimeRaw() {
        return arrivalTimeRaw;
    }

    public void setArrivalTimeRaw(String arrivalTimeRaw) {
        this.arrivalTimeRaw = arrivalTimeRaw;
    }

    public Integer getArrivalTimeZoneOffsetSeconds() {
        return arrivalTimeZoneOffsetSeconds;
    }

    public void setArrivalTimeZoneOffsetSeconds(Integer arrivalTimeZoneOffsetSeconds) {
        this.arrivalTimeZoneOffsetSeconds = arrivalTimeZoneOffsetSeconds;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    public String getArrivalAirportLocation() {
        return arrivalAirportLocation;
    }

    public void setArrivalAirportLocation(String arrivalAirportLocation) {
        this.arrivalAirportLocation = arrivalAirportLocation;
    }

    public AirportAddress getArrivalAirportAddress() {
        return arrivalAirportAddress;
    }

    public void setArrivalAirportAddress(AirportAddress arrivalAirportAddress) {
        this.arrivalAirportAddress = arrivalAirportAddress;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getExternalAirlineCode() {
        return externalAirlineCode;
    }

    public void setExternalAirlineCode(String externalAirlineCode) {
        this.externalAirlineCode = externalAirlineCode;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOnTimePercentage() {
        return onTimePercentage;
    }

    public void setOnTimePercentage(String onTimePercentage) {
        this.onTimePercentage = onTimePercentage;
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public String getEquipmentDescription() {
        return equipmentDescription;
    }

    public void setEquipmentDescription(String equipmentDescription) {
        this.equipmentDescription = equipmentDescription;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDistanceUnits() {
        return distanceUnits;
    }

    public void setDistanceUnits(String distanceUnits) {
        this.distanceUnits = distanceUnits;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public boolean isHasSeatMap() {
        return hasSeatMap;
    }

    public void setHasSeatMap(boolean hasSeatMap) {
        this.hasSeatMap = hasSeatMap;
    }
}