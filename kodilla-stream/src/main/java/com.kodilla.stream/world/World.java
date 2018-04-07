package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public final class World {
    private final List<Continent> continents;

    public World(List<Continent> continents){
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

               /* obliczy za pomoca ponizszych liczbe ludnosci krajow na kontynentach
               flatMap()
                        reduce()*/
    }
}
