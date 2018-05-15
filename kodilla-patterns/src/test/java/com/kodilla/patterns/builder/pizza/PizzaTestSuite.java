package com.kodilla.patterns.builder.pizza;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew(){
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("onion")
                .bottom("Thin")
                .sauce("Spicy")
                .ingredient("Ham")
                .ingredient("mushroom")
                .build();
        System.out.println(pizza);

        //When
        int howManyIngredients = pizza.getIngredients().size();

        //Then
        Assert.assertEquals(3, howManyIngredients);
    }

}
