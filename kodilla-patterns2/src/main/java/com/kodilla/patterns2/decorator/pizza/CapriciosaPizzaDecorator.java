package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CapriciosaPizzaDecorator extends AbstractPizzaOrderDecorator {
    public CapriciosaPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(39));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and additional ingredients: ham, champignones";
    }

}
