package com.kodilla.good.patterns.challenges.challange2;

public class SearchFlightThroughtCity implements SearchFlight{
    @Override
    public boolean Search(City cityThrought) {
        System.out.println("Found flight by " + cityThrought.getCity());
        return true;
    }
}
