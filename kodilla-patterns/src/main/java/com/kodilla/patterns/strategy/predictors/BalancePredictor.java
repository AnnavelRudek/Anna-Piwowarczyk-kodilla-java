package com.kodilla.patterns.strategy.predictors;

import com.kodilla.patterns.strategy.BuyPredictor;

public class BalancePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy(){
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }

}
