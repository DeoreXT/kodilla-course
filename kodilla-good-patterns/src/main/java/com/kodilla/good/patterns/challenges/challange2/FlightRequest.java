package com.kodilla.good.patterns.challenges.challange2;

public class FlightRequest {
    private City fromCity;
    private City toCity;

    public FlightRequest(City fromCity, City toCity) {
        this.fromCity = fromCity;
        this.toCity = toCity;
    }

    public City getFromCity() {
        return fromCity;
    }

    public City getToCity() {
        return toCity;
    }
}
