package com.kodilla.good.patterns.challenges.challange2;

public class SearchFlightToCity implements SearchFlight{
    @Override
    public boolean Search(City cityTo) {
        System.out.println("Found flight to " + cityTo.getCity());
        return true;
    }
}
