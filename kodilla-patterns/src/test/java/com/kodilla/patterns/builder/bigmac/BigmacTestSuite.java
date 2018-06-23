package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBicMac() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("Sezame bun")
                .sauce("Hot")
                .ingredient("Pickles")
                .burgers(3)
                .ingredient("Onion")
                .ingredient("Tomato")
                .ingredient("Lettuce")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);

    }

    @Test
    public void testBurgers() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("Roll")
                .sauce("Hot")
                .burgers(3)
                .ingredient("Onion")
                .ingredient("Tomato")
                .ingredient("Lettuce")
                .build();
        System.out.println(bigmac);

        //When
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(3, howManyBurgers);
    }

}
