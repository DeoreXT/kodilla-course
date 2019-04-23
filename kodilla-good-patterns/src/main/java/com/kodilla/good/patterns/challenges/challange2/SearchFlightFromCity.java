package com.kodilla.good.patterns.challenges.challange2;

public class SearchFlightFromCity implements SearchFlight {
    @Override
    public boolean Search(City cityFrom) {
        System.out.println("Found flight from " + cityFrom.getCity());
        return true;
    }
}
