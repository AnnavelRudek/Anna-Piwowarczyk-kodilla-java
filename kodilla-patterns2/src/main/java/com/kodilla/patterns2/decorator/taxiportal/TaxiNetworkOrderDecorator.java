package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class TaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public TaxiNetworkOrderDecorator(TaxiOrder taxiOrder){
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost(){
        //hardcored stub cost 35 -> wpisane na sztywno dla przykładu
        return super.getCost().add(new BigDecimal(35));
    }

    // doklejenie do podstawowego tekstu "Drive a course..."
    @Override
    public String getDescription(){
        return super.getDescription() + " by Taxi Network";
    }

}
