package com.kodilla.good.patterns.challenges.flight;

public final class Airport {
    private final String airport;

    public Airport(final String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport1 = (Airport) o;

        return airport.equals(airport1.airport);
    }

    @Override
    public int hashCode() {
        return airport.hashCode();
    }
}