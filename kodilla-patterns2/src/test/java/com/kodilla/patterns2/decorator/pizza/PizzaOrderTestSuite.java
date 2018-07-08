package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrder(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getDescription() + " you will pay: " + theOrder.getCost() + " zlotych.");

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), calculatedCost);

    }

    @Test
    public void testExtraLargePizzaOrder(){
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiPizzaDecorator(theOrder);
        theOrder = new ExtraLargeSizeDecorator(theOrder);
        System.out.println(theOrder.getDescription());

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Your pizza contains cheese, sauce, regular dough and additional ingredients: ham and pineapple also will be in extra large size.", description);
    }

}
