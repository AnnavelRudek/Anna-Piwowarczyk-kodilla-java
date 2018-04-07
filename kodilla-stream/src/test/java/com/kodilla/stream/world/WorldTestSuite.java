package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("poland", new BigDecimal(9));
        Country thailand = new Country("thailand", new BigDecimal(25));
        Country philipines = new Country("philipines", new BigDecimal(8));
        Country spain = new Country("spain", new BigDecimal(5));

        Continent asia = new Continent("asia", Arrays.asList(thailand, philipines));
        Continent europe = new Continent("europe", Arrays.asList(poland, spain));

        World world = new World(Arrays.asList(asia, europe));

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new

                BigDecimal("47"), peopleQuantity);
    }
}

