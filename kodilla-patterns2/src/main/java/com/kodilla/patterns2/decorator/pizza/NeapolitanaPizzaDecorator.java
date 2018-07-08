package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class NeapolitanaPizzaDecorator extends AbstractPizzaOrderDecorator{
    public NeapolitanaPizzaDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(35));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " and additional ingredients: black olives, jalapeño, salami";
    }
}
