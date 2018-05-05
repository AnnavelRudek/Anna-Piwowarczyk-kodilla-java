package com.kodilla.good.patterns.challenges.flight;


public class FlightMain {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();

        Airport departureAirport = new Airport("Warsaw - WAW");
        Airport arrivalAirport = new Airport("Stockholm-Arlanda - ARN");


        flightFinder.flightFrom(departureAirport);
        flightFinder.flightThrough(departureAirport, arrivalAirport);
        flightFinder.flightTo(arrivalAirport);
    }

}
