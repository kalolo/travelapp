package com.ns.mytravel.expedia.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.ZonedDateTime;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FreeCancellationBy {

    private String raw;
    private String localized;
    private int    epochSeconds;
    private int    timeZoneOffsetSeconds;
    private String localizedShortDate;


    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getLocalized() {
        return localized;
    }

    public void setLocalized(String localized) {
        this.localized = localized;
    }

    public int getEpochSeconds() {
        return epochSeconds;
    }

    public void setEpochSeconds(int epochSeconds) {
        this.epochSeconds = epochSeconds;
    }

    public int getTimeZoneOffsetSeconds() {
        return timeZoneOffsetSeconds;
    }

    public void setTimeZoneOffsetSeconds(int timeZoneOffsetSeconds) {
        this.timeZoneOffsetSeconds = timeZoneOffsetSeconds;
    }

    public String getLocalizedShortDate() {
        return localizedShortDate;
    }

    public void setLocalizedShortDate(String localizedShortDate) {
        this.localizedShortDate = localizedShortDate;
    }


    public ZonedDateTime getTime() {

        return ZonedDateTime.parse( this.raw );

    }


}
