package com.kodilla.good.patterns.challenges.flight;

import java.util.Optional;

public final class Flight {
    private final String departureAirport;
    private final Optional<String> transferAirport;
    private final String arrivalAirport;

    public Flight(String departureAirport, Optional<String> transferAirport, String arrivalAirport){
        this.departureAirport = departureAirport;
        this.transferAirport = transferAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Optional<String> getTransferAirport() {
        return transferAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + transferAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departureAirport.equals(flight.departureAirport)) return false;
        if (!transferAirport.equals(flight.transferAirport)) return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
return "Flight{" +
        "departureAirport='" + departureAirport + '\'' +
            ", transferAirport=" + transferAirport +
            ", arrivalAirport='" + arrivalAirport + '\'' +
            '}';
    }

}
