package com.kodilla.good.patterns.challenges.flight;


import java.util.*;
import java.util.stream.Collectors;

public final class FlightFinder {

    private final Map<String, List<String>> flightMap = new HashMap<>();

    public FlightFinder(){
        flightMap.put("Warsaw - WAW", Arrays.asList("Gdansk - GDA","Kiev - IEV", "Stockholm-Arlanda - ARN"));
        flightMap.put("Gdansk - GDA", Arrays.asList( "Warsaw - WAW", "Stockholm-Arlanda - ARN"));
        flightMap.put("Kiev - IEV", Arrays.asList("Warsaw - WAW", "Krakow - KRK"));
        flightMap.put("Krakow - KRK", Arrays.asList( "Kiev - IEV", "Warsaw - WMI"));
        flightMap.put("Warsaw - WMI",Arrays.asList("Krakow - KRK", "Gdansk - GDA"));
        flightMap.put("Gdansk -GDA",Arrays.asList("Stockholm-Arlanda - ARN", "Warsaw - WMI"));
    }

    public void flightFrom(Airport departureAirport) {
        String flightsFrom = flightMap.entrySet().stream()
                .filter(f -> f.getKey().equals(departureAirport.getAirport()))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.joining(", "));
        System.out.println("From " + departureAirport.getAirport() + " you can fly to" + ": " + flightsFrom);
    }


    public void flightTo(Airport arrivalAirport) {
        String flightsTo = flightMap.entrySet().stream()
                .filter(f -> f.getValue().contains(arrivalAirport.getAirport()))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        System.out.println("To " + arrivalAirport.getAirport() + " you can fly from" + ": " + flightsTo);
    }


    public void flightThrough(Airport departureAirport, Airport arrivalAirport) {
        String flightsVia = flightMap.entrySet().stream()
                .filter(f -> f.getValue().contains(departureAirport.getAirport()))
                .filter(f -> f.getValue().contains(arrivalAirport.getAirport()))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(", "));
        System.out.println("From " + departureAirport.getAirport() + " to " + arrivalAirport.getAirport() + " you can fly via" + ": " + flightsVia);
    }

}
