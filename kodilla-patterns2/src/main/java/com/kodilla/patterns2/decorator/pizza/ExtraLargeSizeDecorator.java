package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraLargeSizeDecorator extends AbstractPizzaOrderDecorator {
    public ExtraLargeSizeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " also will be in extra large size.";
    }
}
