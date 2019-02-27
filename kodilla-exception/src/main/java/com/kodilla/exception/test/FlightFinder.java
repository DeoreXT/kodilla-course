package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public Flight findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airportAvailability = new HashMap<String, Boolean>();
        boolean arrivalAirport = false, departureAirport = false;
        for (Map.Entry<String, Boolean> aa : airportAvailability.entrySet()) {
            if (flight.getArrivalAirport() == aa.getKey() && aa.getValue() == true) arrivalAirport = true;
            if (flight.getDepartureAirport() == aa.getKey() && aa.getValue() == true) departureAirport = true;
        }
        if (!arrivalAirport || !departureAirport) throw new RouteNotFoundException();
        return flight;
    }
}
