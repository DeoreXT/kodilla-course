package com.kodilla.good.patterns.challenges.challange2;

public class SearchFlightDto {
    private City cityFrom;
    private City cityTo;
    private boolean isFound;

    public SearchFlightDto(City cityFrom, City cityTo, boolean isFound) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.isFound = isFound;
    }

    public City getCityFrom() {
        return cityFrom;
    }

    public City getCityTo() {
        return cityTo;
    }

    public boolean isFound() {
        return isFound;
    }
}
