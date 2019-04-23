package com.kodilla.good.patterns.challenges.challange2;

public class FlightSearchService {
    private SearchFlight searchFlight;

    public FlightSearchService(final SearchFlight searchFlight) {
        this.searchFlight = searchFlight;
    }

    public SearchFlightDto process(final FlightRequest flightRequest) {
        boolean isFound = searchFlight.Search(flightRequest.getFromCity());

        if (isFound) {
            return new SearchFlightDto(flightRequest.getFromCity(), flightRequest.getToCity(), true);
        } else {
            return new SearchFlightDto(flightRequest.getFromCity(), flightRequest.getToCity(), false);
        }
    }
}
