package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String args[]) {
        Flight flight = new Flight("Tokyo", "Warszawa");
        try {
            FlightFinder ff = new FlightFinder();
            ff.findFlight(flight);
        }
        catch (RouteNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
