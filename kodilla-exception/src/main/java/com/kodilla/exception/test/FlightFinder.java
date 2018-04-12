package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfAvailableAirports = new HashMap<String, Boolean>();
        mapOfAvailableAirports.put("El Prat", true);
        mapOfAvailableAirports.put("Warsaw Chopin", false);
        mapOfAvailableAirports.put("Mediolan", true);
        mapOfAvailableAirports.put("Rzeszow", true);
        mapOfAvailableAirports.put("Bydgoszcz", true);

        if ((!mapOfAvailableAirports.containsKey(flight.getArrivalAirport())))
            throw new RouteNotFoundException();
        else {
            if (mapOfAvailableAirports.get(flight.getArrivalAirport()))
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");
            else
                System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is unavailable.");
        }
    }
}
