package edu.bu.met.cs665.factory;

import edu.bu.met.cs665.strategy.BusinessEmailStrategy;
import edu.bu.met.cs665.strategy.EmailStrategy;

public class BusinessEmailFactory extends EmailStrategyFactory {
    @Override
    public EmailStrategy createStrategy() {
        return new BusinessEmailStrategy();
    }
}
