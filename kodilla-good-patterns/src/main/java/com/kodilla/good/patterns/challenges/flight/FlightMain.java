package com.kodilla.good.patterns.challenges.flight;

import java.util.Map;
import java.util.Optional;

public class FlightMain {
    public static main(String[] args){

        String departureAirport = " Warsaw - WAW";
        Optional<String> transferAirport = Optional.ofNullable("Gdansk - GDA");
        String arrivalAirport = "Kiev - IEV"

        Flight flight = new Flight(departureAirport, transferAirport, arrivalAirport);
        FlightFinder flightFinder = new FlightFinder();

        Map<Integer, Flight> mapOfAvailableFlights = getMapOfAvailableFlights();

        flightFinder.flightWithTransferAirport(flight, mapOfAvailableFlights);
        flightFinder.flightFrom(departureAirport, mapOfAvailableFlights);
        flightFinder.flightTo(arrivalAirport, mapOfAvailableFlights);
    }

}
