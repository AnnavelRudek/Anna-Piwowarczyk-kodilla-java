package com.kodilla.exception.test;

public class FlightFinderPlanner {
    public static void main(String[] args){

        Flight flight = new Flight("El Prat", "Warsaw Modlin");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);

        } catch (RouteNotFoundException e){
            System.out.println(flight.getArrivalAirport() + " Airport is unavailable in the system now.");
        }
    }
}