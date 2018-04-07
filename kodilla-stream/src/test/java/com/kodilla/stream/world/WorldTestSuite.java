package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", new BigDecimal(9));
        Country thailand = new Country("Thailand", new BigDecimal(25));
        Country philipines = new Country("Philipines", new BigDecimal(8));
        Country spain = new Country("Spain", new BigDecimal(5));

        Continent asia = new Continent("Asia", Arrays.asList(thailand, philipines));
        Continent europe = new Continent("Europe", Arrays.asList(poland, spain));

        World world = new World(Arrays.asList(asia, europe));

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("47"), peopleQuantity);
    }
}

